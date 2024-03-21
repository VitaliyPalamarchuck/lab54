public class lab541 {
    //Завдання 1. Створити масив непарних чисел від 1 до 99 та вивести його елементи стовпчик.
    // Перед початком створення масиву необхідно врахувати якого він буде розміру
    public static void main(String[] args) {
        //створення масиву
        int[] array = new int[50]; //мінімальна довжина 50 елементів
        //заповнення масиву непарними числами
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+ " ");
    }
}
