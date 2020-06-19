package com.csandoval.model;

import java.time.LocalDateTime;
import java.util.List;

public class Operation
{

	private List<ProductBuy> products;
	private LocalDateTime operationDate;

	public Operation(List<ProductBuy> products, LocalDateTime operationDate)
	{
		super();
		this.products = products;
		this.operationDate = operationDate;
	}

	public List<ProductBuy> getProducts()
	{
		return products;
	}

	public void setProducts(List<ProductBuy> products)
	{
		this.products = products;
	}

	public LocalDateTime getOperationDate()
	{
		return operationDate;
	}

	public void setOperationDate(LocalDateTime operationDate)
	{
		this.operationDate = operationDate;
	}

}
