package com.nmichail.daggerlearningmonolite.lesson2

import javax.inject.Inject

class Activity {

	val keyboard: Keyboard = DaggerComponent.create().getKeyboard()

	val monitor: Monitor = DaggerComponent.create().getMonitor()

	val mouse : Mouse = DaggerComponent.create().getMouse()

}