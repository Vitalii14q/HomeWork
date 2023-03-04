package CaesarCipher;

public class CaesarCipher {
    private final String keyWord;
    private final String originalAlphabet;

    public CaesarCipher (String keyWord, String originalAlphabet) {
        this.keyWord = keyWord;
        this.originalAlphabet = originalAlphabet;
    }

    private boolean contains (String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    private String buildAlphabet () {
        String alphabet = "";

        for (int i = 0; i < keyWord.length(); i++) {
            if (!contains(alphabet, keyWord.charAt(i))) {
                alphabet += keyWord.charAt(i);
            }
        }
        return alphabet;
    }
}

