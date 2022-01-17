package top.lanscarlos.skyflight.utils

import taboolib.common5.FileWatcher
import java.io.File

private val files = mutableSetOf<File>()

fun File.addListener(record: Boolean = true, runnable: Runnable) {
    if (this in files) return
    if (record) files += this
    FileWatcher.INSTANCE.addSimpleListener(this, runnable)
}

fun File.removeListener() {
    if (this !in files) return
    FileWatcher.INSTANCE.removeListener(this)
}

fun clearFileListeners() {
    files.forEach {
        FileWatcher.INSTANCE.removeListener(it)
    }
    files.clear()
}