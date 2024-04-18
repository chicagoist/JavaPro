package app.service;

import app.domain.Product;
import app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {



    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void setArticle(Product product) {

    }
}
