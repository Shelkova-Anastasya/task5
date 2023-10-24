package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCarImp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    private ServiceCarImp serviceCar;


    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", serviceCar.getCars(count));
        return "cars";
    }
}
