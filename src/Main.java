import java.util.Random;

public class Main {
    public static int[] generateRandomArray() {
        Random random =  new Random();
        int arr[] =new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = random.nextInt(100_000)  + 100_000;
        }
        return arr;
    }
    public static int[] array = generateRandomArray();
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задание номер один");
        int sumSpendingPerMonth = 0;
        for (int i = 0; i < array.length; i++) {
            sumSpendingPerMonth += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumSpendingPerMonth + " рублей");
        //Ex2
        System.out.println("Задание номер два");
        int minSpendingPerMonth = 1_000_000;
        int maxSpendingPerMonth  = -1;
        for (int j : array) {
            if (j > maxSpendingPerMonth) {
                maxSpendingPerMonth = j;
            } else if (j < minSpendingPerMonth) {
                minSpendingPerMonth = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerMonth + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSpendingPerMonth + " рублей.");
        //Ex3
        System.out.println("Задание номер три");
        double monthlyAverage = sumSpendingPerMonth / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + monthlyAverage + " рублей.");
        //Ex4
        System.out.println("Задание номер четыре");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}