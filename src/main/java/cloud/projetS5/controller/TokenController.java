package cloud.projetS5.controller;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.*;

import cloud.projetS5.model.BearerToken;
import cloud.projetS5.model.Reponse;
import cloud.projetS5.model.Token;

@RequestMapping("apiToken")
@RestController
public class TokenController {
    private final String nomToken = "myToken";

    @PostMapping("/test")
    public Reponse<String> login() {
        Reponse<String> ans = new Reponse<>();
        try {
            ans.setRemarque("Votre token : ");
        } catch (Exception e) {
            ans.setErreur(e.getMessage());
        }
        return ans;
    }
}