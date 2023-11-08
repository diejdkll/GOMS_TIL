package com.compose.goms_til.ui.main.component.start

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.component.button.GomsTilButton
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun StartButton(onClick: () -> Unit) {
    GomsTilTheme { colors, _ ->
        GomsTilButton(
            text = "시작하기",
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

@Preview(showBackground = true)
@Composable
fun StartButtonPreview() {
    StartButton(onClick = {})
}