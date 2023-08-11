package ieee.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Client client;

    @PostMapping("/email")
    public String send(@RequestBody Email email) {
        client.sendEmail(email);
        return "Mail Sent";
    }
}
