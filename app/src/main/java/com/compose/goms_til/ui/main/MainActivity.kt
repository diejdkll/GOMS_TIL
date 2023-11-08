package com.compose.goms_til.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.goms_til.ui.main.component.local_si.LocalSiList
import com.compose.goms_til.ui.main.screen.LocalDoScreen
import com.compose.goms_til.ui.main.screen.LocalDongScreen
import com.compose.goms_til.ui.main.screen.LocalSiScreen
import com.compose.goms_til.ui.main.screen.RecordScreen
import com.compose.goms_til.ui.main.screen.StartScreen

enum class MainPage(val value: String) {
    Start("Start"),
    LocalDo("LocalDo"),
    LocalSi("LocalSi"),
    LocalDong("LocalDong"),
    Record("Record")
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "Start"
            ) {
                composable(MainPage.Start.name) {
                    StartScreen(onNextClick = { navController.navigate(MainPage.LocalDo.value) })
                }
                composable(MainPage.LocalDo.name) {
                    LocalDoScreen(onNextClick = { navController.navigate(MainPage.LocalSi.value) })
                }
                composable(MainPage.LocalSi.name) {
                    LocalSiScreen(
                        onNextClick = { navController.navigate(MainPage.LocalDong.value) },
                        onBackClick = { navController.popBackStack() }
                    )
                }
                composable(MainPage.LocalDong.name) {
                    LocalDongScreen(
                        onNextClick = { navController.navigate(MainPage.Record.value) },
                        onBackClick = { navController.popBackStack() }
                    )
                }
                composable(MainPage.Record.name) {
                    RecordScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}