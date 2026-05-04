package com.nmichail.daggerlearningmonolite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nmichail.daggerlearningmonolite.lesson2.Activity
import com.nmichail.daggerlearningmonolite.ui.theme.DaggerLearningMonoliteTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			DaggerLearningMonoliteTheme {
				val activity = Activity()
				activity.keyboard.toString()
				activity.mouse.toString()
				activity.monitor.toString()
			}
		}
	}
}