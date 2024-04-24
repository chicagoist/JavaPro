package app.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
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
        try {
           // entityManager.getTransaction().begin();
           // Car car = entityManager.find(Car.class, id);
           // entityManager.getTransaction().commit();
            return entityManager.find(Car.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public List<Car> getAll() {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<Car> cars = entityManager.createQuery("FROM Car", Car.class).getResultList();
        transaction.commit();
        return cars;
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void delete(Long id) {

    }


}
