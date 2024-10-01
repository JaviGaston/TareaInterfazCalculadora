package com.example.tareainterfazcalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tareainterfazcalculadora.ui.theme.TareaInterfazCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareaInterfazCalculadoraTheme {
                CalculAppInterface()
            }
        }
    }
}

@Composable
fun CalculAppInterface() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Display( text = "0")

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "7", modifier = Modifier.weight(1f))
            CalculatorButton(text = "8", modifier = Modifier.weight(1f))
            CalculatorButton(text = "9", modifier = Modifier.weight(1f))
            CalculatorButton(text = "/", modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "4", modifier = Modifier.weight(1f))
            CalculatorButton(text = "5", modifier = Modifier.weight(1f))
            CalculatorButton(text = "6", modifier = Modifier.weight(1f))
            CalculatorButton(text = "x", modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "1", modifier = Modifier.weight(1f), backgroundColor = Color.Blue)
            CalculatorButton(text = "2", modifier = Modifier.weight(1f))
            CalculatorButton(text = "3", modifier = Modifier.weight(1f))
            CalculatorButton(text = "-", modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = ".", modifier = Modifier.weight(1f))
            CalculatorButton(text = "0", modifier = Modifier.weight(1f))
            CalculatorButton(text = "√ ", modifier = Modifier.weight(1f))
            CalculatorButton(text = "+", modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "AC", modifier = Modifier.weight(1f))
            CalculatorButton(text = "π", modifier = Modifier.weight(1f))
            CalculatorButton(text = "! ", modifier = Modifier.weight(1f))
            CalculatorButton(text = "=", modifier = Modifier.weight(1f))
        }
    }
}
@Composable
fun CalculatorButton(text: String, modifier: Modifier = Modifier, backgroundColor: Color = Color.Gray) {
    Button(
        onClick = { /* Acción del botón */ },
        shape = CutCornerShape(0.dp),
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        modifier = modifier
            .padding(4.dp)
    ) {
        Text(text = text, fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Display(text: String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = text,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalculAppInterfacePreview() {
    TareaInterfazCalculadoraTheme {
        CalculAppInterface()
    }
}