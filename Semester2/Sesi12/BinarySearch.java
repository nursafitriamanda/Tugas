public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        long startTime = System.nanoTime();
        int resultIndex = binarySearch(arr, target);
        long endTime = System.nanoTime();

        if (resultIndex != -1) {
            System.out.println("Target ditemukan pada indeks ke-" + resultIndex);
        } else {
            System.out.println("Target tidak ditemukan");
        }

        long executionTime = endTime - startTime;
        System.out.println("Waktu eksekusi: " + executionTime + " nanosekon");
    }
}