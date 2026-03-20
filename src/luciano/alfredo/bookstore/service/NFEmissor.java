package luciano.alfredo.bookstore.service;

import java.util.concurrent.SubmissionPublisher;
import luciano.alfredo.bookstore.model.*;

public class NFEmissor {
	
	private SubmissionPublisher<NF> publisher;
	
	public NFEmissor() {
		this.publisher = new SubmissionPublisher<>();
		publisher.subscribe(new NFSubscriber());
	}
	
	public void emit(String clientName, Book book) {
		NF nf = new NF(clientName, book.getName(), 399.99);
		publisher.submit(nf);
	}
	
	public void close() {
		this.publisher.close();
	}
	
}
