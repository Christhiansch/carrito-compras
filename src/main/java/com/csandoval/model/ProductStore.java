package com.csandoval.model;

public class ProductStore extends Product
{

	private Integer stock;
	private Integer stockMin;
	

	public ProductStore(Integer idProduct, String name, Category category, Double buyPrice, Double salePrice,
	    Integer stock, Integer stockMin)
	{
		super(idProduct, name, category, buyPrice, salePrice);
		this.stock = stock;
		this.stockMin = stockMin;
	}

	public Integer getStock()
	{
		return stock;
	}

	public void setStock(Integer stock)
	{
		this.stock = stock;
	}

	public Integer getStockMin()
	{
		return stockMin;
	}

	public void setStockMin(Integer stockMin)
	{
		this.stockMin = stockMin;
	}

}
