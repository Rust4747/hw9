import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        int sum = 0;
        for (int expense : expenses ) {
            sum +=expense;
        }
        System.out.println("Сумма трат за месяц составила " +sum+" рублей");

        System.out.println("задание 2");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense>max) {
                max=expense;
            }
            if (expense<min) {
                min=expense;
            }
        }
        System.out.println("Минимальная сумма трат за день " +min+ "рублей");
        System.out.println("Максимальная сумма трат за день " +max+ "рублей");


        System.out.println("задание 3");
        double everageExpense = (double) sum/expenses.length;
        System.out.println("редние траты составили" +everageExpense+ " рублей");

        System.out.println("задание 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int p=reverseFullName.length-1; p>=0; p--) {
            System.out.print(reverseFullName[p]);
        }




    }
}

