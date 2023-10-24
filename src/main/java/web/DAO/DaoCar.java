package web.DAO;

import web.model.Car;

import java.util.List;

public interface DaoCar {
    List<Car> getCars(int count);
    List<Car> getCars();
}
