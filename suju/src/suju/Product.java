package suju;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Product {
	
	public static HashMap<Integer, Product> PRODUCT = new HashMap<>();

	
	String pName;
	int wHouse, stock;

	
	public Product(String pName, int wHouse, int stock) {
		super();
		this.pName = pName;
		this.wHouse = wHouse;
		this.stock = stock;
	}
	public String getpName() {
		return pName;
	}
	@Override
	public String toString() {
		return "상품명 : " + pName + "\t 재고 : " + stock + "\t 창고 : " + wHouse + "]";
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getwHouse() {
		return wHouse;
	}
	public void setwHouse(int wHouse) {
		this.wHouse = wHouse;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

	
}
