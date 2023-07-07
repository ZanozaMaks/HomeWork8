import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 42;
        numbers[1] = 68;
        numbers[2] = 17;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers[0]);
        System.out.println(fractionalNumbers[1]);
        System.out.println(fractionalNumbers[2]);

        int[] apples = {4, 13, 22};
        System.out.println(apples[0]);
        System.out.println(apples[1]);
        System.out.println(apples[2]);


        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] pear = new int[3];
        int[] grape = new int[2];
        double[] money = {6.54, 9.42, 14.57, 8.16};

        pear[0] = 4;
        pear[1] = 6;
        pear[2] = 8;

        grape[0] = 3;
        grape[1] = 5;

        System.out.println(pear[0] + "," + pear[1] + "," + pear[2]);
        System.out.println(grape[0] + "," + grape[1]);
        System.out.println(money[0] + ", " + money[1] + ", " + money[2] + ", " + money[3]);

        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] pear = new int[3];
        int[] grape = new int[2];
        double[] money = {6.54, 9.42, 14.57, 8.16};

        pear[0] = 4;
        pear[1] = 6;
        pear[2] = 8;

        grape[0] = 3;
        grape[1] = 5;

        System.out.println(pear[2] + "," + pear[1] + "," + pear[0]);
        System.out.println(grape[1] + "," + grape[0]);
        System.out.println(money[3] + ", " + money[2] + ", " + money[1] + ", " + money[0]);
        // Пишем код для задачи 3
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] potato = new int[]{7, 10, 15, 33, 24};

        for (int i = 0; i < potato.length; i++) {
            if (potato[i] % 2 != 0) {
                potato[i]++;
            }
        }

        for (int i = 0; i < potato.length; i++) {
            System.out.print(potato[i] + " ");
            // Пишем код для задачи 4
        }
    }
}
