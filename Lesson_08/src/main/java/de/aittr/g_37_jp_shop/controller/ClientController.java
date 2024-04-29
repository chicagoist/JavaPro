package de.aittr.g_37_jp_shop.controller;

import de.aittr.g_37_jp_shop.domain.entity.Client;
import de.aittr.g_37_jp_shop.service.interfaces.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/person")
    public Client getById(@RequestParam Long id){
        return service.getById(id);
    }
}
