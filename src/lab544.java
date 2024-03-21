public class lab544 {
    //Завдання 4. Створіть 2 масиви та наповніть їх 10 випадковими цілими числами
    //з відрізку [0; 10]. Створіть третій пустий цілочисельний масив на 10 елементів. Кожен
    //елемент з i-тим індексом в третьому масиві має містити значення суми елементів першого
    // та другого масиву з і-тими індексами. Вивести усі масиви у консоль окремими
    //стрічками.
    public static void main(String[] args) {
        //створення 3 масивів
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int [] array3 = new int[10];
        // Заповнення масивів випадковими числами з відрізку  [0; 10]
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 11);
        }
        for(int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 11);
        }
        // Заповнення третього масиву сумами
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
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
    }
}
