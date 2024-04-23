package app.model;

import app.constants.Constants;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;

import static app.constants.Constants.*;

public class CarRepositoryDB implements CarRepository {

    private long currentId;

    private Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);

            // jdbc:postgresql://localhost:5432/gr_37_jp_cars?user=postgres&password=qwerty007
            String dbUrl = String.format("%s%s?user=%s&password=%s",
                    DB_ADRESS, DB_NAME, DB_USERNAME, DB_PASSWORD);

            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Car save(Car car) {

        try (Connection connection = getConnection()) {
            //Long id = ++currentId;\
            String query = "INSERT INTO car (brand, price, year) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setBigDecimal(2, car.getPrice());
            preparedStatement.setInt(3, car.getYear());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0) {
                throw new RuntimeException("НЕ УДАЛОСЬ ДОСТУЧАТЬСЯ ДО БД");
            }

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

            if (generatedKeys.next()) {
                Long id = generatedKeys.getLong(1);
                car.setId(id);
                return car;
            } else {
                throw new RuntimeException("Не удадось создать id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Car getById(Long id) {

        try (Connection connection = getConnection()) {

            // SELECT * FROM car WHERE id = 2
            String query = String.format("SELECT * FROM car WHERE id = %d", id);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            String brand = resultSet.getString("brand");
            BigDecimal price = resultSet.getBigDecimal("price");
            int year = resultSet.getInt("price");

            return new Car(id, brand, price, year);

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Car> getAll() {
        try (Connection connection = getConnection()) {


        } catch (Exception e) {

            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(Car car) {

        try (Connection connection = getConnection()) {


        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }


    @Override
    public void delete(Long id) {

        try (Connection connection = getConnection()) {


        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
