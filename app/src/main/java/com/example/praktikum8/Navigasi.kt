package com.example.navigasiui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasiui.view.FormIsian
import com.example.praktikum8.view.TampilData
import com.example.praktikum8.view.TampilData

enum class Navigasi {
    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.Formulirku.name){
                FormIsian (
                    //pilihanJK = JenisK .map { id -> konteks.resroude.getstring}
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData(
                    onBackBtnClick = {
                        cancelAndBackToFormulirku(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirku(
    navController: NavHostController
){
    navController.popBackStack(Navigasi.Formulirku.name,
        inclusive = false)
}