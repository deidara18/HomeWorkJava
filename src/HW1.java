import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class HW1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(random.nextInt(1, 10));
        }
        System.out.println(number);

        int index = number.size();
        for (int i = 0; i < index; i++) {
            if (number.get(i) instanceof Integer) {
                number.remove(i);
                index--;


            }

        }
        System.out.println(number);
    }
}
