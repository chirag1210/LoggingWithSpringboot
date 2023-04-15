package in.chirag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

    Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

    @GetMapping("/welcome")
    public String welcomeMsg() {
       logger.info("get welcome msg executed");
        return "Welcome Chirag, your spring boot app deployed onto the aws";
    }
}
