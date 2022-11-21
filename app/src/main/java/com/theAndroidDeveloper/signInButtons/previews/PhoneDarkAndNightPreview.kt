package com.theAndroidDeveloper.signInButtons.previews

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview


@Preview(
    showBackground = true,
    device = Devices.PHONE,
    showSystemUi = true
)
@Preview(
    showBackground = true,
    device = Devices.PHONE,
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES
)
internal annotation class PhoneDarkAndNightPreview