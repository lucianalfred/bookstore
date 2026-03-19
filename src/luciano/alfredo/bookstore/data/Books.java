package luciano.alfredo.bookstore.data;

import luciano.alfredo.bookstore.model.Book;
import luciano.alfredo.bookstore.model.Category;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.net.URI;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Books {
    public static List<Book> all() {
        try {
            String csv = HttpClient.newHttpClient()
                .send(HttpRequest.newBuilder()
                    .uri(new URI("https://turini.github.io/livro-java-9/books.csv"))
                    .GET().build(),    
                    HttpResponse.BodyHandlers.ofString()) 
                .body();
            
            return Stream.of(csv.split("\n"))
                .map(Books::create)
                .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar", e);
        }
    }
    
    public static Book create(String line) {
        String[] split = line.split(",");
        String name = split[0];
        String author = split[2];
        Category category = Category.valueOf(split[3].trim());
        return new Book(name, author, category);
    }
    
    public static Optional<Book> findSimilar(Book book){
    	return Books.all().stream()
    			.filter(b -> b.getCategories().equals(book.getCategories()))
    			.filter(b -> !b.getAuthor().equals(book.getAuthor()))
    			.findAny();
    	
    }
}