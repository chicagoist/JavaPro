package app.controller;

import app.model.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class CarServlet extends HttpServlet {

    //private CarRepository repository = new CarRepositoryMap();
    //private CarRepository repository = new CarRepositoryDB();
    private final CarRepository repository = new CarRepositoryHibernate();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String search = req.getParameter("search");
        if (search == null) {
            Long id = Long.parseLong(req.getParameter("id"));
            Car car = repository.getById(id);
            if (car != null) {
                resp.getWriter().write(car.toString());
            } else {
                resp.setStatus(404);
            }
        } else if (search.equals("all")) {
            List<Car> cars = repository.getAll();
            resp.getWriter().write(cars.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        int year = Integer.parseInt(req.getParameter("year"));
        Car car = new Car(brand, price, year);

        if (car != null) {
            repository.save(car);
            resp.setStatus(HttpServletResponse.SC_CREATED);
            resp.getWriter().write("УДАЛОСЬ!");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("НЕ УДАЛОСЬ!");
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        Car carToPut = repository.getById(id);
        if (carToPut != null) {
            carToPut.setPrice(price);
            repository.update(carToPut);
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("УДАЛОСЬ!");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("НЕ УДАЛОСЬ!");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Car carToDel = repository.getById(id);

        if (carToDel != null) {
            repository.delete(id);
            resp.getWriter().write("УДАЛОСЬ!");
            resp.setStatus(HttpServletResponse.SC_OK);
        } else {
            resp.getWriter().write("НЕ УДАЛОСЬ!");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
