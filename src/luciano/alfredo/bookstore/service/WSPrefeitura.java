package luciano.alfredo.bookstore.service;
import luciano.alfredo.bookstore.model.NF;

public class WSPrefeitura {
	
	public static void emit(NF nf) {
		try {
			System.out.println("emitindo...");
			Thread.sleep(5000);
			System.out.println("emitido!");
			
			
		} catch(Exception e) {
			System.out.println("Falha ao emitir a nf ");
		}
	}
}
