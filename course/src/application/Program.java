package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name= sc.nextLine();
		System.out.println("Price: ");
		product.price=sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity=sc.nextInt();
		
		System.out.println();
		System.out.println("Product data:" + product);
		
		System.out.print("Enter the number of products to be added in stock:  ");
		System.out.println();
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data:"+ product);
		System.out.println();
		
		System.out.print("Enter the number of products to be remove in stock:  ");
		System.out.println();
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data:"+ product);
		System.out.println();
		
		
		
		sc.close();
	}

}
