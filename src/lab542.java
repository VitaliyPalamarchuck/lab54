public class lab542 {
    //Завдання 2. Створити масив з 20 випадкових цілих чисел з відрізку [0; 9] та вивести його у консоль.
    // Замінити кожен елемент з непарним індексом на нуль. Оновлений масив також вивести у консоль.
    public static void main(String[] args) {
        // Створення масиву
        int [] array = new int[20];
        int [] originalArray = new int[20]; // Копія початкового масиву
        // Заповнення масиву випадковими числами
        for(int i = 0; i < 20; i++) {
            array[i] = (int)(Math.random() * 10);
            originalArray[i]=array[i];
        }
        // Виведення початкового масиву
        System.out.println("Початковий масив:");
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }
        // Перетворення елементів з непарним індексом на нуль
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) { // перевірка на непарний індекс
                array[i] = 0;
            }
        }
        System.out.println();//розділення sout
        // Виведення зміненого масиву
        System.out.println("Змінений масив:");
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");;
        }
    }
}

