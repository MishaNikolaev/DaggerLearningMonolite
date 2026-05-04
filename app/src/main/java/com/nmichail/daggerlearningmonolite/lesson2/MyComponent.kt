package com.nmichail.daggerlearningmonolite.lesson2

class MyComponent {

	fun getComputer(): Computer {
		val monitor = Monitor()
		val mouse = Mouse()
		val keyboard = Keyboard()
		val computerTower = ComputerTower(
			Memory(),
			Storage(),
			Processor()
		)
		return Computer(computerTower, monitor, mouse, keyboard)
	}

	 //fun inject(activity: Activity) {
	//	 activity.keyboard = Keyboard()
	//}
}