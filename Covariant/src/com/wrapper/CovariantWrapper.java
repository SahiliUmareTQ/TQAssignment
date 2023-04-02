package com.wrapper;

class First {
	int value;

	Number diplayValue() {

		return value;
	}

}

class Second extends First {

	int Myvalue;

	Integer diplayValue() {

		return Myvalue;
	}

}

/*
 * class Third extends First { char ch;
 * 
 * Character displayvalue() { return ch; }
 * 
 * }
 */

public class CovariantWrapper {

	public static void main(String[] args) {

		Second s1 = new Second();
		Integer n = s1.diplayValue();
		n = n + 5;

	}

}
