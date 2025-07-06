package com.ejemplo.educagestor360.features.authentication.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

// Estado de la UI para la pantalla de Login
data class LoginUiState(
    val email: String = "",
    val password: String = ""
    // Aquí podrías agregar más estados como isLoading, errorMessages, etc.
)

class LoginViewModel : ViewModel() {

    var uiState by mutableStateOf(LoginUiState())
        private set // Solo el ViewModel puede modificar el estado directamente

    fun onEmailChange(email: String) {
        uiState = uiState.copy(email = email)
    }

    fun onPasswordChange(password: String) {
        uiState = uiState.copy(password = password)
    }

    fun onLoginClicked() {
        // Lógica de inicio de sesión irá aquí más adelante
        // Por ejemplo, validar campos, llamar a un caso de uso, etc.
        println("Login clicked: Email: ${uiState.email}, Password: ${uiState.password}")
    }
}
