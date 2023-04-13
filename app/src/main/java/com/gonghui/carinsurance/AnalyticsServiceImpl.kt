package com.gonghui.carinsurance

import android.util.Log
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {
    override fun analyticsMethods() {
        Log.i("qwe", "analyticsMethods: ")
    }
}