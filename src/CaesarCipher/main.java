package CaesarCipher;

public class main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher("мама", "абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
        System.out.println(caesarCipher.buildAlphabet());
        System.out.println(caesarCipher.encryptMessage("привет"));
        System.out.println(caesarCipher.decodeTheMessage("опжагс"));
    }
}
