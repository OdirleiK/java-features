import java.util.ArrayList;
import java.util.List;

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
	
}


public class LambdaExampleWithArguments {
 
	public static void main(String[] args) { 
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("tv 50", 2000.00));
		lista.add(new Produto("tv 40", 3000.00));
		lista.add(new Produto("tv 30", 2000.00));
		lista.add(new Produto("tv 60", 6000.00));

	//	lista.forEach((p) -> System.out.println(p.getNome()));
		
		lista.sort( (p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		
		lista.forEach((p) -> {
			System.out.println(p.getNome());
			System.out.println(p.getPreco());
		});

		
	}
}
