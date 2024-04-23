package app.controller;

import app.model.CarRepository;
import app.model.CarRepositoryDB;
import app.model.CarRepositoryMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

public class CarServlet extends HttpServlet {

    //private CarRepository repository = new CarRepositoryMap();
    private CarRepository repository = new CarRepositoryDB();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameters = req.getParameterMap();
        Long id = Long.parseLong(parameters.get("id")[0]);
        resp.getWriter().write(repository.getById(id).toString());

    }
}
