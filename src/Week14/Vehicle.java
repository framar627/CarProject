package Week14;

public class Vehicle {

    int maxSpeed = 0;
    int passengers = 1;
    String fuelType = "";
    String color = "";
    double price = 0.0;

    Vehicle() {
    }

    Vehicle(String color, boolean filled) {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getpassengers() {
        return passengers;
    }

    public String getfuelType() {
        return fuelType;
    }

    public String getcolor() {
        return color;
    }
    public double getprice() {
        return price;
    }

    public void setMaxSpeed(int maxSpeed1) {
        maxSpeed = maxSpeed1;
    }

    public void setPassengers(int passengers1) {
        passengers = passengers1;
    }
    public void setFuelType(String fuelType1) {
        fuelType = fuelType1;
    }

    public void setcolor(String color1) {
        color = color1;
    }
    public void setprice(double price1) {
        price = price1;
    }


}

