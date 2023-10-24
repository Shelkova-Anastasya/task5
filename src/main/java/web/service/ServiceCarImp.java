package web.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import web.DAO.DaoCar;
import web.DAO.DaoCarImp;
import web.model.Car;


import java.util.List;
@Service
public class ServiceCarImp implements ServiceCar {

    private final DaoCar daoCar;
    @Autowired
    public ServiceCarImp(DaoCar daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count != null) {
            return daoCar.getCars(count);
        } else {
            return daoCar.getCars();
        }
    }
}


