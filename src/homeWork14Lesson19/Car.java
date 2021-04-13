package homeWork14Lesson19;

import java.util.Objects;

public class Car {
    private Integer carNum;
    private String model;
    private String color;
    private Integer kms;
    private Integer price;

    public Car(Integer carNum, String model, String color, Integer kms, Integer price) {
        this.carNum = carNum;
        this.model = model;
        this.color = color;
        this.kms = kms;
        this.price = price;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carNum, car.carNum) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(kms, car.kms) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNum, model, color, kms, price);
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
