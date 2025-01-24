package com.example.sportify.match_list_screen.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.core.presentation.theme.ui.bebasNueueFontFamily
import com.example.sportify.core.presentation.theme.ui.chipShape
import com.example.sportify.core.presentation.theme.ui.manropeFontFamily
import com.example.sportify.match_list_screen.presentation.components.LeagueListItem
import com.example.sportify.match_list_screen.presentation.components.MatchesTabRow
import com.example.sportify.match_list_screen.presentation.components.UpcomingMatchesList


@Composable
fun MatchesScreen(
    uiState: MatchesListState = MatchesListState(),
    competitionUiItems: List<CompetitionUi> = competitionUiLists
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .statusBarsPadding(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Matches",
                fontFamily = manropeFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp
            )
            Row(
                modifier = Modifier
                    .clip(chipShape)
                    .background(Color(0xFFFF5050))
                    .padding(start = 24.dp, end = 16.dp, top = 4.dp, bottom = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "FOOTBALL",
                    fontFamily = bebasNueueFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color(0xFFFAFAFA)
                )
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = null,
                    tint = Color(0xFFFAFAFA)
                )
            }
        }
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            items(items = competitionUiItems) { item ->
                LeagueListItem(competitionUi = item)
            }
        }
        var selectedTabIndex by remember { mutableIntStateOf(0) }

        MatchesTabRow(
            modifier = Modifier.fillMaxWidth(0.75f),
            titles = listOf("Upcoming", "Past Matches"),
            selectedTabIndex = selectedTabIndex,
            onTabClick = { index ->
                selectedTabIndex = index
            }
        )
        // Animation might be tricky, though
        when (selectedTabIndex) {
            0 -> {
                UpcomingMatchesList(matches = uiState.matches)
            }
            1 -> {
            }
            else -> {
                Log.d("UpcomingMatchesScreen", "quit hacking me you son of a bitch" )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UpcomingMatchesScreenPreview() {
    SportifyTheme {
        MatchesScreen()
    }
}