package de.aittr.g_37_jp_shop.repository;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    // Standart
    //Product findByTitle(String title);


    // Add SQL query
    @Query(value = "SELECT * FROM product WHERE title = :title",nativeQuery = true)
    Product findByTitle(@Param("title") String productTitle);

}
