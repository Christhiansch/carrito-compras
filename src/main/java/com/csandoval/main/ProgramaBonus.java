package com.csandoval.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.csandoval.model.Product;
import com.csandoval.model.ProductBuy;
import com.csandoval.model.ProductStore;
import com.csandoval.model.ShoppingCart;
import com.csandoval.model.Store;
import com.csandoval.util.Util;

public class ProgramaBonus
{

	private static Store store = null;

	public static void main(String[] args)
	{
		boolean logout = true;
		Scanner sc = new Scanner(System.in);
		List<ProductBuy> productsBuy = new ArrayList<>();
		ShoppingCart shCar = null;

		initStore();
		loadProducts();

		while (logout)
		{
			System.out.println("\n1. Elegir un Producto");
			System.out.println("2. Ver Mi Carrito Compras");
			System.out.println("3. Finalizar Compra");
			System.out.println("4. Mostrar los 3 productos más baratos");
			System.out.println("5. Mostrar los productos más vendidos");
			System.out.println("6. Salir");
			System.out.print("\nSeleccione una de las siguientes opciones: ");
			int opt = sc.nextInt();

			System.out.println();
			switch (opt)
			{
				case 1:
					store.getProducts().stream().sorted(Util::orderProductsAlphabetically).forEach(p -> System.out
					    .format("Nro: %-8d Producto: %-20s \tDisponible: %d%n", p.getIdProduct(), p.getName(), p.getStock()));

					System.out.print("\nSeleccione uno de los Números [1-20]: ");

					int product = sc.nextInt();

					System.out.print("Seleccione la cantidad que desea llevar: ");

					int quantity = sc.nextInt();

					if (store.validateStock(store.getProducts().get(product - 1), quantity))
					{
						Product prod = store.reduceProduct(store.getProducts().get(product - 1), quantity);
						ProductBuy prodBuy = (ProductBuy) prod;
						productsBuy.add(prodBuy);
					}

					break;
				case 2:

					double total = productsBuy.stream().mapToDouble(p -> p.getSalePrice()).sum();
					shCar = new ShoppingCart(productsBuy, total, LocalDateTime.now());

					System.out.println(shCar);

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
		store = new Store();
		store.setIdStore(1);
		store.setNombreTienda("SOCIAL PET");

		System.out.println("======= BIENVENIDOS A LA VETERINARIA " + store.getNombreTienda() + " =======");
	}

	public static void loadProducts()
	{
		Stream<String> productos = null;
		List<ProductStore> pStore = null;
		try
		{
			productos = Files.lines(Paths.get("src/main/resources/productos-tienda.txt"));

			pStore = productos.map(linea -> linea.split(",")) // Stream<String[]>
			    .map(ProductStore::new) // Stream<ProductStore>;
			    .collect(Collectors.toList()); // List<ProductStore>

			store.setProducts(pStore);
			System.out.println("La tienda se ha cargado con productos");

		} catch (IOException e)
		{
			System.out.println("No se ha podido leer el archivo");
			e.printStackTrace();
		}

	}

}
