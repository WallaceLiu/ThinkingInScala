package com.bdatacap.designPattern

import java.io.File

object Command {

  class MakeDir(name: String) {
    def createDir() {
      val dir = new File(name)
      dir.mkdir()
    }

    def deleteDir() {
      val dir = new File(name)
      dir.delete()
    }
  }

  def execute(makeDir: MakeDir) = {
    () => {
      makeDir.createDir()
    }
  }

  def undo(makeDir: MakeDir) = {
    () => {
      makeDir.deleteDir()
    }
  }

  def requestMakedir(askMakedir: () => Unit) = {
    askMakedir()
  }

  def main(args: Array[String]): Unit = {
    val makeDir = new MakeDir("tmp")

    val executeCommand = execute(makeDir)
    val undoCommand = undo(makeDir)

    requestMakedir(executeCommand)
    requestMakedir(undoCommand)
  }
}
