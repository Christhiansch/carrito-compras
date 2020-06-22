package com.csandoval.model;

import java.util.List;

public class Store
{

	private Integer idStore;
	private String nombreTienda;
	private List<ProductStore> products;
	private List<Operation> operations;

	public Integer getIdStore()
	{
		return idStore;
	}

	public void setIdStore(Integer idStore)
	{
		this.idStore = idStore;
	}

	public String getNombreTienda()
	{
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda)
	{
		this.nombreTienda = nombreTienda;
	}

	public List<ProductStore> getProducts()
	{
		return products;
	}

	public void setProducts(List<ProductStore> products)
	{
		this.products = products;
	}

	public List<Operation> getOperations()
	{
		return operations;
	}

	public void setOperations(List<Operation> operations)
	{
		this.operations = operations;
	}

	public boolean validateStock(Product product, Integer quantity)
	{
		return ((ProductStore) product).getStock() > quantity ? true : false;
	}

	public Product reduceProduct(Product product, Integer quantity)
	{
		
		int reduce = ((ProductStore) product).getStock() - quantity;
		((ProductStore) product).setStock(reduce);

		return product;
	}

	public void addOperation(ShoppingCart car)
	{

	}

}
