package com.compose.goms_til.ui.main.component.local_dong

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.compose.goms_til.ui.component.button.GomsTilButton
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalDongBackButton(
    modifier: Modifier,
    onClick: () -> Unit
) {
    GomsTilTheme { colors, _ ->
        GomsTilButton(
            text = "이전",
            textColor = colors.BLACK,
            buttonColor = colors.GRAY1,
            modifier = modifier
        ) {
            onClick()
        }
    }
}