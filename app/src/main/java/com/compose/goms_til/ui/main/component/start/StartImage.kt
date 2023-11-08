package com.compose.goms_til.ui.main.component.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.compose.goms_til.R

@Composable
fun StartImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_start),
        contentDescription = "Start Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()
    )
}