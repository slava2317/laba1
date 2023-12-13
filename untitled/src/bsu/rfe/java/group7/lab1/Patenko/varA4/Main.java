package bsu.rfe.java.group7.lab1.Patenko.varA4;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

       Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("Potatoe")) {
                breakfast[itemsSoFar] = new Potatoe(parts[1]);
            }
            itemsSoFar++;
        }

        System.out.println("Choose a product: \n"+
                "1.Apple \n"+
                "2.Cheese \n"+
                "3.Potatoe \n");
        String choice = "";
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        switch(choice){
            case "1":
                countFood(breakfast,new Apple(""));break;
            case "2":
                countFood(breakfast,new Cheese());break;
            case "3":
                countFood(breakfast,new Potatoe(""));break;
        }
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                System.out.println();

            } else {
                break;
            }
        }
        System.out.println("Всего хорошего!");
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)){
                count++;
            }
        }

        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " in the breakfast");
    }
}