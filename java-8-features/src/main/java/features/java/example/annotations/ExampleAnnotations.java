package features.java.example.annotations;

import java.lang.annotation.*;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Voltagens.class)
@interface Voltagem {
	String tensao();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens{
	Voltagem[] value();
}

@Voltagem(tensao = "110")
@Voltagem(tensao = "220")
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

public class ExampleAnnotations {

	public static void main(String[] args) {
		Voltagem[] volts = Produto.class.getAnnotationsByType(Voltagem.class);
		
		for(Voltagem v : volts) {
			System.out.println(v.tensao());
		}
	}
}
