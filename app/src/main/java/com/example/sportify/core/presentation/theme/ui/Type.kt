package com.example.sportify.core.presentation.theme.ui

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.example.sportify.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val azertMonoFontFamily = FontFamily(
    Font(R.font.azeret_mono_semibold, FontWeight.SemiBold)
)

val bebasNueueFontFamily = FontFamily(
    Font(R.font.bebas_neue, FontWeight.Normal)
)

val manropeFontFamily = FontFamily(
    Font(R.font.manrope_semibold, FontWeight.SemiBold)
)
