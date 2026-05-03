package com.nmichail.daggerlearningmonolite.lesson1

class Activity {

	//val computer : Computer = MyComponent().getComputer()

	lateinit var computer: Computer
	lateinit var keyboard: Keyboard

	init{
		MyComponent().inject(this)
	}
}