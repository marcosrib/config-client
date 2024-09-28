package br.com.banqomun.client_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeteController {


    @Value("${uri.teste}")
    private String uri;
    @GetMapping("teste")
    public String whoami() {
        return uri;
    }
}
