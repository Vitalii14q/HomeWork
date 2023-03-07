package CaesarCipher;

public class CaesarCipher {
    private final String keyWord;
    private final String originalAlphabet;
    private final String alphabet;

    public CaesarCipher(String keyWord, String originalAlphabet) {
        this.keyWord = keyWord;
        this.originalAlphabet = originalAlphabet;
        this.alphabet = buildAlphabet();

    }

    private boolean contains(String word, char letter) { //метод, который определяет есть ли дублирующие буква в ключевом слове.
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public String buildAlphabet() { //потом сделать приватным
        String alphabet = "";

        for (int i = 0; i < keyWord.length(); i++) {  // собираем новый алфавит из ключевого слова без дубликата букв
            if (!contains(alphabet, keyWord.charAt(i))) {
                alphabet += keyWord.charAt(i);
            }
        }
        for (int i = 0; i < originalAlphabet.length(); i++) { // добавляем оригинальный алфавит к ключевому слову и убираем дублирующиеся буквы из него.
            if (!contains(alphabet, originalAlphabet.charAt(i))) {
                alphabet += originalAlphabet.charAt(i);
            }
        }

        String shiftAlphabet = alphabet.substring(0,alphabet.length() - 1);
        shiftAlphabet = alphabet.charAt(alphabet.length() - 1) + shiftAlphabet;

        return shiftAlphabet;
    }

    public char encode (char symbol) {
        int index = originalAlphabet.indexOf(symbol);
        return alphabet.charAt(index);
    }
}

