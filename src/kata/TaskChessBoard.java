package kata;

/**
 * шахматная доска
 */

public class TaskChessBoard {
    public static void main(String[] args) {
        int width = 8;
        int height = 10;
        char symbol = '*';
        char empty = ' ';

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0){
                printSymbolEmpty(width, symbol, empty);
            } else {
                printEmptySymbol(width, symbol, empty);
             }
            System.out.println();
        }
    }

    static void printSymbolEmpty (int width, char symbol, char empty) {

        for (int i = 0; i < width; i++){
            if (i % 2 == 0){
                System.out.print(symbol);
            } else {
                System.out.print(empty);
            }
        }
    }

    static void printEmptySymbol (int width, char symbol, char empty) {

        for (int i = 0; i < width; i++){
            if (i % 2 == 0){
                System.out.print(empty);
            } else {
                System.out.print(symbol);
            }
        }
    }
}
