package com.demo.restaurant;

import java.util.Scanner;

public class RestaurantBillingSystem {

	public static void main(String[] args) {
		
		System.out.println("**  Welcome to Better Hands-On Food Hub  **");
		System.out.println();
		System.out.println("Thanks for order Veg. Thali, cost = Rs. 100.00/-");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int total = 100,cost = 0;
		
		int selectedItemNumber = 0;
		
		ItemList.seeItemList();
		
		do {
			
			System.out.print("Select Item Please :  ");
			
			selectedItemNumber = sc.nextInt();
			
			boolean check = checkItemNumber(selectedItemNumber);
			
			cost = 0;
			
			if(check)cost = ItemCost.addItem(selectedItemNumber);
		    
			total += cost;
			
		} while (selectedItemNumber != 5);
		
		System.out.println("**  We are happy to serve you, please check the total bill = Rs. " + total + "/-");
		
		sc.close();
		
	}
	
	public static boolean checkItemNumber(int itemNumber) {
		
		if(itemNumber > 5 || itemNumber < 1) {
			System.out.println("	Please press option between 1 to 5");
			return false;
		}
		
		return true;
	}

}
