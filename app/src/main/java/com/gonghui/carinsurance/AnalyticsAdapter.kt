package com.gonghui.carinsurance

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticsService
){
    fun getService() = service
}