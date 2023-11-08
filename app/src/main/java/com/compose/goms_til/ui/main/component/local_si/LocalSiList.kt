package com.compose.goms_til.ui.main.component.local_si

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.ListItemComponent
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalSiList() {
    val items = listOf("목포시", "여수시", "순천시", "광양시", "나주시", "담양군", "곡성군", "보성군", "화순군", "화순군", "화순군", "화순군", "화순군")

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