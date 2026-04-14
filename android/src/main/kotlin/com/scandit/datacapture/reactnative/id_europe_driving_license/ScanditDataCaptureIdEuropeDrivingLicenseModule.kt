/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2024- Scandit AG. All rights reserved.
 */

@file:Suppress("PackageName")
package com.scandit.datacapture.reactnative.id_europe_driving_license

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = ScanditDataCaptureIdEuropeDrivingLicenseModule.NAME)
class ScanditDataCaptureIdEuropeDrivingLicenseModule(
    reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    companion object {
        const val NAME = "ScanditDataCaptureIdEuropeDrivingLicense"
    }

    override fun getName(): String = NAME
}
