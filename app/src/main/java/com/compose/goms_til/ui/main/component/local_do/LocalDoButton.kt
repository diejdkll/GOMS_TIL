package com.compose.goms_til.ui.main.component.local_do

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.component.button.GomsTilButton
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalDoButton(onClick: () -> Unit) {
    GomsTilTheme { colors, _ ->
        GomsTilButton(
            text = "다음",
            textColor = colors.WHITE,
            buttonColor = colors.MAIN,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            onClick()
        }
    }
}