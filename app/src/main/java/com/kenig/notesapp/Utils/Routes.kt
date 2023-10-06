package com.kenig.notesapp.Utils

sealed class Routes(val route: String) {
    object SplashScreen : Routes("splash_screen")
    object MainScreen : Routes("main_screen")
    object AddNoteScreen : Routes ("add_note_screen")
    object NoteScreen : Routes("note_screen")
}
