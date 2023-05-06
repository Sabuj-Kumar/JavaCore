package com.demo.restaurant;

public class ItemCost {
	
	public static int addItem(int seletedItemNumber) {
		
		switch (seletedItemNumber) {
		
			case 1: // If Customer Press 1 then business logic for adding Egg in Menu.
				System.out.println("Thanks for adding Egg in your menu, cost = Rs. 20.00");
				return 20;
			case 2: // If Customer Press 2 then business logic for adding Chicken in Menu.
				System.out.println("Thanks for adding Chicken in your menu, cost = Rs. 100.00");
				return 100;
			case 3: // If Customer Press 3 then business logic for adding Mutton in Menu.
				System.out.println("Thanks for adding Mutton in your menu, cost = Rs. 150.00");
				return 150;
			 // If Customer Press 4 then business logic for Pannier Mutton in Menu.
			case 4:
				System.out.println("Thanks for adding Pannier in your menu, cost = Rs. 50.00");
				return 50;
			default:
				//System.out.println("Thanks for adding Pannier in your menu, cost = Rs. 50.00");
				return 0;
		}
	}
}
