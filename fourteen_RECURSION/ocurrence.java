package fourteen_RECURSION;

public class ocurrence {
    public static int firstoccerence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccerence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 7, 6, 9};
        int key = 7;
        System.out.println(firstoccerence(arr, key, 0));
    }

    // public static int secondOccurrence(int arr[], int key, int i, int count) {
    //     if (i == arr.length) {
    //         return -1;
    //     }
    //     if (arr[i] == key) {
    //         count++;
    //         if (count == 2) {
    //             return i;
    //         }
    //     }
    //     return secondOccurrence(arr, key, i + 1, count);
    // }

    // public static void main(String[] args) {
    //     int arr[] = {5, 6, 7, 8, 7, 6, 9};
    //     int key = 7;
    //     System.out.println(secondOccurrence(arr, key, 0, 0));
    // }
}
