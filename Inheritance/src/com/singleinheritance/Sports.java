package com.singleinheritance;

abstract class Game {

	abstract void rule();

	void gameMethod() {
		System.out.println("Game start");
	}

	Game() {
		System.out.println("Default constructor");

	}

}

class Football extends Game {

	@Override
	void rule() {
		System.out.println("Rules for football");
	}

	void footballMethod() {
		System.out.println("Its football");
	}

}

class Basketball extends Game {

	@Override
	void rule() {

		System.out.println("Rules for Basketball");
	}

	void BasketballMethod() {
		System.out.println("Its Basketball");
	}

}

public class Sports {

	public static void main(String[] args) {

		Game g1 = new Football();
		g1.gameMethod();
		g1.rule();

		Game g2 = new Basketball();
		g2.rule();

	}

}
