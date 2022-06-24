package oauth2.client.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String email(Principal principal) {
        return "You are already logged in with: " + principal.getName();
    }
}