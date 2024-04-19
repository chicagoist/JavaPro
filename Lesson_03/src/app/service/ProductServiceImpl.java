package app.service;

import app.domain.Product;
import app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    private String articlePrefix = "Art";
    private ProductRepository repository;

    public ProductServiceImpl(@Qualifier("productRepositoryMap") ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product getById(Long id) {
        Product product = repository.getById(id);
        setArticle(product);
        return product;
        //return repository.getById(id);
    }

    @Override
    public void setArticle(Product product) {
        // prefix-B-id
        String article = String.format("%s-%C-%d",
                 articlePrefix, product.getName().charAt(0), product.getId());
        product.setArticle(article);

    }
}
