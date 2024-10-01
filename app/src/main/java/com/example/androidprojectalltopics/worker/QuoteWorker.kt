package com.example.androidprojectalltopics.worker

import android.annotation.SuppressLint
import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class QuoteWorker(
    private val context : Context,
    params : WorkerParameters
) : Worker(context, params){
    @SuppressLint("RestrictedApi")
    override fun doWork(): Result {
        println("Worker Is Called")
       return Result.Success()
    }
}