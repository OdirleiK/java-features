package java.lambda;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread 1");
			}
		});
		t1.start();
		
		//O construtor da classe Thread pede uma interface Runnable e tal interface so tem um unico metodo abstrato run()
		// entao não ha necessidade de explicitar 
		Thread t2 = new Thread ( () -> System.out.println("Thread 2"));
		t2.start();
	}

}
