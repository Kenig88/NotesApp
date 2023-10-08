package com.kenig.notesapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
fun SplashScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.sql_or_firebase),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Button(
                    onClick = {
                        navController.navigate(Routes.MainScreen.route)
                    },
                    modifier = Modifier.width(130.dp)
                ) {
                    Text(text = stringResource(R.string.room))
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(
                    onClick = {
                        navController.navigate(Routes.MainScreen.route)
                    },
                    modifier = Modifier.width(130.dp)
                ) {
                    Text(text = stringResource(R.string.firebase))
                }
            }
        }
    }
}