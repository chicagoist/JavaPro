package de.aittr.g_37_jp_shop.service;

import de.aittr.g_37_jp_shop.domain.dto.ProductDto;
import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.repository.ProductRepository;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import de.aittr.g_37_jp_shop.service.mapping.ProductMappingService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;
    private ProductMappingService mappingService;

    public ProductServiceImpl(ProductRepository repository, ProductMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    @Override
    public ProductDto save(ProductDto dto) {
        Product entity = mappingService.mapDtoToEntity(dto);
        repository.save(entity);
        return mappingService.mapEntityToDto(entity);
    }

    @Override
    public List<ProductDto> getAll() {
        return repository.findAll()
                .stream()
              //  .filter(x -> x.isActive())
                .filter(Product::isActive)
   //             .map(x -> mappingService.mapEntityToDto(x))
                .map(mappingService::mapEntityToDto)
                .toList();

    }

    @Override
    public ProductDto getById(Long id) {
        if (id == null || id < 1) {
            throw new RuntimeException("Product id is incorrect");
        }

        Product product = repository.findById(id).orElse(null);

        if (product == null) {
            throw new RuntimeException("Product not found");
        }

        return mappingService.mapEntityToDto(product);
    }

    @Override
    public void update(ProductDto dto) {

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
