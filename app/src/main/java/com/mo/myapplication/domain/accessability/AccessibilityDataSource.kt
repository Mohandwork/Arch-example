package com.mo.myapplication.domain.accessability

import com.example.ksouppoc.HTMLResponse
import retrofit2.Response

interface AccessibilityDataSource {

    suspend fun getAccessibilityDetails(path:String): Response<HTMLResponse>
}