package ml.aicode.rest.webservices.basic;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
public class BasicAuthenticatedController {
   
   @GetMapping(path="/basicauth")
   public AuthenticationBean helloWorldBean() {
	  // throw new RuntimeException(" New Exception has happend.");
	   return new AuthenticationBean("You are authenticated");
   }
   
}
