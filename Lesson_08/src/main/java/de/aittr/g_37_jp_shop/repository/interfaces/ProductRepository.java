package de.aittr.g_37_jp_shop.repository.interfaces;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    Product getById(Long id);

    List<Product> getAll();

    void update(Product product);

    void delete(Long id);


}
