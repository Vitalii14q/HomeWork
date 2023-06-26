package objectOop;



import java.util.Date;

public class WhatsAppMessage {

    private final long id;
    private String colour;
    private Date sendingTime;
    private boolean isDelivered;
    private String message;
    static long idGenerator = 0;

    public WhatsAppMessage (String colour, String message, Date sendingTime) {

        this.id = idGenerator++;
        this.colour = colour;
        this.sendingTime = sendingTime;
        this.isDelivered = false;
        this.message = message;
    }

    @Override
    public String toString() {
        return "WhatsAppMessage{" +
                "colour='" + colour + '\'' +
                ", sendingTime=" + sendingTime +
                ", isDelivered=" + isDelivered +
                ", message='" + message + '\'' +
                '}';
    }

    public void setColour(String green) {
        this.colour = colour;
    }

    public String getColour () {
         return colour;
    }

    public void spekSentTime () {
        System.out.println(sendingTime);
    }

    public void setSendingTime (Date sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Date getSendingTime () {
        return sendingTime;
    }

    public void setIsDelivered (boolean isDelivered) {
        this.isDelivered = true;
    } // нужно спросить у класса тру или фолс

    public boolean isDelivered () {
        return isDelivered;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return message;
    }

    public long getId () {
        return id;
    }

}

