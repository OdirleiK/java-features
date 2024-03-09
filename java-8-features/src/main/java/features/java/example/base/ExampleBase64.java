package features.java.example.base;

import java.util.Base64;

public class ExampleBase64 {

	public static void main(String[] args) { 
		
	try {
		String text = "The class base64 in java 8";
		
		String textEncoder = Base64.getEncoder().encodeToString(text.getBytes("utf-8"));
		
		String textDecoder = new String(Base64.getDecoder().decode(textEncoder), "utf-8");
		
		System.out.println(textEncoder);
		System.out.println(textDecoder);

	} catch (Exception e) {
		e.printStackTrace();
	}
    
	}
}
