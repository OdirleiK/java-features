package features.java.example.trycatchresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleTryCatchResource {

	public static void main(String[] args) throws IOException {
		
		ExampleTryCatchResource.lerArquivoComBlocoTryCatchFinnlay("file.txt");
	}
	
	//Antes do java 7 
	public static void lerArquivoComBlocoTryCatchFinnlay(String path) throws IOException {

		String linha = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		try {
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}catch(IOException e) {
			throw e;
		}finally {
			if(br != null) {
				br.close();
			}
		}
		
	}
	
	//A partir do java 7
	public static void lerArquivoTryComResource(String path) throws Exception {
		String linha = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			while((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}
	}
	
	//A partir do java 9
		public static void lerArquivoTryComResource9(String path) throws Exception {
			String linha = "";
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			try(br) {
				while((linha = br.readLine()) != null) {
					System.out.println(linha);
				}
			}
		}
}
