import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class HW2 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            number.add(random.nextInt(1, 10));
        }
        System.out.println(number);
        double avg = 0;
        int min = number.get(0);
        int max = number.get(0);

        for (Integer i: number) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        for (Integer x: number)
            avg +=x;


        System.out.println("Минимальное число = " + min);
        System.out.println("Максимальное число = " + max);
        System.out.println("Среднее арифметическое = " + avg/number.size());
        }
    }

