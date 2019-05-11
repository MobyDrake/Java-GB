package lesson_2;

public enum DayOfWeek {
    MONDAY(40),
    TUESDAY(32),
    WEDNESDAY(24),
    THURSDAY(16),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);

    private int workHours;

    DayOfWeek(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }
}
