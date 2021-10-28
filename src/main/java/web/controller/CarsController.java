package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String CarsForSale(@RequestParam(value = "count", required = false, defaultValue = "5") int count,
                              @RequestParam(value = "brand", required = false, defaultValue = "") String brand, Model model) {

        model.addAttribute("car", carService.getCars(brand, count));

        return "cars";
    }
}
