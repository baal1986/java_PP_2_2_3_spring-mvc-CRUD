package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    List<Car> storage = new ArrayList<>(Arrays.asList(
            new Car("BMW", 6, Car.Color.Black),
            new Car("BMW", 5, Car.Color.Blue),
            new Car("BMW", 3, Car.Color.Red),
            new Car("Mercedes-Benz", 600, Car.Color.Red),
            new Car("Mercedes-Benz", 500, Car.Color.Black)
    ));

    public List<Car> getStorage() {
        return storage;
    }

}
