package worker;

public class GenerateId {
    private long generateId;

    public long generateId () {
        generateId++;
        return generateId;
    }
}
