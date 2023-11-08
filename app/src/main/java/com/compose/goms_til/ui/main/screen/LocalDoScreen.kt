package com.compose.goms_til.ui.main.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.local_do.LocalDoButton
import com.compose.goms_til.ui.main.component.local_do.LocalDoList
import com.compose.goms_til.ui.main.component.local_do.LocalDoTitleText

@Composable
fun LocalDoScreen(
    onNextClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.03f))
            LocalDoTitleText()
            Spacer(modifier = Modifier.height(16.dp))
            LocalDoList()
        }
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.855f))
            LocalDoButton {
                onNextClick()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LocalDoScreenPreview() {
    LocalDoScreen({})
}