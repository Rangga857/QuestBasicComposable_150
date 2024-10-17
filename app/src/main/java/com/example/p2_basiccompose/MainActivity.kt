package com.example.p2_basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p2_basiccompose.ui.theme.P2_BASICCOMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P2_BASICCOMPOSETheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    basiclayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
val customFont1 = FontFamily(
    Font(R.font.medium)
)
val customFont2 = FontFamily(
    Font(R.font.thin)
)
@Composable
fun basiclayout(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        )
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    )
    {
        Text(text = "Login", style = TextStyle
            (fontSize = 80.sp,
            fontFamily = customFont1,
            ),
            modifier = Modifier.padding(top = 50.dp)
        )
        Text(text = "Ini adalah halaman login")
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P2_BASICCOMPOSETheme {
        basiclayout()
    }
}