package lesson3;

public class homework2 {
    public static void main(String[] args) {
        int index = 1;
        for (int i = 1; i < 101; i++) {
            // System.out.println(i + "a");
        }


        int[] child = new int[4];
        child[0] = 5;
        child[1] = 10;
        child[2] = 17;
        child[3] = 18;
        for (int i : child) {
            if (i < 7) {
                //   System.out.println(i + " " + "Пошел в сад");
            } else if (i > 6 && i < 12) {
                //  System.out.println(i + " " + "Пошел в школу");
            } else if (i > 12 && i < 18) {
                //  System.out.println(i + " " + "Пошел в среднюю школу");
            } else {
                // System.out.println(i + " " + "Пошел в университет");
            }
        }

        //  public class Menu {
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = false;
        boolean sausage = true;
        boolean eggs = false;

        if (chicken == true && vegetables == true && sour == true && toast == true) {
            // System.out.println("Повар приготовил Цезарь");
        } else if (vegetables == true && sausage == true && eggs == true) {
            //  System.out.println("Повар приготовил Оливье");
        } else if (vegetables == true) {
            //  System.out.println("Повар приготовил овощной салат");
        } else {
            //  System.out.println("У повара ничего нет");
        }
Cat cat = new Cat("Vasily", 5);
       System.out.println(cat.getName());
        cat.setName("ЖОПА");
        System.out.println(cat.getName());
    }


    }








