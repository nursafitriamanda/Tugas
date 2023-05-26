public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Mengembalikan indeks elemen yang ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        int target = 6;

        long startTime = System.nanoTime();
        int result = linearSearch(array, target);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        if (result != -1) {
            System.out.println("Elemen " + target + " ditemukan pada indeks " + result);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }

        System.out.println("Waktu eksekusi: " + elapsedTime + " nanosekon");
    }
}