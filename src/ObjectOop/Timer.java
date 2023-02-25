package ObjectOop;

public class Timer {

    private long currentTime;
    private long stopTime;

    public void start () {
        currentTime = System.currentTimeMillis();
    }

    public void stop () {
        stopTime = System.currentTimeMillis();
    }

    public long getTime (char unit) {
        if (currentTime == 0 || 0 == stopTime) {  //проверка запущен ли старт и стоп
            return -1;
        }
        long resultTime = stopTime - currentTime; //время милисек.

        if (unit == 's') {
            resultTime /= 1000; //время секундах.
        }
        else if (unit == 'm') {
            resultTime /= 60000; //время в минутах
        }
        else if (unit == 'h') {
            resultTime /= 3600000; //время в часах
        }
        return resultTime;
    }
}

