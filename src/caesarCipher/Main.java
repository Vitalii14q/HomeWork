package caesarCipher;

public class Main {
    public static void main(String[] args) {

        CaesarCipher caesarCipher = new CaesarCipher("мама", "абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
        String encodeWord = caesarCipher.encryptMessage("привет");
        System.out.println(encodeWord);
        System.out.println(caesarCipher.decodeTheMessage(encodeWord));
    }
}
