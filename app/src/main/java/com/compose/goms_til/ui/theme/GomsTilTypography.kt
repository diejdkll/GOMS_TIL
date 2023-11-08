package com.compose.goms_til.ui.theme

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object GomsTilTypography {

    @Stable
    val title1 = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.32.sp,
    )

    @Stable
    val title2 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.24.sp,
    )

    @Stable
    val title3 = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.2.sp,
    )

    @Stable
    val content1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight(500),
        letterSpacing = 0.16.sp,
    )

    @Stable
    val content2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.16.sp,
    )

    @Stable
    val content3 = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight(500),
        letterSpacing = 0.16.sp,
    )

    @Stable
    val buttonText = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight(700),
        letterSpacing = 0.14.sp,
    )
}