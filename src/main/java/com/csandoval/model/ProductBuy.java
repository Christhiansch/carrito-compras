package com.csandoval.model;

public class ProductBuy extends Product
{
	
	private Integer cantidad;

	public ProductBuy(Integer idProduct, String name, Category category, Double buyPrice, Double salePrice,
	    Integer cantidad)
	{
		super(idProduct, name, category, buyPrice, salePrice);
		this.cantidad = cantidad;
	}

	public Integer getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(Integer cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public static void show()
	{
			
	}
	
}
