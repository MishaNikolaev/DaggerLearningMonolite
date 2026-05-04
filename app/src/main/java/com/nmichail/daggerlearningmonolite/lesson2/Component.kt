package com.nmichail.daggerlearningmonolite.lesson2

import dagger.Component

@Component
interface Component {

	//fun inject(activity: Activity)

	fun getMouse() : Mouse

	fun getMonitor() : Monitor

	fun getKeyboard() : Keyboard
}