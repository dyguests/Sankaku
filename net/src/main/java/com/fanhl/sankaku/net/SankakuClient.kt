package com.fanhl.sankaku.net

import retrofit2.Retrofit

object SankakuClient {
    private val retrofit by lazy {
        Retrofit.Builder()
            .build()
    }
}