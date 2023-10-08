package com.kenig.notesapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.kenig.notesapp.R
import com.kenig.notesapp.Utils.Routes

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AddNoteScreen(navController: NavHostController) {
    var title by remember {mutableStateOf("")}
    var subtitle by remember {mutableStateOf("")}

    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Add new note",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            OutlinedTextField(
                value = title,
                onValueChange = { textTitle ->
                    title = textTitle
                },
                label = {
                    Text(
                        text = stringResource(R.string.note_title)
                    )
                }
            )
            OutlinedTextField(
                value = subtitle,
                onValueChange = { textSubtitle ->
                    subtitle = textSubtitle
                },
                label = {
                    Text(
                        text = stringResource(R.string.note_subtitle)
                    )
                }
            )
            Button(
                modifier = Modifier.padding(top = 16.dp),
                onClick = {
                    navController.navigate(Routes.MainScreen.route)
                }
            ) {
                Text(
                    text = stringResource(R.string.save_note)
                )
            }
        }
    }
}