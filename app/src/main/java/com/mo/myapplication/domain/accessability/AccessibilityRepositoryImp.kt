package com.mo.myapplication.domain.accessability


import javax.inject.Inject

class AccessibilityRepositoryImp @Inject constructor(private val accessibilityDataSource: AccessibilityDataSource) :
    AccessibilityRepository {
    override suspend fun getAccessibilityDetails(path: String) =
        accessibilityDataSource.getAccessibilityDetails(path)

}