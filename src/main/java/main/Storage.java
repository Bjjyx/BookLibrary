package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.model.Book;

public class Storage {

    private static int currentId = 1;
    private static final Map<Integer, Book> books = new HashMap<>();

    public static List<Book> getAllBooks() {
        return new ArrayList<Book>(books.values());
    }

    public static int addBook(Book book) {
        int id = currentId++;
        book.setId(id);
        books.put(id, book);
        return id;
    }

    public static Book getBook(int bookId) {
        if (books.containsKey(bookId)) {
            return books.get(bookId);
        }
        return null;
    }
}