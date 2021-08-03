/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.cli.jvm.compiler.jarfs

import com.intellij.openapi.util.SystemInfoRt
import java.nio.charset.StandardCharsets
import kotlin.experimental.and

class ByteArrayCharSequence @JvmOverloads constructor(
    private val myChars: ByteArray,
    private val myStart: Int = 0,
    private val myEnd: Int = myChars.size
) : CharSequence {

    override fun hashCode(): Int {
        error("Do not try computing hashCode ByteArrayCharSequence")
    }

    override fun equals(other: Any?): Boolean {
        error("Do not try comparing ByteArrayCharSequence")
    }

    override val length get() = myEnd - myStart

    override fun get(index: Int): Char {
        return (myChars[index + myStart] and 0xff.toByte()).toChar()
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
        return if (startIndex == 0 && endIndex == length) this else ByteArrayCharSequence(myChars, myStart + startIndex, myStart + endIndex)
    }

    override fun toString(): String {
        return String(myChars, myStart, length, StandardCharsets.ISO_8859_1)
    }

    val bytes: ByteArray
        get() = if (myStart == 0 && myEnd == myChars.size) myChars else myChars.copyOfRange(myStart, myEnd)

    companion object {
        /**
         * @return instance of [ByteArrayCharSequence] if the supplied string can be stored internally
         * as a byte array of 8-bit code points (for more compact representation); its `string` argument otherwise
         */
        fun convertToBytesIfPossible(string: CharSequence): CharSequence {
            if (SystemInfoRt.IS_AT_LEAST_JAVA9) return string // see JEP 254: Compact Strings
            if (string.isEmpty()) return ""
            if (string is ByteArrayCharSequence) return string
            val bytes = toBytesIfPossible(string)
            return if (bytes == null) string else ByteArrayCharSequence(bytes)
        }

        private fun toBytesIfPossible(seq: CharSequence): ByteArray? {
            val bytes = ByteArray(seq.length)

            for (i in bytes.indices) {
                val c = seq[i]
                if (c.toInt() and 0xff00 != 0) {
                    return null
                }
                bytes[i] = c.toByte()
            }

            return bytes
        }
    }
}
