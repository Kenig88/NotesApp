package com.kenig.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kenig.notesapp.Utils.Routes
import com.kenig.notesapp.screens.AddNoteScreen
import com.kenig.notesapp.screens.MainScreen
import com.kenig.notesapp.screens.NoteScreen
import com.kenig.notesapp.screens.SplashScreen

@Composable
fun NavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.SplashScreen.route) {
        composable(Routes.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Routes.MainScreen.route) {
            MainScreen(navController)
        }
        composable(Routes.AddNoteScreen.route) {
            AddNoteScreen(navController)
        }
        composable(Routes.NoteScreen.route) {
            NoteScreen(navController)
        }
    }
}