public class CarsAssemble {

    private final int cars = 221;

    public double productionRatePerHour(int speed) {
        if(speed <= 4)
            return speed*cars;
        if(speed <=8)
            return speed*cars*0.9;
        if(speed == 9)
            return speed*cars*0.8;

        return speed*cars*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
