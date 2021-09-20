import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H6 {
    Scanner sc = new Scanner(System.in);
    static int[][] sudoku = new int[3][3];

    public static void main(String[] args) {


        //    requestInput();
        //    printArray();
        calculateAverage();
    }

    static void requestInput() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers);
        Collections.shuffle(numbers);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sudoku[i][j] = numbers.get(0);
                numbers.remove(0);
            }
        }
    }


    static void printArray() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + sudoku[i][j] + " | ");
            }

        }

    }

    static void calculateAverage() {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner a = new Scanner(System.in);
        double input, total = 0, average = 0, j;

        System.out.println("How many digits to calculate?");
        j = a.nextInt();

        System.out.println("Give me the digits, press enter in between the digits.");
        for (int i = 0; i < j; i++) {
            input = a.nextDouble();
            numbers.add(input);
        }
        for (Double number : numbers) {
            total = number + total;
        }
        System.out.println("total = " + total);
        average = total / numbers.size();
        System.out.println("Average = "+ average);
    }

}

