package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;
import java.util.ArrayList;

import java.util.*;
import java.util.stream.*;

@Repository
public class DaoCarImp implements DaoCar {
    private final List<Car> list;

    public DaoCarImp() {
        list = new ArrayList<>();
        list.add(new Car("Toyota", "Funcargo", 546));
        list.add(new Car("Nissan", "Sirena", 68546));
        list.add(new Car("Volga", "Nan", 818));
        list.add(new Car("Lada", "Priora", 7852));
        list.add(new Car("Yusdgf", "Psfafara", 645287));
    }

    @Override
    public List<Car> getCars(int count) {

        if (count > 0 && count < list.size()) {
            return list.subList(0, count);
        } else {
            return list;
        }
    }
    @Override
    public List<Car> getCars() {
        return  list;
    }
}
