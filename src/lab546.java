public class lab546 {
    // Завдання 6. Створити двовимірний масив з 15 стрічок у яких 1-4 стрічки мають
    // по 5 стовбців, 5-8 стрічки мають по 8 стовбців, 9-12 стрічки мають по 3 стовбці,
    // 13-15 стрічки мають по 9 стовбців.
    // Наповнити масив випадковими значеннями цілих чисел з відрізку [0; 15]
    public static void main(String[] args) {
        int[][] TwoD = new int[15][]; // Створення двовимірного масиву

        // Ініціалізація кожного рядка масиву з різною кількістю стовбців
        TwoD[0] = new int[5];
        TwoD[1] = new int[5];
        TwoD[2] = new int[5];
        TwoD[3] = new int[5];
        TwoD[4] = new int[8];
        TwoD[5] = new int[8];
        TwoD[6] = new int[8];
        TwoD[7] = new int[8];
        TwoD[8] = new int[3];
        TwoD[9] = new int[3];
        TwoD[10] = new int[3];
        TwoD[11] = new int[3];
        TwoD[12] = new int[9];
        TwoD[13] = new int[9];
        TwoD[14] = new int[9];
        System.out.println("Двовимірний масив: ");
        // Заповнення масиву випадковими значеннями
        for (int i = 0; i < TwoD.length; i++) {
            for (int j = 0; j < TwoD[i].length; j++) {
                TwoD[i][j] = (int) (Math.random() * 16); // Випадкове ціле число від 0 до 15
                System.out.print(TwoD[i][j] + " "); // Виводимо значення елементу
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка масиву
        }
    }
}
