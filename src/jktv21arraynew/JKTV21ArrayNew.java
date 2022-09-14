/*Создание массива целых чисел.
 * Заполнение случайными числами.
 * Нахождение МАКС числа в массиве.
 */
package jktv21arraynew;

import java.util.Arrays;
import java.util.Random;

public class JKTV21ArrayNew {

    public static void main(String[] args) {
        //Example 1
//        int[] numbers = new int[10];
//        Random rnd = new Random();
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = rnd.nextInt(100); //random numbers 0..99
//            System.out.printf("%5d", numbers[i]);
//        }
//        System.out.println("");
//        int max = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//    System.out.println("Max number is "+ max);
//    
//    //example 2
//        int[] numbers1={5,6,1,7,2};
//        int[] numbers1Copy1=numbers1;
//        numbers1Copy1[2]=10;
//        System.out.printf("numbers1[2]=%d, numbers1Copy1[2]=%d%n", numbers1[2], numbers1Copy1[2]);
//        
//        int[] numbers1Copy2 = new int[numbers1.length];
//        System.arraycopy(numbers1, 0, numbers1Copy2, 0, numbers1.length);
//        numbers1Copy2[2]=100;
//        System.out.printf("numbers1[2]=%d, numbers1Copy2[2]=%d%n", numbers1[2], numbers1Copy2[2]);
//        
    //example 3 
    int[] num = new int[10];
    Arrays.fill(num, 5);//fill(int[] a, int val)
    Arrays.fill(num, 0, 4, 25);//fill(int[] a, int fromIndex, int toIndex, int val)
    System.out.println(Arrays.toString(num));
    
    int[] numCopy = Arrays.copyOf(num, num.length);
    Arrays.sort(numCopy);
    System.out.println("Sorting: "+Arrays.toString(numCopy));
    
    System.out.println("Is array num equal to array numCopy?"+Arrays.equals(num, numCopy));
    }
}
