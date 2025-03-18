package com.example.sportify.match_list_screen.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.sportify.R
import com.example.sportify.core.presentation.theme.ui.manropeFontFamily
import com.example.sportify.match_list_screen.presentation.CompetitionUi

@Composable
fun CompetitionListItem(
    modifier: Modifier = Modifier,
    competitionUi: CompetitionUi,
    onItemClick: () -> Unit
) {
    Column(
        modifier = modifier
            .width(IntrinsicSize.Min)
            .clickable(onClick = onItemClick),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .border(BorderStroke(2.dp, Color(0xFFEEEDED)))
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = competitionUi.emblem,
                contentDescription = null,
                modifier = Modifier.size(58.dp),
                error = painterResource(R.drawable.image_break),
            )
        }
        Text(
            text = competitionUi.name,
            fontFamily = manropeFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}