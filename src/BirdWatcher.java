
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length -1] = this.birdsPerDay[birdsPerDay.length -1] +1;
    }

    public boolean hasDayWithoutBirds() {
        for (int j : birdsPerDay) {
            if (j == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int days = numberOfDays;
        if(days > birdsPerDay.length -1)
            days = birdsPerDay.length -1;
        int num = 0;
        for(int i = 0; i < days; i++){
            num += birdsPerDay[i];
        }
        return num;
    }

    public int getBusyDays() {
        int days = 0;
        for (int j : birdsPerDay) {
            if (j >= 5)
                days++;
        }
        return days;
    }
}
