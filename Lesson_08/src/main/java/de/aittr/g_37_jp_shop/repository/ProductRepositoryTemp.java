package de.aittr.g_37_jp_shop.repository;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import de.aittr.g_37_jp_shop.repository.interfaces.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

import static de.aittr.g_37_jp_shop.constansts.Constants.*;

@Repository
public class ProductRepositoryTemp implements ProductRepository {

    private Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);

            // address/db_name?user=postgres&password=123
            // jdbc:postgresql://localhost:5432/cars?user=postgres&password=ppp77777
            String dbUrl = String.format("%s%s?user=%s&password=%s",
                    DB_ADDRESS, DB_NAME, DB_USER_NAME, DB_PASSWORD);

            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product getById(Long id) {
        try (Connection connection = getConnection()) {
            String query = String.format("select * from product where id = %d;",
                    id);
            ResultSet resultSet = connection.createStatement().executeQuery(query);
            resultSet.next();
            String title = resultSet.getString("title");
            BigDecimal price = resultSet.getBigDecimal("price");
            boolean isActive = resultSet.getBoolean("is_active");

            return new Product(id, title, price, isActive);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Long id) {

    }
}
