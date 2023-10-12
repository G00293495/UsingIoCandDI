package ie.atu.libraryservice;

import java.util.Collections;
import java.util.List;

public class LibraryService {
    public void addBook(Book book){
    System.out.println("Adding book " + book.getTitle());
    }
    public List<Book> getBooks(){
        return Collections.emptyList();
    }
}

