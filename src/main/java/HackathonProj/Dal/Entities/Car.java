package HackathonProj.Dal.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Cars")
public class Car {
    @Id
    @JsonProperty
    @Column(name = "Car_Number")
    private String carNumber;

    @JsonProperty
    @Column(name = "color")
    private String color;

    @JsonProperty
    @Column(name = "firm")
    private String firm;

    @JsonProperty
    @Column(name = "owner_name")
    private String ownerName;

    @JsonProperty
    @Column(name = "owner_phone")
    private String ownerPhone;

    public Car() {
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getColor() {
        return color;
    }

    public String getFirm() {
        return firm;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setColor(String color) {
        this.color= color;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
