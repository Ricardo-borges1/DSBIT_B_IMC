package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.ImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(color = Color(0xFFD32D2D))
                .fillMaxWidth()
                .height(200.dp)
                .padding(12.dp)
        ) {
            Image(
                modifier = Modifier
                    //aumenta a imagem
                    .height(100.dp)
                    //
                    .padding(top = 10.dp),
                painter = painterResource(id = R.drawable.bmi), contentDescription = ""
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontSize = 30.sp,
            )
        }
        Card(
            modifier = Modifier
                .width(280.dp)
                // height tamhno dele
                .height(430.dp)
                .offset(x = 60.dp, y = -30.dp),
                elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Text(
                text = "Seus dados",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFD32D2D),
                textAlign = TextAlign.Center,
                modifier = Modifier.offset(x = 60.dp, y = 30.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "Seu peso:",
                    color = Color(0xFFE74D4D),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.offset(x = -70.dp, y = 40.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 40.dp)
                        .background(color = Color.White),
                    placeholder = {
                        Text(
                            text = "Seu peso em KG",
                            color = Color.Gray,

                            )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFF4AE906),
                            unfocusedBorderColor = Color(0xFFF30202)
                        ),
                )

                Text(
                    text = "Sua altura:",
                    color = Color(0xFFE74D4D),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.offset(x = -70.dp, y = 70.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 70.dp)
                        .background(color = Color.White),
                    placeholder = {
                        Text(
                            text = "Sua altura em cm",
                            color = Color.Gray,
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFF4AE906),
                            unfocusedBorderColor = Color(0xFFF30202)
                        ),
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .offset(y = 100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC0909))

                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 18.sp
                        )
                }
            }
        }
        Spacer(modifier = Modifier.height(18.dp))
        Card (
            colors = CardDefaults.cardColors(containerColor = Color(0xFF4CAF50)),
            modifier = Modifier
                .width(280.dp)
                // height tamhno dele
                .height(430.dp)
                .offset(x = 60.dp, y = -30.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ){
            Text(
                text = "Resultado",
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier.offset(x = 40.dp, y = 35.dp)
                )
            Text(
                text = "Peso Ideal",
                fontSize = 25.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.offset(x = 20.dp, y = 35.dp)
            )
            Text(
                text = "21.3",
                fontSize = 40.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.offset(x = 180.dp, y = -20.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcTheme {
        Greeting()
    }
}