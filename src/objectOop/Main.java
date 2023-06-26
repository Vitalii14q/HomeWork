package objectOop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Ostrich ostrich = new Ostrich("Vasilii", 200, 160, "Gold", "black");
        //ostrich.age = 99;
        //ostrich.color = "black";
        //ostrich.longLeg = 2000;
        //ostrich.breed
        //ostrich.weight = 150;

        ostrich.setAge(2);
        System.out.println(ostrich.toString());
        ostrich.spekName();
        System.out.println(ostrich.getBreed());
        System.out.println(ostrich.getAge());
        ostrich.setColor("black");
        ostrich.setName("Vasilii");
        System.out.println(ostrich.getName());
        ostrich.setWeight(150);
        System.out.println(ostrich.getWeight());
        ostrich.setLongLeg(350);
        System.out.println(ostrich.getLongLeg());


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);

        Date moment = dateFormat.parse("2005-03-27 01:30:00");

        IdGenerator idGenerator = new IdGenerator();
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage("green","Привет. как дела)", moment);
        WhatsAppMessage whatsAppMessage1 = new WhatsAppMessage("green","Привет. как дела)", moment);
        System.out.println("Id" + whatsAppMessage.getId());
        System.out.println("Id" + whatsAppMessage1.getId());
        System.out.println(WhatsAppMessage.idGenerator);
        Timer whatsAppTimer = new Timer();
        whatsAppTimer.start();

        whatsAppMessage.setColour("green");
        System.out.println(whatsAppMessage.getColour());
        whatsAppMessage.setMessage("Привет. как дела");
        System.out.println(whatsAppMessage.getMessage());
        whatsAppMessage.spekSentTime();
        System.out.println(whatsAppMessage.isDelivered());
        whatsAppMessage.setIsDelivered(true);
        System.out.println(whatsAppMessage.isDelivered());

        int i = 1;
        for (int j = 2; j < i ; j++) {
            for (int k = 0; k < i; k++) {
                System.out.println(k);
            }
        }

        whatsAppTimer.stop();
        System.out.println(whatsAppTimer.getTime('4'));








         // получаем данные от класса




    }
}
