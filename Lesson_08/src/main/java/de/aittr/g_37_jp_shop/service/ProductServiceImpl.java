package de.aittr.g_37_jp_shop.service;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.repository.interfaces.ProductRepository;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;


    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {

        if(id == null || id < 1) {
            throw new RuntimeException("Product id is incorrect");
        }

        Product product = repository.getById(id);

        if(product == null) {
            throw new RuntimeException("Product not found");
        }

        return product;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByTitle(String title) {

    }

    @Override
    public void restoreById(Long id) {

    }

    @Override
    public int getTotalQuantity() {
        return 0;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return null;
    }

    @Override
    public BigDecimal getAveragePrice() {
        return null;
    }
}
