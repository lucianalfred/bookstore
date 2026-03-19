package luciano.alfredo.bookstore.data;
import luciano.alfredo.bookstore.model.Book;

import java.net.http.HttpClient;
import java.util.List;
import java.net.URI;
import java.net.http.*;

public class Books {
	public static List<Book> all(){
		try {
			String csv = HttpClient.newHttpClient()
					.send(HttpRequest.newBuilder()
							.uri(new URI(""))
							.GET().build
		}
	}
}
