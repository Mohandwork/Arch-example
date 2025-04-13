package com.mo.myapplication.domain.accessability


import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AccessibilityUseCase @Inject constructor(private val accessibilityRepository: AccessibilityRepository) {

    fun invokeAccessibility(path: String) =
        flow {
        }
}

