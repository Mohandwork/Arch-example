package com.mo.myapplication.data


import com.mo.myapplication.domain.accessability.AccessibilityDataSource
import com.mo.myapplication.domain.accessability.AccessibilityRepository
import javax.inject.Inject

class AccessibilityRepositoryImp @Inject constructor(private val accessibilityDataSource: AccessibilityDataSource) :
    AccessibilityRepository {
    override suspend fun getAccessibilityDetails(path: String) =
        accessibilityDataSource.getAccessibilityDetails(path)

}