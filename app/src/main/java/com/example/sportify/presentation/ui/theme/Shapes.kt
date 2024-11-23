package com.example.sportify.presentation.ui.theme

import androidx.compose.foundation.shape.GenericShape

val buttonShape = GenericShape(builder = { size, _ ->
    moveTo(0f, 0f)
    lineTo(size.width * 0.97f, 0f)
    lineTo(size.width, size.height / 2)
    lineTo(size.width * 0.97f, size.height)
    lineTo(size.width * 0.03f, size.height)
    lineTo(0f, size.height / 2)
    lineTo(size.width * 0.03f, 0f)
})
