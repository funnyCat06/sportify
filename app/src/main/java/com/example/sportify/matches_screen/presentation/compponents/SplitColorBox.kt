package com.example.sportify.matches_screen.presentation.compponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.sportify.core.presentation.theme.ui.splitColorShape

@Composable
fun SplitColor(
    modifier: Modifier = Modifier,
    content: BoxScope.() -> Unit
) {
    Box(
        modifier
            .fillMaxWidth()
            .height(128.dp)
    ) {
        Row(
            modifier = Modifier.matchParentSize()
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(.55f)
                    .clip(splitColorShape)
                    .background(Color.Blue)
            )
        }
        content()
    }

}