package app.controller;

import app.model.Car;
import app.model.CarRepository;
import app.model.CarRepositoryMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CarServlet extends HttpServlet {

    private CarRepository repository = new CarRepositoryMap();

/*    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameters = req.getParameterMap();
        Long id = Long.parseLong(parameters.get("id")[0]);
        resp.getWriter().write(repository.getById(id).toString());
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
}
