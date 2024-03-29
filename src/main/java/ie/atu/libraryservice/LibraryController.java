package ie.atu.libraryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService us) {this.libraryService = us;}

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book)
    {
        libraryService.addBook(book);
        return "Working" ;
    }
}


