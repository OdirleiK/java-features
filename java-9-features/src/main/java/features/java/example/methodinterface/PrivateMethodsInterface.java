package features.java.example.methodinterface;

public interface PrivateMethodsInterface {
	
	default void logInfo(String message) {
		log(message, "info");
	}
	
	default void logWarn(String message) {
		log(message, "Warn");
	}
	
	default void logError(String message) {
		log(message, "Error");
	}
	
	default void logFatal(String message) {
		log(message, "Fatal");
	}

	// new feature java 9
	private void log(String message, String tipo) {
		System.out.println("INICIO DA MENSAGEM");
		System.out.println(tipo + ": " message);
		System.out.println("FIM DA MENSAGEM");

	}
}
