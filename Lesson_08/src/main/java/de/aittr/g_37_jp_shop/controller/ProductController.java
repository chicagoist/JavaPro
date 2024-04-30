package de.aittr.g_37_jp_shop.controller;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // /example/2
/*    @GetMapping("/example/{id}")
    public Product getById(@PathVariable Long id){
        return service.getById(id);
    }*/

    // ?id=2
    @GetMapping("/example")
    public Product getById(@RequestParam Long id){
        return service.getById(id);
    }



}
