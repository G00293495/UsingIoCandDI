package ie.atu.libraryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService us) {this.libraryService = us;}

    @PostMapping("addBook/{book}")
    public String getUser(@PathVariable Book book)
    {
        libraryService.addBook(book);
        return "Working" ;
    }
}


