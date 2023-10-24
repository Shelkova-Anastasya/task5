package web.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import web.DAO.DaoCar;
import web.DAO.DaoCarImp;
import web.model.Car;


import java.util.List;
@Service
public class ServiceCarImp implements ServiceCar {
    @Autowired
    private DaoCarImp daoCar;;
    @Override
    public List<Car> getCars(int count) {
        return daoCar.getCars(count);
    }
    @Override
    public List<Car> getCars() {
        return daoCar.getCars();
    }

}
