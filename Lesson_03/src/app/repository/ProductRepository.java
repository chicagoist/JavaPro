package app.repository;

import app.domain.Product;

public interface ProductRepository {
    Product getById(Long id);
}
