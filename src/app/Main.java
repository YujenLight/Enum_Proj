package app;

public class Main {

    public static void main(String[] args) {
        DayAdvisor advisor = new DayAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}
