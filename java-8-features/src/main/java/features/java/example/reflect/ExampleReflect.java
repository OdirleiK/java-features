package features.java.example.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Iterator;

class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(nome + " - " + preco);
	}
	
}

public class ExampleReflect {

	public static void main (String[] args) {
		//instance of product
		Produto p = new Produto("Geladeira", 3000.00);
		
		//instace of class
		Class cl = p.getClass();
		
		//all methods 
		Method[] declaredMethods = cl.getDeclaredMethods();
		
		for(Method m : declaredMethods) {
			System.out.println(m.getName());
			Parameter[] parameters = m.getParameters();
			
			for(Parameter pr : parameters) {
				System.out.println(pr);
			}
			
		}
		
	}
}

