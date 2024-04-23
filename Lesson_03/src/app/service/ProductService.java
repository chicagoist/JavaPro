package app.service;

import app.domain.Product;


public interface ProductService {
    Product getById(Long id);
    void setArticle(Product product);
}
