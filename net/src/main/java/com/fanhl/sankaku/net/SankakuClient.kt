package com.fanhl.sankaku.net

import retrofit2.Retrofit

object SankakuClient {
    private val retrofit by lazy {
        Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(BaseResponseConverterFactory.create(gson, callback))
//            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//            .addCallAdapterFactory(Rx.create())
            .build()
    }
}