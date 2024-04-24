package app.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepositoryMap implements CarRepository {

    private final Map<Long, Car> database = new HashMap<>();
    private long currentId;

    public CarRepositoryMap() {
        save(new Car("VW", new BigDecimal(10000), 2000));
        save(new Car("Opel", new BigDecimal(9000), 1000));
        save(new Car("BMW", new BigDecimal(15000), 3000));
    }


    @Override
    public Car save(Car car) {
        ++currentId;
        car.setId(currentId);
        database.put(currentId, car);
        return car;
    }

    @Override
    public Car getById(Long id) {
        return database.get(id);
    }


    @Override
    public List<Car> getAll() {
        //return new ArrayList<>(database.values());
        return database.values().stream().toList();
    }

    @Override
    public void update(Car car) {

        Car foundCar = database.get(car.getId());
        if (foundCar != null) {
            foundCar.setPrice(car.getPrice());
        }
        //database.put(car.getId(),car);
    }

    @Override
    public void delete(Long id) {
        database.remove(id);
    }
}
