package com.clarisoft.libwhodb

import android.util.Log
import net.sqlcipher.database.SQLiteDatabase
import java.util.concurrent.Executors

private val IO_EXECUTOR = Executors.newSingleThreadExecutor()


fun log(s: String) {
    Log.d("whodb", s)
}

/**
 * Utility method to run blocks on a dedicated background thread, used for io/database work.
 */
fun runOnIoThread(f: () -> Unit) {
    IO_EXECUTOR.execute(f)
}


inline fun <T> SQLiteDatabase.transaction(
    body: SQLiteDatabase.() -> T
): T {
    beginTransaction()
    try {
        val result = body()
        setTransactionSuccessful()
        return result
    } finally {
        endTransaction()
    }
}
