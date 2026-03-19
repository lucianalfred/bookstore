I developed a book management system in Java that consumes data from an external API using the new native HTTP client (java.net.http).

MAIN FEATURES:
• Integration with REST API to obtain a book catalog
• Data processing in CSV format
• Simplified object-relational mapping (ORM)
• Use of modern Java features (Stream API, Varargs, List.of)

 TECHNOLOGIES USED:
• Java 11+ (HttpClient, Stream API, Optional)
• Consumption of REST API via HTTP GET
• CSV file processing
• Functional programming with Streams
• Robust exception handling

TECHNICAL DETAILS:
The project makes an HTTP request to obtain a CSV file with book data, processes each line using the Java Stream API, converts the data into Book objects, and organizes them into a list. This project utilizes the new HTTP client introduced in Java 11 (java.net.http), which replaces the old Apache HttpClient API.

The system also demonstrates the use of varargs to allow a book to be flexibly associated with multiple categories, and the Records API for creating immutable data classes (if applicable).

This project was developed as part of my modern Java learning, focusing on best practices for API consumption and data processing.
