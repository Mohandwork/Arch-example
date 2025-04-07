package com.mo.myapplication.data

import com.example.ksouppoc.HTMLResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AccessibilityApi {

    @GET("api/content/getPageData")
    suspend fun getAccessibilityDetails(
        @Query("path") path:String?
    ): Response<HTMLResponse>
}