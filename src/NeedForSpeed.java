class NeedForSpeed {
    private int speed;
    private int distance;
    private int batteryDrain;
    private int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery<batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()){
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return battery;
    }
}

class RaceTrack {

    private double distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return (distance / car.getSpeed() * car.getBatteryDrain() <= car.getBattery());
    }
}
