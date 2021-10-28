package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 107000));
        cars.add(new Car("Audi", "Q8", 149000));
        cars.add(new Car("BMW", "X5M", 156000));
        cars.add(new Car("Mercedes", "GLE", 123000));
        cars.add(new Car("Toyota", "Tundra", 89000));
        return cars;
    }
}
