package patterners;

import collections.Stock;

public class ProductSingleton {
	
	private static ProductSingleton productSingleton;
	private Stock stock = new Stock();
	
	public static ProductSingleton getInstance(){
        if(productSingleton == null)
        {
        	productSingleton = new ProductSingleton();
        }
        return productSingleton;
    }

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
}
