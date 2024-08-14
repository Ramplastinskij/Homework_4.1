public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_4.1");
        System.out.println();
        //Task 1
        System.out.println("Задача 1.");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
        //Task 2
        System.out.println("Задача 2.");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
        //Task 3
        System.out.println("Задача 3.");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        //Task 4
        System.out.println("Задача 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
        //Task 5
        System.out.println("Задача 5.");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println();
        //Task 6
        System.out.println("Задача 6.");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        //Task 7
        System.out.println("Задача 7.");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        //Task 8
        System.out.println("Задача 8.");
        int salary = 29000;
        int piggyBank = 0;
        for (int i = 1; i <= 12; i++) {
            piggyBank = piggyBank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + piggyBank + " рублей.");
        }
        System.out.println("Всего за год " + piggyBank);
        System.out.println();
        //Task 9
        System.out.println("Задача 9.");
        int monthSalary = 29000;
        double interestRate = 0.12;
        double totalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings * (1 + interestRate / 12);
            totalSavings = totalSavings + monthSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("Всего за год " + totalSavings);
        System.out.println();
        //Task 10
        System.out.println("Задача 10.");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}