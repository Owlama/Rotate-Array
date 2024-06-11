public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 4;
        int[] rotatedArray = rotLeft(arr, d);

        // Print the rotated array
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotated = new int[n];

        // Calculate the effective number of rotations
        int effectiveRotations = d % n;

        // Copy elements to the rotated array
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - effectiveRotations) % n;
            rotated[newIndex] = a[i];
        }

        return rotated;
    }
}

