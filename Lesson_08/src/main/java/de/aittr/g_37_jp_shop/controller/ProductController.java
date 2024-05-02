package de.aittr.g_37_jp_shop.controller;

import de.aittr.g_37_jp_shop.domain.dto.ProductDto;
import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // /example/2
/*   @GetMapping("/example/{id}")
    public ProductDto getById(@PathVariable Long id){
        return service.getById(id);
    }*/

    // ?id=2
    @GetMapping
    public ProductDto getById(@RequestParam Long id){
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<ProductDto> getAll(){
        return service.getAll();
    }

    @PostMapping
    public ProductDto save(@RequestBody ProductDto product) {
        return service.save(product);
    }





}
