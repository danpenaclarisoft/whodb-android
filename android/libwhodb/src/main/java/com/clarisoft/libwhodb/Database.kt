package com.clarisoft.libwhodb

import android.content.Context
import net.sqlcipher.database.SQLiteDatabase

class Database {
    lateinit var mDb: SQLiteDatabase

    fun destroy() {
        mDb.close()
    }

    fun initSqlCipher(path: String, pass: CharArray, applicationContext: Context) {
        SQLiteDatabase.loadLibs(applicationContext)
        mDb = SQLiteDatabase.openOrCreateDatabase(path, pass, null)
    }

    fun execSQL(sql: String) {
        mDb.rawExecSQL(sql)
    }
}