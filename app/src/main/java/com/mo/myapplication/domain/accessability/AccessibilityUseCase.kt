package com.mo.myapplication.domain.accessability


import android.util.Log
import com.mo.myapplication.domain.accessability.AccessibilityRepository
import kotlinx.coroutines.flow.flow
import uk.org.lta.designsystem.R
import uk.org.lta.home.components.accessibility.CardData
import uk.org.lta.shared.models.episerver.mapElementToObject
import uk.org.lta.shared.models.htmlobject.HtmlMappedObject
import uk.org.lta.shared.network.ErrorModel
import uk.org.lta.shared.network.handleErrorResponse
import uk.org.lta.shared.network.handleFailureRequest
import javax.inject.Inject

class AccessibilityUseCase @Inject constructor(private val accessibilityRepository: AccessibilityRepository) {

    fun invokeAccessibility(path: String) =
        flow {
        }
}

