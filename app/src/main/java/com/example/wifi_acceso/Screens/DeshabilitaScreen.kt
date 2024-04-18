package com.example.wifi_acceso.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wifi_acceso.R

@Composable
fun DeshabilitaScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.ic_wifi_off),
            contentDescription ="Wifi Apagado",
            modifier= Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "El Internet Esta Apagado"
            , fontSize = 18.sp
        )
    }
}