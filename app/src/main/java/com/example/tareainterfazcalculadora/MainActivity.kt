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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
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
                Orientation()
            }
        }
    }
}

@Composable
fun Orientation() {
    val configuration = LocalConfiguration.current

    if (configuration.orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE) {
        Landscape()
    } else {
        CalculAppInterface()
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "0",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "7", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "8", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "9", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "/", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }}

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "4", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "5", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "6", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "x", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "1", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "2", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "3", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "-", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = ".", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "0", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "√", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "+", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "AC", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "π", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "!", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "=", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}
@Composable
fun Landscape(){
    var numberText: StringBuilder = StringBuilder("0")
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly){

        Column(modifier = Modifier.weight(1f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = {numberText = clickAction("0",numberText)},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "0", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "5", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "π", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = ".", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
        Column(modifier = Modifier.weight(1f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "1", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "6", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "+", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "!", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
        Column(modifier = Modifier.weight(1f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "2", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "7", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "-", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "√", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }}
        Column(modifier = Modifier.weight(1f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "3", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "8", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "x", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "AC", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }}
        Column(modifier = Modifier.weight(1f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "4", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "9", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "/", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                shape = CutCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azulclaro)),
                modifier = Modifier.padding(1.dp).weight(1f).fillMaxWidth().padding(7.dp)
            )
            {
                Text(text = "=", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }}
        Column(modifier = Modifier.weight(2f).fillMaxHeight().padding(5.dp),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "0",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }
    }
}

fun clickAction(s: String, numberText: StringBuilder): StringBuilder {

}


@Preview(showBackground = true)
@Composable
fun CalculAppInterfacePreview() {
    TareaInterfazCalculadoraTheme {
        Landscape()
    }
}