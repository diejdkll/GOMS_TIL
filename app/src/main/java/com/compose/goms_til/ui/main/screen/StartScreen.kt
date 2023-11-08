package com.compose.goms_til.ui.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.local_do.LocalDoButton
import com.compose.goms_til.ui.main.component.start.StartButton
import com.compose.goms_til.ui.main.component.start.StartImage
import com.compose.goms_til.ui.main.component.start.StartSubTitleText
import com.compose.goms_til.ui.main.component.start.StartTitleText
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun StartScreen(
    onNextClick: () -> Unit,
) {
    GomsTilTheme { colors, _ ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = colors.WHITE))
        Column(horizontalAlignment = Alignment.CenterHorizontally,) {
            Spacer(modifier = Modifier.fillMaxHeight(0.05f))
            StartTitleText()
            Spacer(modifier = Modifier.height(4.dp))
            StartSubTitleText()
            Spacer(modifier = Modifier.fillMaxHeight(0.17f))
            StartImage()
            Spacer(modifier = Modifier.fillMaxHeight(0.5f))
        }
        Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
            Spacer(modifier = Modifier.fillMaxHeight(0.855f))
            StartButton {
                onNextClick()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartButtonPreview() {
    StartScreen({})
}