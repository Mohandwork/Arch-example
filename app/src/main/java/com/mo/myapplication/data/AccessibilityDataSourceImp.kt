package com.mo.myapplication.data


import com.mo.myapplication.domain.accessability.AccessibilityDataSource
import javax.inject.Inject

class AccessibilityDataSourceImp @Inject constructor(private val accessibilityApi: AccessibilityApi):
    AccessibilityDataSource {
    override suspend fun getAccessibilityDetails(path:String)= accessibilityApi.getAccessibilityDetails(path)
}