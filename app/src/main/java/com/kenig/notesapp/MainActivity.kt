package com.kenig.notesapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kenig.notesapp.navigation.NavHost
import com.kenig.notesapp.ui.theme.NotesAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppTheme {
                Scaffold(
                    topBar = {
                        TopBar()
                    },
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        color = MaterialTheme.colors.background
                    ) {
                        NavHost()
                    }
                }
            }
        }
    }
}