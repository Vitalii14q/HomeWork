package validator;

public class Validator {

    public boolean checkString (String word) throws CheckingForLatinLettersException {

        for (int i = 0; i < word.length(); i++) {
            char breakAString = word.charAt(i);
            if(!(breakAString >= 'a' && breakAString <= 'z') && !(breakAString >= 'A' && breakAString <= 'Z')) {
                throw new CheckingForLatinLettersException("Не латинский символ: " + breakAString);
            }
        }
        return true;
    }
}
