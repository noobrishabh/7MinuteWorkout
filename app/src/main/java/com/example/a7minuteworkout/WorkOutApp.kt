package com.example.a7minuteworkout

import android.app.Application
import com.example.a7minuteworkout.HistoryDatabase

//Todo 6 create the application class
class WorkOutApp: Application() {

    val db: HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}