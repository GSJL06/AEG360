package com.ejemplo.educagestor360.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ejemplo.educagestor360.features.authentication.presentation.login.LoginScreen // Asegúrate de importar tu LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController() // Crea un controlador de navegación

    NavHost(
        navController = navController,
        startDestination = AppRoutes.LOGIN // La pantalla que se mostrará primero
    ) {
        // Define la pantalla de Login
        composable(route = AppRoutes.LOGIN) {
            LoginScreen(
                // Aquí podrías pasar el navController a LoginScreen si necesita navegar
                // por ejemplo, loginViewModel.onLoginSuccess = { navController.navigate(AppRoutes.HOME) }
            )
        }

        // Aquí agregarás más composables para otras pantallas en el futuro
        // Ejemplo:
        // composable(route = AppRoutes.HOME) {
        //     HomeScreen(navController = navController)
        // }
    }
}
