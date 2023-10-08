package com.kenig.notesapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.kenig.notesapp.Utils.Routes
import com.kenig.notesapp.main_screen.UiMainScreenItem
import com.kenig.notesapp.ui.theme.RedLight

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Routes.AddNoteScreen.route)
                },
                backgroundColor = RedLight
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = Color.White)
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        Column(

        ) {
            UiMainScreenItem(navController, "Note 1", "Subtitle for note 1")
            UiMainScreenItem(navController, "Note 2", "Subtitle for note 2")
            UiMainScreenItem(navController, "Note 3", "Subtitle for note 3")
            UiMainScreenItem(navController, "Note 4", "Subtitle for note 4")
        }

    }
}