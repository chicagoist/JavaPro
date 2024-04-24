package app.model;

import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CarRepositoryHibernate implements CarRepository {

    private final EntityManager entityManager;

    public CarRepositoryHibernate() {
        this.entityManager = new Configuration()
                .configure("postgres.cfg.xml")
                .buildSessionFactory()
                .createEntityManager();
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public Car getById(Long id) {
        entityManager.getTransaction().begin();
        Car car = entityManager.find(Car.class, id);
        entityManager.getTransaction().commit();
        return car;
    }

    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void delete(Long id) {

    }
}
