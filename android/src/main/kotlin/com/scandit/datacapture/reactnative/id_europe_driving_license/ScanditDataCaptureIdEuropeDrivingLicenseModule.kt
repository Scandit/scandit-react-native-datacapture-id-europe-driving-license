/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2024- Scandit AG. All rights reserved.
 */

@file:Suppress("PackageName")
package com.scandit.datacapture.reactnative.id_europe_driving_license

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule

class ScanditDataCaptureIdEuropeDrivingLicenseModule(
    private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String = "ScanditDataCaptureIdEuropeDrivingLicenseModule"
}
