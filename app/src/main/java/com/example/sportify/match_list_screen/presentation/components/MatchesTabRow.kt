package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
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
import java.time.LocalDate

data class MatchTab(
    val id: Int,
    val name: String,
    val dateFrom: LocalDate,
    val dateTo: LocalDate
)

@Composable
fun MatchesTabRow(
    tabs: List<MatchTab>,
    selectedTabId: Int,
    modifier: Modifier = Modifier,
    onTabClick: (Int) -> Unit = { }
) {
    TabRow(
        selectedTabIndex = selectedTabId,
        modifier = modifier,
        indicator = { tabPositions ->
            if (selectedTabId < tabPositions.size) {
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTabId]),
                    color = Color(0xFFFF5050)
                )
            }
        }
    ) {
        tabs.forEach { tab ->
            Tab(
                selected = selectedTabId == tab.id,
                onClick = { onTabClick(tab.id) },
                text = {
                    Text(
                        text = tab.name,
                        color = if (selectedTabId == tab.id) {
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
        MatchesTabRow(
            tabs = listOf(
                MatchTab(
                    0,
                    "Upcoming",
                    dateFrom = LocalDate.now(),
                    dateTo = LocalDate.now().plusMonths(1)
                ),
                MatchTab(
                    1,
                    "Past Matches",
                    dateFrom = LocalDate.now().minusDays(1),
                    dateTo = LocalDate.now().minusMonths(1)
                )
            ),
            modifier = Modifier.fillMaxWidth(),
            selectedTabId = 1,
            onTabClick = {}
        )
    }
}
