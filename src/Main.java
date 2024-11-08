public class Main {
    public static void main(String[] args) {
// Task 1
        System.out.println("Task 1");
        int [] costs = {23500, 26000, 37500, 42000, 29000};
        int sum=0;
        for (int i = 0; i < costs.length; i++) {
            sum=sum+costs[i];
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей.");

// Task 2
        System.out.println("Task 2");
        int costsMin=costs[0];
        int costsMax=0;


        for (int i = 0; i < costs.length; i++) {
            if (costs[i]>costsMax) {
                costsMax = costs [i];}
        }
        for ( final int current : costs) {
            if (current<costsMin) {
                costsMin=current;}

        }

        System.out.println("Минимальная сумма трат за неделю составила "+ costsMin + " рублей. Максимальная сумма трат за неделю составила " + costsMax +" рублей.");



        // Task 3
        System.out.println("Task 3");
        sum=0;
        double averageSum=0.0;
        for (final int current : costs){
            sum=sum+current;}
        averageSum=sum/costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

// Task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {

            System.out.print(reverseFullName[i]);
        }
    }
}