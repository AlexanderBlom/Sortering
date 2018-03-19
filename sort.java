import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};

        double[] numbers1 = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};

        String[] words = {"alex", "hejsan", "benjamin"};

        selSort(numbers);
        selSort(numbers1);
        selSortStringLength(words);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(words));
        selSortStringAlpha(words);
        System.out.println(Arrays.toString(words));
    }

    public static void selSort(int[] numbers) {
        for (int i = 0 ; i < numbers.length; i++) {
            int min = i;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]){
                    min = j;
                }
            }
            swap(numbers, min, i);
        }
    }

    public static void selSort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int max = i;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] > numbers[max]){
                    max = j;
                }
            }
            swap(numbers, max, i);
        }
    }

    public static void selSortStringLength(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int min = i;

            for (int j = i; j < words.length; j++) {
                if (words[j].length() < words[min].length()) {
                    min = j;
                }
            }
            swap(words, min, i);
        }
    }

    public static void selSortStringAlpha(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int min = i;

            for (int j = i; j < words.length; j++) {
                if (words[j].compareTo(words[min]) < 0){
                    min = j;
                }
            }
            swap(words, min, i);
        }
    }

    private static void swap(int[] numbers, int min, int i) {
    int tmp = numbers[min];
    numbers[min] = numbers[i];
    numbers[i] = tmp;
    }

    private static void swap(double[] numbers, int max, int i) {
        double tmp = numbers[max];
        numbers[max] = numbers[i];
        numbers[i] = tmp;
    }

    private static void swap(String[] words, int min, int i) {
        String tmp = words[min];
        words[min] = words[i];
        words[i] = tmp;
    }
}