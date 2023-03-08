package kata;

public class Clock {

    private int hours;
    private int minutes;

    public Clock (int hours, int minutes) {
        normalizeClock(hours,minutes);
    }

    private void normalizeClock (int hours, int minutes) {
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;
        this.hours = hours;
        this.minutes = minutes;
    }

    public Clock addMinutes(int minutesToAdd) {
        int minutes = this.minutes + minutesToAdd;
        return new Clock(this.hours, minutes);
    }

    public Clock addClocks(Clock clock) {
        int hours = this.hours + clock.getHours();
        int minutes = this.minutes + clock.getMinutes();

        return new Clock(hours, minutes);
    }

    public int getHours () {
        return hours;
    }

    public int getMinutes () {
        return minutes;
    }

    public String toString () {
        //return hours + ":" + minutes;
        return String.format("%02d:%02d", hours, minutes); // %02d это формат для двухзначного числа с ведущим нулем. В данном случае мы форматируем часы и минуты с ведущим нулем.
    }
}
