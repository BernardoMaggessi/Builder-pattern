package application;

import entities.Pizza;

public class Program {

	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder(25).calabresa().bacon().catupiry().build();

	}

}
