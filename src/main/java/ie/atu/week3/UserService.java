package ie.atu.week3;


import ie.atu.libraryservice.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String name, String email) {

        emailService.sendEmail(email, "Welcome to our platform!");
    }
}


