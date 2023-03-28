package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Chevrolet", 1, "yellow"));
        cars.add(new Car("Volkswagen", 2, "black"));
        cars.add(new Car("BMW", 3, "grey"));
        cars.add(new Car("Porshe", 4, "green"));
        cars.add(new Car("Lada", 5, "red"));
    }


    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
