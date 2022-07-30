package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;
    private int ID;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "V6", "Red", ++ID));
        cars.add(new Car("Audi", "V8", "White", ++ID));
        cars.add(new Car("BMW", "V8", "Violet", ++ID));
        cars.add(new Car("Volvo", "V6", "Dark-blue", ++ID));
        cars.add(new Car("Mercedes-Benz", "V10", "Black", ++ID));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
