import java.util.Arrays;
public class lab543 {
    public static void main(String[] args) {
        //створення 3 масивів
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        int [] array3 = new int[5];
        // Заповнення масивів випадковими числами з відрізку  [0; 5] та виведення
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 6);
            array2[i] = (int)(Math.random() * 6);
            array3[i] = (int)(Math.random() * 6);
        }
        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3: " + Arrays.toString(array3));
        //Обчислення і виведення суми елементів кожного та середнього арифметичного для кожного масиву
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
        float avg1 = (float) sum1 / array1.length;
        float avg2 = (float) sum2 / array2.length;
        float avg3 = (float) sum3 / array3.length;
        // Виведення середнього арифметичного для кожного масиву
        System.out.println("Сума елементів Масиву №1: " + sum1 + ", а cереднє арифметичне: " + avg1);
        System.out.println("Сума елементів Масиву №2: " + sum2 + ", а cереднє арифметичне: " + avg2);
        System.out.println("Сума елементів Масиву №3: " + sum3 + ", а cереднє арифметичне: " + avg3);
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
