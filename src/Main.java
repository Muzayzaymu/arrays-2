public class Main {
    public static void main(String[] args) {
        // Task 1
        int [] weeklyPayments = {15_000, 90_000, 85_000, 45_000, 105_000};
        int sum = 0;
        for (int element : weeklyPayments) {
            sum += element;
        }
        System.out.println("«Сумма трат за месяц составила "+ sum + " рублей».");

        // Task 2
        int minSum = weeklyPayments[4];
        int maxSum = 0;
        for (int element : weeklyPayments) {
            if (element > maxSum) {
                maxSum = element;
            }
            if (element < minSum) {
                minSum = element;
            }
        }
        System.out.println(maxSum + " максимальные трата за неделю.");
        System.out.println(minSum + " минимальные трата за неделю.");

        // Task 3
        sum = sum / weeklyPayments.length;
        System.out.println("«Средняя сумма трат за месяц составила " + sum + " рублей».");

        // Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int length = reverseFullName.length - 1; length >= 0; length-- ) {
            System.out.print(reverseFullName[length]);
        }
    }
}