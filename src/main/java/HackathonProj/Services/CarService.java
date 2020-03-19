package HackathonProj.Services;

import HackathonProj.Dal.Entities.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;


public interface CarService {
    public String getJsonCarDetailsById(String id) throws JsonProcessingException;
    public void addCar(Car car);
}
