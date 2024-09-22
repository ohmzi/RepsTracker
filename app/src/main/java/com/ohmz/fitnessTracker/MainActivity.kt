package com.ohmz.fitnessTracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ohmz.fitnessTracker.UI.View.screens.FitnessTrackerUI
import com.ohmz.fitnessTracker.UI.View.theme.FitnessTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitnessTrackerTheme {
                FitnessTrackerUI()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FitnessTrackerUIPreview() {
    FitnessTrackerTheme {
        FitnessTrackerUI()
    }
}