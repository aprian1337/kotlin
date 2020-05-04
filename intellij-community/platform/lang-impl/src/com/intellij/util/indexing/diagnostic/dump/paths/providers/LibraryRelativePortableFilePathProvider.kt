// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.util.indexing.diagnostic.dump.paths.providers

import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.LibraryOrderEntry
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.roots.libraries.LibraryUtil
import com.intellij.openapi.vfs.VfsUtilCore
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.indexing.diagnostic.dump.paths.PortableFilePath

object LibraryRelativePortableFilePathProvider : PortableFilePathProvider {
  override fun getRelativePortableFilePath(project: Project, virtualFile: VirtualFile): PortableFilePath.RelativePath? {
    val orderEntry = LibraryUtil.findLibraryEntry(virtualFile, project)
    if (orderEntry !is LibraryOrderEntry) return null
    val libraryName = orderEntry.libraryName
    if (libraryName == null) return null

    for (rootType in listOf(OrderRootType.CLASSES, OrderRootType.SOURCES)) {
      val inClassFiles = rootType == OrderRootType.CLASSES
      for ((rootIndex, rootFile) in orderEntry.getRootFiles(rootType).withIndex()) {
        val relativePath = VfsUtilCore.getRelativePath(virtualFile, rootFile)
        if (relativePath == null) continue
        return PortableFilePath.RelativePath(
          PortableFilePath.LibraryRoot(libraryName, rootIndex, inClassFiles),
          relativePath
        )
      }
    }
    return null
  }
}
