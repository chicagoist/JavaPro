package de.aittr.g_37_jp_shop.service.interfaces;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> getAll();

    Product getById(Long id);

    void update(Product product);

    void deleteById(Long id);

    void deleteByTitle(String title);

    void restoreById(Long id);

    int getTotalQuantity();

    BigDecimal getTotalPrice();

    BigDecimal getAveragePrice();

}
