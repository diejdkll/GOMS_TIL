package com.compose.goms_til.ui.main.component.local_si

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.component.button.GomsTilButton
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalSiBackButton(
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