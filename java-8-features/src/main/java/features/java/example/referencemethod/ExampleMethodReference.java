package features.java.example.referencemethod;


interface Figura2D {
	void desenha(Double largura, Double altura);
}

class Retangulo {
	public void desenhaRetangulo(Double largura, Double altura) {
		System.out.println("Desenha retangulo Largura:" + largura + " Altura:" + altura);
	}
}

public class ExampleMethodReference {

	public static void main(String[] args) {
		//with lambda 
		Figura2D fig1 = (l, a) -> System.out.println("Desenha figura Largura:" + l + " Altura:" + a);
		fig1.desenha(5.0, 2.5);

		//Objeto especifico
		Retangulo ret = new Retangulo();
		//method reference
		Figura2D fig2 = ret::desenhaRetangulo;
		fig2.desenha(10.3, 6.9);
		
	}
}
