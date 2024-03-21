public class lab545 {
    //Завдання 5. Створити масив з 15 випадкових елементів з відрізку [0; 10]. Вивести масив на екран.
    // Підрахувати скільки в масиві парних елементів та сповістити про це користувача.
    public static void main(String[] args) {
        int count = 0; // Лічильник парних елементів
        // Створення масиву
        int [] array = new int[15];
        // Заповнення масиву випадковими числами з відрізку [0;10]
        for(int i = 0; i < 15; i++) {
            array[i] = (int)(Math.random() * 11);
        }
        System.out.println("Масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++; // Збільшуємо лічильник, якщо елемент парний
            }
        }
        System.out.println(); // розділення sout
        System.out.println("К-сть парних елементів масиву:"+count);
    }
}
