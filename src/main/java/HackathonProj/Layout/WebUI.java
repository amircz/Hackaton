package HackathonProj.Layout;

import HackathonProj.Dal.Entities.Car;
import HackathonProj.Services.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebUI {
    private CarService carService;

    public WebUI() {
    }
    public CarService getCarService() {
        return carService;
    }
    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get_Car_Details")
    public String getCarDetails(@RequestParam("carnumber") String carNumber) throws JsonProcessingException {
        Car car=new Car();
        car.setCarNumber("1");
        car.setColor("white");
        car.setFirm("honda");
        car.setOwnerName("yarin");
        car.setOwnerPhone("1234");
        this.carService.addCar(car);
        return this.carService.getJsonCarDetailsById(carNumber);
    }
}
