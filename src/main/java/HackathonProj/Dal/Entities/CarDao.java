package HackathonProj.Dal.Entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface CarDao extends JpaRepository<Car, String> {
}
