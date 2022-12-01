package lesson1;

public class Lesson2 {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 12;
        if (number1 == number2) {
            //   System.out.println("Два числа равны");
        } else {
            //   System.out.println("Два числа не равны");
        }
        int number3 = 0;
        if (number3 > 0) {

            //  System.out.println("Число положительное");
        } else if (number3 == 0) {
            //    System.out.println("Число ноль");
        } else {
            //  System.out.println("Число отрицательное");
        }
        //переопределение
        String name1 = "Anna";
        String name2 = "Anna";
        if (name1.equals(name2)) {
            //System.out.println("Равны");
        } else {
          //  System.out.println("Не равны");
        }
        //логическое и
int number5 = 11;
int number6 = 12;
if ((number5 == number6) && (name1.equals(name2))) {
  //  System.out.println("Числа и строки равны");
        }
//логическое или
        if((number5 == number6) || (name1.equals(name2))) {
    //System.out.println("Логическое сравнение сработало");
        }
//логическое НЕ
        if (!(number5 == number6) && (name1.equals(name2))) {
          //  System.out.println("какой-то код");
        }
// Цикл for foreach
        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        for (int num:numbers) {
            //System.out.println(num);
        }
        //Цикл fori
        for (int i = 0; i < 3; i++) {
         //   System.out.println(numbers[i]);
            
        }
// Цикл while
        int index = 0;
        while (index <3) {
            System.out.println("Привет мир");
            index += 1;// остановить бесконечный цикл
        }
    }
}





