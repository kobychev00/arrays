public class Main {

    public static void main(String[] args) {
        //урок массивы часть 1
        System.out.println("урок массивы часть 1");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        System.out.println("Пищем дз");
        System.out.println("Делаем commit & push");
        System.out.println("Переходи в gitHub");

        //задача 1
        System.out.println("задача 1");
        int[] numbers = new int[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        double [] fractions = {1.57, 7.654, 9.986};
        double[] fractions1 = {11.7, 71.64, 19.98};
        //задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ,");
        }
        System.out.println(" ") ;

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i] + " ,");
        }
        System.out.println(" ");
        for (int i = 0; i < fractions1.length; i++) {
            System.out.print(fractions1[i] + " ,");
        }
        System.out.println(" ");

        //задача 3
        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i= i - 1) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(" ") ;

        for (int i = 2; i >= 0; i= i - 1) {
            System.out.print(fractions[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 2; i >= 0; i= i - 1) {
            System.out.print(fractions1[i] + ", ");
        }
        System.out.println(" ");
        //задача 1
        System.out.println("Задача 4");
        numbers [0] = 1 + 1;
        numbers [1] = 2;
        numbers [2] = 3 + 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}