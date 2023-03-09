import java.util.ArrayList;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {

        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее арифметическое из этого списка.

        ArrayList<Integer> newList = getArrayList(10, 0, 10);
        System.out.println(newList);

        int minimum = getMinimum(newList);
        int maximum = getMaximum(newList);
        float arithmeticMean = getArithmeticMean(newList);
        System.out.println("минимальное значение - " + minimum);
        System.out.println("максимальное значение - " + maximum);
        System.out.println("среднее арифметическое - " + arithmeticMean);

    }

    public static Integer getMinimum(ArrayList<Integer> array) {
        // поиск минимального значения в массиве
        Integer minimum = array.get(0);
        for (int num : array) {
            if (num < minimum)
                minimum = num;
        }

        return minimum;
    }

    public static Integer getMaximum(ArrayList<Integer> array) {
        // поиск максимального  значения в массиве
        Integer maximum = array.get(0);
        for (int num : array) {
            if (num > maximum)
                maximum = num;
        }

        return maximum;
    }

    public static Float getArithmeticMean(ArrayList<Integer> array) {
        // поиск среднего арифметического
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        Float arithmeticMean = (float) sum / (float) array.size();
        return arithmeticMean;
    }

    public static ArrayList<Integer> getArrayList(int size, int min, int max) {
        // генерация массива с случайными числами
        ArrayList<Integer> resultList = new ArrayList<>(size);

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            resultList.add(rand.nextInt(min, max));
        }

        return resultList;
    }
}