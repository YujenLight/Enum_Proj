package app;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Stay focused and productive at work!");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Enjoy your weekend! Consider visiting a park or a museum.");
            default ->
                    throw new IllegalStateException("Unexpected value: " + day);
        }
    }
}
