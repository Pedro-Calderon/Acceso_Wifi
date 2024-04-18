package com.example.wifi_acceso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.platform.LocalContext
import com.example.wifi_acceso.Helper.ConnectionStatus
import com.example.wifi_acceso.Helper.currentConnectivityStatus
import com.example.wifi_acceso.Helper.observeConnectivityAsFlow
import com.example.wifi_acceso.Screens.DeshabilitaScreen
import com.example.wifi_acceso.Screens.HabilitaScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            checkConnectivityStatus()
        }
    }
}
@Composable
fun checkConnectivityStatus(){
    val connection by connectivityStatus()
    val isConected=connection===ConnectionStatus.Habilitalabel
    if(isConected){
        HabilitaScreen()
    }else{
        DeshabilitaScreen()
    }
}


@Composable
fun connectivityStatus(): State<ConnectionStatus> {
    val mCtx= LocalContext.current
    return produceState(initialValue = mCtx.currentConnectivityStatus) {
        mCtx.observeConnectivityAsFlow().collect{value=it}
    }
}