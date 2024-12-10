package com.example.sportify.sportify_app.presentation.theme.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val buttonShape = GenericShape(builder = { size, _ ->
    moveTo(0f, 0f)
    lineTo(size.width * 0.97f, 0f)
    lineTo(size.width, size.height / 2)
    lineTo(size.width * 0.97f, size.height)
    lineTo(size.width * 0.03f, size.height)
    lineTo(0f, size.height / 2)
    lineTo(size.width * 0.03f, 0f)
})

val chipShape = GenericShape(builder = { size, _ ->
    moveTo(0f, 0f)
    lineTo(size.width * 0.90f, 0f)
    lineTo(size.width, size.height / 2)
    lineTo(size.width * 0.90f, size.height)
    lineTo(size.width * 0.10f, size.height)
    lineTo(0f, size.height / 2)
    lineTo(size.width * 0.10f, 0f)
})

val splitColorShape = GenericShape(builder = { size, _ ->
    moveTo(0f, 0f)
    lineTo(size.width, 0f)
    lineTo(size.width * .8f, size.height)
    lineTo(0f, size.height)
})

@Preview(showBackground = true)
@Composable
private fun ShapePreview() {
    Box(Modifier.size(128.dp).clip(splitColorShape).background(Color.Blue))
}