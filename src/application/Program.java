package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("How many products will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.print("Product: ");
			String name = sc.nextLine();
			System.out.print("Value: ");
			Double value = sc.nextDouble();
			System.out.print("Date: (dd/MM/yyyy) ");
			Date date = sdf.parse(sc.next());
			Product prod = new Product(name, value, date);
			list.add(prod);
		}
		
		System.out.println();
		System.out.println("List of products: ");
		for (Product e : list) {
			System.out.println(e);
		}
		
		
		
		
		
		sc.close();
		

	}

}
