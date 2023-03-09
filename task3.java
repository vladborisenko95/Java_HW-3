import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        //  Реализовать алгоритм сортировки слиянием
        
        int[] numList = getArrayList(99, 0, 99);

        PrintArray(numList);
        System.out.println();
        int[] sortedList = mergeSorting(numList);
        PrintArray(sortedList);

    }

    public static int[] mergeSorting(int[] arrayToSort) {
        // основной метод сортировки

        if (arrayToSort.length < 2)
            return arrayToSort;

        else
            return mergeLists(mergeSorting(listDivision(arrayToSort)[0]),
                                mergeSorting(listDivision(arrayToSort)[1]));
    }

    public static int[] mergeLists(int[] listOne, int[] listTwo) {
        // метод слияния двух отсортированных массивов

        int[] resList = new int[listOne.length + listTwo.length];

        int i = 0;
        int j = 0;

        while (i < listOne.length && j < listTwo.length) {
            if (listOne[i] < listTwo[j]) {
                resList[i + j] = listOne[i];
                i++;
            } else {
                resList[i + j] = listTwo[j];
                j++;
            }
        }

        while (i < listOne.length) {
            resList[i + j] = listOne[i];
            i++;
        }

        while (j < listTwo.length) {
            resList[i + j] = listTwo[j];
            j++;
        }

        return resList;
    }

    public static int[][] listDivision(int[] bigList) {
        //метод разделения массива на две части

        int[][] resList = new int[2][bigList.length / 2 + 1];
        int[] smallListOne = new int[bigList.length / 2];
        int[] smallListTwo = new int[bigList.length - bigList.length / 2];

        for (int i = 0; i < smallListOne.length; i++) {
            smallListOne[i] = bigList[i];
        }

        for (int j = 0; j < smallListTwo.length; j++) {
            smallListTwo[j] = bigList[j + bigList.length / 2];
        }

        resList[0] = smallListOne;
        resList[1] = smallListTwo;

        return resList;
    }

    static void PrintArray(int[] array) {
        // метод вывода одномерного массива в консоль

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] getArrayList(int size, int min, int max) {
        // метод генерации массива с рандомными значениями

        int[] resultList = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            resultList[i] = rand.nextInt(min, max);
        }
        return resultList;
    }
}