package com.example.fourquadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fourquadrant.ui.theme.FourQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FourQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FourQuadrant()
                }
            }
        }
    }
}

@Composable
fun  FourQuadrant() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(Modifier.fillMaxSize()) {
            Row(Modifier.weight(1f)) {
                Quadrant(
                    title = stringResource(R.string.title1),
                    description = stringResource(R.string.description1),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                Quadrant(
                    title = stringResource(R.string.title2),
                    description = stringResource(R.string.description2),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )

            }
            Row(Modifier.weight(1f)) {
                Quadrant(
                    title = stringResource(R.string.title3),
                    description = stringResource(R.string.description3),
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f)
                )
                Quadrant(
                    title = stringResource(R.string.title4),
                    description = stringResource(R.string.description4),
                    backgroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }

}
@Composable
fun  Quadrant(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FourQuadrantPreview() {
    FourQuadrantTheme {
        FourQuadrant()
    }
}