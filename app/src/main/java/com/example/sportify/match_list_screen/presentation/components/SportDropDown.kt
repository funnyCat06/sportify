package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sportify.core.presentation.theme.ui.buttonShape

@Composable
fun SportDropDown(
    items: List<String> = listOf("FOOTBALL", "BASKETBALL"),
    expanded: Boolean = false,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        shape = buttonShape,
        modifier = modifier,
    ) {
        for (item in items) {
            DropdownMenuItem(
                text = { Text(item) },
                onClick = {},
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SportDropdownPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
    }
}