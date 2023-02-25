package ObjectOop;

public class IdGenerator {

    private long curentId = 0;

    public long generateId () {
        curentId++;
        return curentId;

    }
}
