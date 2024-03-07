package features.java.example.referencemethod;


interface Figura {
	//Para que um metodo da interface funcional seja referecniado pelo construtor de uma classe
	// O metodo dessa interface funcional tem que retornar o tipo da calsse cujo o construtor ta sendo referenciado 
    RetanguloNew desenha(Double largura, Double altura);
}

class RetanguloNew {
	public RetanguloNew(Double largura, Double altura) {
		System.out.println("Desenha retangulo Largura:" + largura + " Altura:" + altura);
	}
}

public class ExampleMethodReferenceAConstructor {

	public static void main(String[] args) {

		Figura fig1 = RetanguloNew::new;
		fig1.desenha(4.0, 19.0);
	}
}
