import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        int[][] reversed; // конечный аргумент, который будем печатать
        while (input.hasNext()) {
            String digitsString = input.nextLine();
            if (digitsString.length() == 0) {
                reversed = new int[size][]; //TODO: додумать логику: размер двойного массива расширяется на один,
                                            // а первым элементом двойного массива становится пустой массив.
                size++;
            } else {
                String[] digitsSplited = digitsString.split("\\s+"); // пилим строку на массив строк-чисел
                int[] digitsInt = new int[digitsSplited.length]; // создаём массив для будущих чисел
                // преобразуем каждый элемент в число и вставляем его на первое место в массиве digitsInt
                for (digit : digitsSplited) {

                }
                reversed = new int[size][]; //TODO: додумать логику: размер двойного массива расширяется на один,
                                            // а первым элементом двойного массива становится массив digitsInt.
            }

        }
        //TODO: вывести стандартным выводом reversed
        for (int i = 0; i < reversed.length; i++) {
            for (int j = 0; j < reversed[i].length; j++) {
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }
    }
}