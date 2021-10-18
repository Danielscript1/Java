package entities;

import java.util.ArrayList;

public class Product {
	//atributos
	private String nome;
	private double price;
	private int quantity;
	//----------------------contructor----------------------
	public Product(String nome, double price, int quantity) {
		this.nome = nome;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public Product(String nome, double price) {
		this.nome = nome;
		this.price = price;
		
	}
	//---------------------getesets----------------------
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//----------------------metodos----------------------

	public void addProduct(int quantity) {
		 this.quantity += quantity;
		
	}
	public void removeProduct(int quantity) {
		this.quantity -=quantity;
	}
	public double totalValueInStock() {
		return price*quantity;
	}
	public void ShowResult(String nome,double price,int quantity) {
		System.out.printf("Nome: "+nome+
						   " Preço: $"+price+
						   " Quantidade: "+quantity);
	}
	 
	public String toString() {
		return nome+
		 "Nome: "+nome+
				   " Preço: $"+price+
				   " Quantidade: "+quantity;

	
	}
	
	
}
