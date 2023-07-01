package validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        try {
            validator.checkString("ed");
            System.out.println("Строка не содержит другие символы помимо латинских букв.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validator.checkString("1hello")) {
                System.out.println("Строка не содержит другие символы помимо латинских букв.");
            }
        } catch (Exception e) {
            System.out.println("Строка содержит не латинский символ: " + e.getMessage());
        }

    }
}
