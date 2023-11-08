package com.compose.goms_til.ui.main.component.local_do

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.ListItemComponent
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalDoList() {
    val items = listOf("강원도", "경기도", "충청북도", "충청남도", "경상북도", "전라북도", "경상남도", "전라남도")

    GomsTilTheme { colors, _ ->
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(items.lastIndex) { index ->
                ListItemComponent(items[index])
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LocalDoListPreview() {
    LocalDoList()
}