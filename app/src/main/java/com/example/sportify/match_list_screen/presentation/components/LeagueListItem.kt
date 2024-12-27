package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sportify.R
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.core.presentation.theme.ui.manropeFontFamily
import com.example.sportify.match_list_screen.presentation.CompetitionUi

@Composable
fun LeagueListItem(
    modifier: Modifier = Modifier,
    competitionUi: CompetitionUi
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .border(BorderStroke(2.dp, Color(0xFFEEEDED)))
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(competitionUi.imageRes),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
        }
        Text(
            text = competitionUi.name,
            fontFamily = manropeFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LeagueListItemPreview() {
    SportifyTheme {
        LeagueListItem(
            competitionUi = CompetitionUi("Premier League", R.drawable.premier_league)
        )
    }
}