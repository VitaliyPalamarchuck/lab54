public class lab5431 {
    //Завдання 3. Створити 3 масиви та наповнити їх 5 випадковими цілочисельними
    //значеннями з відрізку [0; 5]. Вивести масиви у консоль в окремих стрічках.
    // Підрахувати середнє арифметичне елементів кожного із поданих масивів та вивеcти
    // повідомлення для якого масиву середнє значення є більшим (або значення середніх
    // арифметичних єрівними).
    public static void main(String[] args) {
        //створення 3 масивів
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        int [] array3 = new int[5];
        // Заповнення масивів випадковими числами з відрізку  [0; 5]
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 6);
        }
        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 6);
        }
        for(int i = 0; i < array3.length; i++) {
            array3[i] = (int)(Math.random() * 6);
        }
        System.out.println("Масив 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(); // розділення sout
        System.out.println("Масив 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(); // розділення sout
        System.out.println("Масив 3:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        // Знаходження суми елементів кожного масиву
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        int sum3 = 0;
        for (int i = 0; i < array3.length; i++) {
            sum3 += array3[i];
        }
        System.out.println();//розділення sout
        // Виведення суми елементів кожного масиву
        System.out.println("Сума елементів Масиву №1: " + sum1);
        System.out.println("Сума елементів Масиву №2: " + sum2);
        System.out.println("Сума елементів Масиву №3: " + sum3);
        // Обчислення середнього арифметичного для кожного масиву
        float avg1 = (float) sum1 / array1.length;
        float avg2 = (float) sum2 / array2.length;
        float avg3 = (float) sum3 / array3.length;
        // Виведення середнього арифметичного для кожного масиву
        System.out.println("Середнє арифметичне Масиву №1: " + avg1);
        System.out.println("Середнє арифметичне Масиву №2: " + avg2);
        System.out.println("Середнє арифметичне Масиву №3: " + avg3);
        // Порівняння середнього арифметичного для кожного масиву
        if (avg1 > avg2 && avg1 > avg3) {
            System.out.println("Середнє арифметичне Масиву 1 більше за середнє арифметичне Масиву 2 і 3");
        } else if (avg2 > avg1 && avg2 > avg3) {
            System.out.println("Середнє арифметичне Масиву 2 більше за середнє арифметичне Масиву 1 і 3");
        } else if (avg3 > avg1 && avg3 > avg2) {
            System.out.println("Середнє арифметичне Масиву 3 більше за середнє арифметичне Масиву 1 і 2");
        } else {
            System.out.println("Середні арифметичні Масивів рівні");
        }
    }
}
