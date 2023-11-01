package com.example.catapp.ui.theme.Screens.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.catapp.Navigations.ROUTES_BMICALC
import com.example.catapp.Navigations.ROUTES_CALCULATOR
import com.example.catapp.Navigations.ROUTES_INTENTS
import com.example.catapp.ui.theme.CatAppTheme


@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier
                    .height(170.dp)
                    .width(140.dp)
            ) {
                Text(text = "my card one")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Card(
                modifier = Modifier
                    .height(170.dp)
                    .width(140.dp)
            ) {
                Text(text = "My card Two")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Card(
                modifier = Modifier
                    .height(170.dp)
                    .width(140.dp)
            ) {
                Text(text = "my card one")
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Card(
                modifier = Modifier
                    .height(170.dp)
                    .width(140.dp)
            ) {
                Text(text = "My card Two")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row{
            Button(onClick = { navController.navigate(ROUTES_CALCULATOR) }) {
                Text(text = "Calc")
            }
            Button(onClick = { navController.navigate(ROUTES_INTENTS) }) {
                Text(text = "Intent")
            }
            Button(onClick = { navController.navigate(ROUTES_BMICALC) }) {
                Text(text = "BmiCalc")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    CatAppTheme {
        HomeScreen(navController= rememberNavController())
    }

}
