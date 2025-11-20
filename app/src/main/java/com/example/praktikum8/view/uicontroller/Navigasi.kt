package com.example.praktikum8.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DataApp(
    modifier: Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
)