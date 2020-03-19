package HackathonProj.Services.services.impl;

import HackathonProj.Dal.Entities.Car;
import HackathonProj.Dal.Entities.CarDao;
import HackathonProj.Services.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl() {
    }

    public CarDao getCarDao() {
        return carDao;
    }
    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public String getJsonCarDetailsById(String id) throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        String carDetailsJson=objectMapper.writeValueAsString(this.carDao.getOne(id));
        return carDetailsJson;
    }

    @Override
    public void addCar(Car car) {
        this.carDao.save(car);
    }
}
