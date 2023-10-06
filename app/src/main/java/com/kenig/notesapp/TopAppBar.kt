package com.kenig.notesapp

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kenig.notesapp.ui.theme.Orange

@Composable
fun TopBar() {
    TopAppBar(
        backgroundColor = Orange,
        contentColor = Color.Black,
        elevation = 12.dp
    ) {
        Text(
            stringResource(R.string.app_name),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black
        )

    }
}