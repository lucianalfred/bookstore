package luciano.alfredo.bookstore;

import java.util.List;
import java.util.stream.IntStream;

import luciano.alfredo.bookstore.data.Books;
import luciano.alfredo.bookstore.model.Book;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("\nLista de Livros disponiveis \n");
		
		List <Book> books = Books.all();
		
		IntStream.range(0, books.size())
			.forEach(i -> {
				System.out.println(i + " - " + books.get(i).getName());
			});
	}
}
