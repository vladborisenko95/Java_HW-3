import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        
        // Пусть дан произвольный список целых чисел, удалить из него четные числа

        ArrayList<Integer> numbers = getRandomList(15, 30);
        System.out.printf("Созданный список: %s\n", numbers.toString());
        System.out.printf("Нечетные элементы списка: %s", getOddList(numbers).toString());
    }

    private static ArrayList<Integer> getOddList(ArrayList<Integer> list) {

        Iterator<Integer> iteratorList = list.iterator();

        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            if (item % 2 == 0) iteratorList.remove();
        }
        return list;
    }

    private static ArrayList<Integer> getRandomList(int size, int upperBond) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(upperBond));
        }
        return list;
    }
}