package com.csandoval.main;

import java.util.Scanner;

import com.csandoval.model.Store;

public class ProgramaBonus
{

	public Store store = new Store();

	public static void main(String[] args)
	{
		boolean logout = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== BIENVENIDOS A LA VETERINARIA SOCIALPET ==========");
		
		while (logout)
		{			
			System.out.println("1. Ver Productos");
			System.out.println("2. Ver Mi Carrito Compras");
			System.out.println("3. Finalizar Compra");
			System.out.println("4. Mostrar los 3 productos más baratos");
			System.out.println("5. Mostrar los productos más vendidos");
			System.out.println("6. Salir");
			System.out.println("\nSeleccione una de las siguientes opciones: ");
			
			int opt = sc.nextInt();
			switch (opt)
			{
				case 1:					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					break;
			}
		}
		
	}

	public static void initStore()
	{

	}

	public static void loadProducts()
	{

	}
}
