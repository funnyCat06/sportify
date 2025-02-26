package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sportify.match_list_screen.presentation.MatchUi
import java.time.LocalDate

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UpcomingMatchesList(
    modifier: Modifier = Modifier,
    matches: Map<LocalDate, List<MatchUi>>
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        matches.forEach { (date, matches) ->
            stickyHeader {
                Text(
                    text = "${date.dayOfMonth} ${date.month.name.lowercase()}, ${date.dayOfWeek.name.lowercase()}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF1E1E1E))
                        .padding(8.dp)
                )
            }
            items(items = matches) { matchUi ->
                UpcomingMatchListItem(matchUi = matchUi)
            }
        }
    }
}