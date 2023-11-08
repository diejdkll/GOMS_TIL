package com.compose.goms_til.ui.theme

import androidx.compose.runtime.Composable

@Composable
fun GomsTilTheme(
    colors: ColorTheme = if (true) LightColor else LightColor,
    typography: GomsTilTypography = GomsTilTypography,
    content: @Composable (colors: ColorTheme, typography: GomsTilTypography) -> Unit
) {
    content(colors, typography)
}