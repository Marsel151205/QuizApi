package com.example.data.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url =
            request.url.newBuilder()
                .addQueryParameter("apiKey", "eP0WjFXfi06s1z6X04EiwS8yMLHWbJpVWMNl2WiF").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}