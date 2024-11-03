package com.bangunsubuh.calmspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bangunsubuh.calmspace.ui.theme.CalmspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalmspaceTheme {
                MainApp()
            }
        }
    }
}