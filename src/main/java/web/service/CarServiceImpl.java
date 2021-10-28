package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(String brand, int count) {
        return carDao.getCars().stream().filter(s -> s.getBrand().contains(brand)).limit(count).collect(Collectors.toList());
    }

}
