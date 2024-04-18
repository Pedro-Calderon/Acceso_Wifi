package com.example.wifi_acceso.Helper

sealed class ConnectionStatus{
    object Habilitalabel:ConnectionStatus()
    object Desabilitalabel:ConnectionStatus()
}