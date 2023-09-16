public class ElonsToyCar {

    private int battery = 100;
    private int distance;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if(battery== 0)
            return "Battery empty";
        return "Battery at " + this.battery +"%";
    }

    public void drive() {
        if(this.battery != 0) {
            this.distance += 20;
            this.battery -= 1;
        }
    }
}

