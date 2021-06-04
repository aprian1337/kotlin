/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners.ir.interpreter;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/interpreter")
@TestDataPath("$PROJECT_ROOT")
public class IrInterpreterAfterPsi2IrTestGenerated extends AbstractIrInterpreterAfterPsi2IrTest {
    @Test
    @TestMetadata("abstract1.kt")
    public void testAbstract1() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract1.kt");
    }

    @Test
    @TestMetadata("abstract2.kt")
    public void testAbstract2() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract2.kt");
    }

    @Test
    @TestMetadata("abstract3.kt")
    public void testAbstract3() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract3.kt");
    }

    @Test
    @TestMetadata("abstract4.kt")
    public void testAbstract4() throws Exception {
        runTest("compiler/testData/ir/interpreter/abstract4.kt");
    }

    @Test
    public void testAllFilesPresentInInterpreter() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true, "helpers");
    }

    @Test
    @TestMetadata("arrayClassCast.kt")
    public void testArrayClassCast() throws Exception {
        runTest("compiler/testData/ir/interpreter/arrayClassCast.kt");
    }

    @Test
    @TestMetadata("branches.kt")
    public void testBranches() throws Exception {
        runTest("compiler/testData/ir/interpreter/branches.kt");
    }

    @Test
    @TestMetadata("companionOverride.kt")
    public void testCompanionOverride() throws Exception {
        runTest("compiler/testData/ir/interpreter/companionOverride.kt");
    }

    @Test
    @TestMetadata("complexReturn.kt")
    public void testComplexReturn() throws Exception {
        runTest("compiler/testData/ir/interpreter/complexReturn.kt");
    }

    @Test
    @TestMetadata("composition.kt")
    public void testComposition() throws Exception {
        runTest("compiler/testData/ir/interpreter/composition.kt");
    }

    @Test
    @TestMetadata("copyReceivedValue.kt")
    public void testCopyReceivedValue() throws Exception {
        runTest("compiler/testData/ir/interpreter/copyReceivedValue.kt");
    }

    @Test
    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        runTest("compiler/testData/ir/interpreter/dataClass.kt");
    }

    @Test
    @TestMetadata("defaultArgs.kt")
    public void testDefaultArgs() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultArgs.kt");
    }

    @Test
    @TestMetadata("defaultEquals.kt")
    public void testDefaultEquals() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultEquals.kt");
    }

    @Test
    @TestMetadata("defaultHashCode.kt")
    public void testDefaultHashCode() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultHashCode.kt");
    }

    @Test
    @TestMetadata("defaultToString.kt")
    public void testDefaultToString() throws Exception {
        runTest("compiler/testData/ir/interpreter/defaultToString.kt");
    }

    @Test
    @TestMetadata("doWhileLoop.kt")
    public void testDoWhileLoop() throws Exception {
        runTest("compiler/testData/ir/interpreter/doWhileLoop.kt");
    }

    @Test
    @TestMetadata("elvis.kt")
    public void testElvis() throws Exception {
        runTest("compiler/testData/ir/interpreter/elvis.kt");
    }

    @Test
    @TestMetadata("enums1.kt")
    public void testEnums1() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums1.kt");
    }

    @Test
    @TestMetadata("enums2.kt")
    public void testEnums2() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums2.kt");
    }

    @Test
    @TestMetadata("enums3.kt")
    public void testEnums3() throws Exception {
        runTest("compiler/testData/ir/interpreter/enums3.kt");
    }

    @Test
    @TestMetadata("extensionReceiver.kt")
    public void testExtensionReceiver() throws Exception {
        runTest("compiler/testData/ir/interpreter/extensionReceiver.kt");
    }

    @Test
    @TestMetadata("fib.kt")
    public void testFib() throws Exception {
        runTest("compiler/testData/ir/interpreter/fib.kt");
    }

    @Test
    @TestMetadata("genericListOfPairs.kt")
    public void testGenericListOfPairs() throws Exception {
        runTest("compiler/testData/ir/interpreter/genericListOfPairs.kt");
    }

    @Test
    @TestMetadata("inKeyword.kt")
    public void testInKeyword() throws Exception {
        runTest("compiler/testData/ir/interpreter/inKeyword.kt");
    }

    @Test
    @TestMetadata("inlineReturn.kt")
    public void testInlineReturn() throws Exception {
        runTest("compiler/testData/ir/interpreter/inlineReturn.kt");
    }

    @Test
    @TestMetadata("innerClass.kt")
    public void testInnerClass() throws Exception {
        runTest("compiler/testData/ir/interpreter/innerClass.kt");
    }

    @Test
    @TestMetadata("instanceOf.kt")
    public void testInstanceOf() throws Exception {
        runTest("compiler/testData/ir/interpreter/instanceOf.kt");
    }

    @Test
    @TestMetadata("instanceOfWithTypeParameters.kt")
    public void testInstanceOfWithTypeParameters() throws Exception {
        runTest("compiler/testData/ir/interpreter/instanceOfWithTypeParameters.kt");
    }

    @Test
    @TestMetadata("interface.kt")
    public void testInterface() throws Exception {
        runTest("compiler/testData/ir/interpreter/interface.kt");
    }

    @Test
    @TestMetadata("interfaceDefault.kt")
    public void testInterfaceDefault() throws Exception {
        runTest("compiler/testData/ir/interpreter/interfaceDefault.kt");
    }

    @Test
    @TestMetadata("lambda.kt")
    public void testLambda() throws Exception {
        runTest("compiler/testData/ir/interpreter/lambda.kt");
    }

    @Test
    @TestMetadata("localFunction.kt")
    public void testLocalFunction() throws Exception {
        runTest("compiler/testData/ir/interpreter/localFunction.kt");
    }

    @Test
    @TestMetadata("localObject.kt")
    public void testLocalObject() throws Exception {
        runTest("compiler/testData/ir/interpreter/localObject.kt");
    }

    @Test
    @TestMetadata("logIntrinsic.kt")
    public void testLogIntrinsic() throws Exception {
        runTest("compiler/testData/ir/interpreter/logIntrinsic.kt");
    }

    @Test
    @TestMetadata("loop.kt")
    public void testLoop() throws Exception {
        runTest("compiler/testData/ir/interpreter/loop.kt");
    }

    @Test
    @TestMetadata("multipleOverridden.kt")
    public void testMultipleOverridden() throws Exception {
        runTest("compiler/testData/ir/interpreter/multipleOverridden.kt");
    }

    @Test
    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("compiler/testData/ir/interpreter/object.kt");
    }

    @Test
    @TestMetadata("objectOverride.kt")
    public void testObjectOverride() throws Exception {
        runTest("compiler/testData/ir/interpreter/objectOverride.kt");
    }

    @Test
    @TestMetadata("overrideDifferentName.kt")
    public void testOverrideDifferentName() throws Exception {
        runTest("compiler/testData/ir/interpreter/overrideDifferentName.kt");
    }

    @Test
    @TestMetadata("overrideExtension.kt")
    public void testOverrideExtension() throws Exception {
        runTest("compiler/testData/ir/interpreter/overrideExtension.kt");
    }

    @Test
    @TestMetadata("progressionFromClosedRange.kt")
    public void testProgressionFromClosedRange() throws Exception {
        runTest("compiler/testData/ir/interpreter/progressionFromClosedRange.kt");
    }

    @Test
    @TestMetadata("rangeTo.kt")
    public void testRangeTo() throws Exception {
        runTest("compiler/testData/ir/interpreter/rangeTo.kt");
    }

    @Test
    @TestMetadata("regex.kt")
    public void testRegex() throws Exception {
        runTest("compiler/testData/ir/interpreter/regex.kt");
    }

    @Test
    @TestMetadata("safeClassCast.kt")
    public void testSafeClassCast() throws Exception {
        runTest("compiler/testData/ir/interpreter/safeClassCast.kt");
    }

    @Test
    @TestMetadata("scopeFunctions.kt")
    public void testScopeFunctions() throws Exception {
        runTest("compiler/testData/ir/interpreter/scopeFunctions.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("compiler/testData/ir/interpreter/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("spreadOperator.kt")
    public void testSpreadOperator() throws Exception {
        runTest("compiler/testData/ir/interpreter/spreadOperator.kt");
    }

    @Test
    @TestMetadata("stringBuilder.kt")
    public void testStringBuilder() throws Exception {
        runTest("compiler/testData/ir/interpreter/stringBuilder.kt");
    }

    @Test
    @TestMetadata("stringConcatenation.kt")
    public void testStringConcatenation() throws Exception {
        runTest("compiler/testData/ir/interpreter/stringConcatenation.kt");
    }

    @Test
    @TestMetadata("superClass.kt")
    public void testSuperClass() throws Exception {
        runTest("compiler/testData/ir/interpreter/superClass.kt");
    }

    @Test
    @TestMetadata("unitResult.kt")
    public void testUnitResult() throws Exception {
        runTest("compiler/testData/ir/interpreter/unitResult.kt");
    }

    @Test
    @TestMetadata("vararg.kt")
    public void testVararg() throws Exception {
        runTest("compiler/testData/ir/interpreter/vararg.kt");
    }

    @Test
    @TestMetadata("variableShadowing.kt")
    public void testVariableShadowing() throws Exception {
        runTest("compiler/testData/ir/interpreter/variableShadowing.kt");
    }

    @Test
    @TestMetadata("variables.kt")
    public void testVariables() throws Exception {
        runTest("compiler/testData/ir/interpreter/variables.kt");
    }

    @Test
    @TestMetadata("withReceivers.kt")
    public void testWithReceivers() throws Exception {
        runTest("compiler/testData/ir/interpreter/withReceivers.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/collections")
    @TestDataPath("$PROJECT_ROOT")
    public class Collections {
        @Test
        public void testAllFilesPresentInCollections() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/collections"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("arrayConstructor.kt")
        public void testArrayConstructor() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/arrayConstructor.kt");
        }

        @Test
        @TestMetadata("arrayOf.kt")
        public void testArrayOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/arrayOf.kt");
        }

        @Test
        @TestMetadata("doubleArrayOf.kt")
        public void testDoubleArrayOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/doubleArrayOf.kt");
        }

        @Test
        @TestMetadata("doubleList.kt")
        public void testDoubleList() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/doubleList.kt");
        }

        @Test
        @TestMetadata("listOf.kt")
        public void testListOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/listOf.kt");
        }

        @Test
        @TestMetadata("mapOf.kt")
        public void testMapOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mapOf.kt");
        }

        @Test
        @TestMetadata("matrixArray.kt")
        public void testMatrixArray() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/matrixArray.kt");
        }

        @Test
        @TestMetadata("matrixList.kt")
        public void testMatrixList() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/matrixList.kt");
        }

        @Test
        @TestMetadata("mutableListOf.kt")
        public void testMutableListOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mutableListOf.kt");
        }

        @Test
        @TestMetadata("mutableMapOf.kt")
        public void testMutableMapOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mutableMapOf.kt");
        }

        @Test
        @TestMetadata("mutableSetOf.kt")
        public void testMutableSetOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/mutableSetOf.kt");
        }

        @Test
        @TestMetadata("sequenceOf.kt")
        public void testSequenceOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/sequenceOf.kt");
        }

        @Test
        @TestMetadata("setOf.kt")
        public void testSetOf() throws Exception {
            runTest("compiler/testData/ir/interpreter/collections/setOf.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/exceptions")
    @TestDataPath("$PROJECT_ROOT")
    public class Exceptions {
        @Test
        public void testAllFilesPresentInExceptions() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/exceptions"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("arithmeticExceptionThrow.kt")
        public void testArithmeticExceptionThrow() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionThrow.kt");
        }

        @Test
        @TestMetadata("arithmeticExceptionTryBlock.kt")
        public void testArithmeticExceptionTryBlock() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionTryBlock.kt");
        }

        @Test
        @TestMetadata("arithmeticExceptionTryCatchFinally.kt")
        public void testArithmeticExceptionTryCatchFinally() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/arithmeticExceptionTryCatchFinally.kt");
        }

        @Test
        @TestMetadata("classCastException.kt")
        public void testClassCastException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/classCastException.kt");
        }

        @Test
        @TestMetadata("commandsOutException.kt")
        public void testCommandsOutException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/commandsOutException.kt");
        }

        @Test
        @TestMetadata("divideByZero.kt")
        public void testDivideByZero() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/divideByZero.kt");
        }

        @Test
        @TestMetadata("exceptionFromWrapper.kt")
        public void testExceptionFromWrapper() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/exceptionFromWrapper.kt");
        }

        @Test
        @TestMetadata("exceptionWithCause.kt")
        public void testExceptionWithCause() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/exceptionWithCause.kt");
        }

        @Test
        @TestMetadata("getCauseMessage.kt")
        public void testGetCauseMessage() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/getCauseMessage.kt");
        }

        @Test
        @TestMetadata("multifileStackTrace.kt")
        public void testMultifileStackTrace() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/multifileStackTrace.kt");
        }

        @Test
        @TestMetadata("nullPointerException.kt")
        public void testNullPointerException() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/nullPointerException.kt");
        }

        @Test
        @TestMetadata("stackOverflow.kt")
        public void testStackOverflow() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/stackOverflow.kt");
        }

        @Test
        @TestMetadata("stackTrace.kt")
        public void testStackTrace() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/stackTrace.kt");
        }

        @Test
        @TestMetadata("tryFinally.kt")
        public void testTryFinally() throws Exception {
            runTest("compiler/testData/ir/interpreter/exceptions/tryFinally.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/generatedStdlib")
    @TestDataPath("$PROJECT_ROOT")
    public class GeneratedStdlib {
        @Test
        public void testAllFilesPresentInGeneratedStdlib() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/generatedStdlib"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("contains.kt")
        public void testContains() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/contains.kt");
        }

        @Test
        @TestMetadata("elementAtOrElse.kt")
        public void testElementAtOrElse() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/elementAtOrElse.kt");
        }

        @Test
        @TestMetadata("first.kt")
        public void testFirst() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/first.kt");
        }

        @Test
        @TestMetadata("joinToString.kt")
        public void testJoinToString() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/joinToString.kt");
        }

        @Test
        @TestMetadata("toList.kt")
        public void testToList() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/toList.kt");
        }

        @Test
        @TestMetadata("trim.kt")
        public void testTrim() throws Exception {
            runTest("compiler/testData/ir/interpreter/generatedStdlib/trim.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/jvm")
    @TestDataPath("$PROJECT_ROOT")
    public class Jvm {
        @Test
        public void testAllFilesPresentInJvm() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/jvm"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("classReference.kt")
        public void testClassReference() throws Exception {
            runTest("compiler/testData/ir/interpreter/jvm/classReference.kt");
        }

        @Test
        @TestMetadata("javaStatic.kt")
        public void testJavaStatic() throws Exception {
            runTest("compiler/testData/ir/interpreter/jvm/javaStatic.kt");
        }

        @Test
        @TestMetadata("kProperty2.kt")
        public void testKProperty2() throws Exception {
            runTest("compiler/testData/ir/interpreter/jvm/kProperty2.kt");
        }

        @Test
        @TestMetadata("parameterReference.kt")
        public void testParameterReference() throws Exception {
            runTest("compiler/testData/ir/interpreter/jvm/parameterReference.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/primitives")
    @TestDataPath("$PROJECT_ROOT")
    public class Primitives {
        @Test
        public void testAllFilesPresentInPrimitives() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/primitives"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("charMethods.kt")
        public void testCharMethods() throws Exception {
            runTest("compiler/testData/ir/interpreter/primitives/charMethods.kt");
        }

        @Test
        @TestMetadata("intMethods.kt")
        public void testIntMethods() throws Exception {
            runTest("compiler/testData/ir/interpreter/primitives/intMethods.kt");
        }

        @Test
        @TestMetadata("longMethods.kt")
        public void testLongMethods() throws Exception {
            runTest("compiler/testData/ir/interpreter/primitives/longMethods.kt");
        }

        @Test
        @TestMetadata("uInt.kt")
        public void testUInt() throws Exception {
            runTest("compiler/testData/ir/interpreter/primitives/uInt.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/proxy")
    @TestDataPath("$PROJECT_ROOT")
    public class Proxy {
        @Test
        public void testAllFilesPresentInProxy() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/proxy"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("customCharSequence.kt")
        public void testCustomCharSequence() throws Exception {
            runTest("compiler/testData/ir/interpreter/proxy/customCharSequence.kt");
        }

        @Test
        @TestMetadata("customEquals.kt")
        public void testCustomEquals() throws Exception {
            runTest("compiler/testData/ir/interpreter/proxy/customEquals.kt");
        }

        @Test
        @TestMetadata("proxyPair.kt")
        public void testProxyPair() throws Exception {
            runTest("compiler/testData/ir/interpreter/proxy/proxyPair.kt");
        }

        @Test
        @TestMetadata("superWrapper.kt")
        public void testSuperWrapper() throws Exception {
            runTest("compiler/testData/ir/interpreter/proxy/superWrapper.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/ir/interpreter/reference")
    @TestDataPath("$PROJECT_ROOT")
    public class Reference {
        @Test
        public void testAllFilesPresentInReference() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/ir/interpreter/reference"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @Test
        @TestMetadata("getClass.kt")
        public void testGetClass() throws Exception {
            runTest("compiler/testData/ir/interpreter/reference/getClass.kt");
        }

        @Test
        @TestMetadata("propertyReference.kt")
        public void testPropertyReference() throws Exception {
            runTest("compiler/testData/ir/interpreter/reference/propertyReference.kt");
        }
    }
}
