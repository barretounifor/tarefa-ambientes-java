import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/test")
public class Test {

    @GetMapping(path = "/")
    public ResponseEntity test() {
        return new ResponseEntity<>("salve cria", HttpStatus.ACCEPTED);
    }
}