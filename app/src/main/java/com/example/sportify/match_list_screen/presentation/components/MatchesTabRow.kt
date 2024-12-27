package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.sportify.core.presentation.theme.ui.SportifyTheme

@Composable
fun MatchesTabRow(
    modifier: Modifier = Modifier,
    selectedTabIndex: Int = 0,
    titles: List<String> = listOf("Upcoming", "Past Matches"),
    onTabClick: (Int) -> Unit = {

    }
) {
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        indicator = { tabPositions ->
            if (selectedTabIndex < tabPositions.size) {
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                    color = Color(0xFFFF5050)
                )
            }
        }

    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { onTabClick(index) },
                text = {
                    Text(
                        text = title,
                        color = if (selectedTabIndex == index) {
                            Color(0xFF150000)
                        } else {
                            Color(0xFF5B5757)
                        }
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MatchesTabRowPreview() {
    SportifyTheme {
        MatchesTabRow()
    }
}
