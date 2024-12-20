package com.example.sportify.sign_up

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sportify.R
import com.example.sportify.core.presentation.theme.ui.SportifyTheme
import com.example.sportify.core.presentation.theme.ui.azertMonoFontFamily
import com.example.sportify.core.presentation.theme.ui.bebasNueueFontFamily
import com.example.sportify.core.presentation.theme.ui.buttonShape
import com.example.sportify.core.presentation.theme.ui.manropeFontFamily

@Composable
fun SignUpScreen() {
    Column(
        modifier = Modifier
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.30f)
                .background(Color(0xFFFF5050))
                .statusBarsPadding()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.weight_lifting),
                    contentDescription = null,
                    tint = Color(0xFFFAFAFA),
                    modifier = Modifier.size(36.dp)
                )
                Text(
                    text = stringResource(R.string.app_name),
                    fontFamily = azertMonoFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 21.sp,
                    lineHeight = 25.sp,
                    color = Color(0xFFFAFAFA)
                )
            }
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = stringResource(R.string.create_id),
                    fontFamily = bebasNueueFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    text = stringResource(R.string.create_id_description),
                    fontFamily = manropeFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    color = Color(0xFFFFFFFF)
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(0.75f)
                .navigationBarsPadding()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                TextField(
                    value = "",
                    onValueChange = { },
                    placeholder = {
                        Text(stringResource(R.string.first_name))
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                TextField(
                    value = "",
                    onValueChange = { },
                    placeholder = { Text(stringResource(R.string.last_name)) },
                    modifier = Modifier.fillMaxWidth()
                )
                TextField(
                    value = "",
                    onValueChange = { },
                    placeholder = { Text(stringResource(R.string.email)) },
                    modifier = Modifier.fillMaxWidth()
                )
                TextField(
                    value = "",
                    onValueChange = { },
                    placeholder = { Text(stringResource(R.string.password)) },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = stringResource(R.string.password_conditions),
                    fontFamily = manropeFontFamily,
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    color = Color(0xFF525252)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(checked = false, onCheckedChange = {})
                Text(
                    text = "I agree to  the Terms and Privacy Policy",
                    fontSize = 14.sp,
                    color = Color(0xFF322D2D)
                )
            }
            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                shape = buttonShape,
                colors = ButtonColors(
                    containerColor = Color(0xFF150000),
                    contentColor = Color(0xFFFAFAFA),
                    disabledContainerColor = Color(0xFF150000),
                    disabledContentColor = Color(0xFFFAFAFA),
                )
            ) {
                Text(stringResource(R.string.create_account))
            }
            Text(
                text = stringResource(R.string.sportify_data_collection),
                fontFamily = manropeFontFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF5B5757)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SignUpScreenPreview() {
    SportifyTheme {
        SignUpScreen()
    }
}
