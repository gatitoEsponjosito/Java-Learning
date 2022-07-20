import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        function29();
    }

    public static void function29() {
        Car2 car21 = new Car2("Chevrolet", "Mustang", 2021);

        Car2 car22 = new Car2(car21);

        System.out.println(car21);
        System.out.println(car22);
        car21.showInfo();
        car22.showInfo();
    }

    public static void function28() {
        // V car3 = new V() {

        // };
        C car2 = new C();
    }

    public static void function27() {
        Hero hero1 = new Hero("Batman", 42, "$$$");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println(hero1.toString());
    }

    public static void refrigerator() {
        Food[] refri = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        refri[0] = food1;
        refri[1] = food2;
        refri[2] = food3;

        System.out.println(refri[0].getName());
        System.out.println(refri[1].getName());
        System.out.println(refri[2].getName());
    }

    public static void function26() {
        Object obj = new Object("sjdfsd", "foratrna", "blue", 2020);
        System.out.println(obj.toString());
    }

    static void function25() {
        Human human1 = new Human("Rick owo", 65, 70);
        Human human2 = new Human("Ricky uwu", 65, 70);

        human1.eat();
        human1.drink();
        System.out.println(human1.getname());
        System.out.println(human2.getweight());
    }

    static void iniciojava() {
        System.out.println("\"I love pizza\'");
        System.out.println("this is incredible uwu");
        System.out.println();
        System.out.println();

        int x = 123;
        double y = 3.14;
        boolean z = true;
        byte byt = 127;
        short shorti = 34;
        float num = 3.4356345f;
        double num2 = 234.2345;
        long holas = 23434645645645645L;
        char symbol = '@';
        String name = "Ibrahim owo";
        System.out.println("Hello " + name);
        System.out.println(byt);

        String s1 = "water";
        String s2 = "Kool-Aid";
        String temp;
        temp = s1;
        s1 = s2;
        s2 = temp;
        function24();
        // function17();
        // this is a comment OwO
        /*
         * jsadbsbdfjhbsjdkfb
         * sdfsdfsf
         * sdfsdfdf
         */
    }

    static void function24() {
        Car car = new Car();
        Car car2 = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println();
        System.out.println(car2.make);
        System.out.println(car2.model);
    }

    static void function23() {
        final double pi = 3.14159;

        System.out.println(pi);

    }

    static void function21() {
        System.out.printf("This is a format string %d", 123);
    }

    static int function20add(int x, int y) {
        return x + y;
    }

    static double function20add(double x, double y) {
        return x + y;
    }

    public static void function19() {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.print(i);
        }

    }

    public static void function18() {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<Character> arr = new ArrayList<Character>();
        arr.add('e');
        ArrayList<String> bakery_list = new ArrayList();
        bakery_list.add("pasta");
        bakery_list.add("garlic bread");
        bakery_list.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakery_list);
        groceryList.add(produceList);
        groceryList.add(bakery_list);

        System.out.println(groceryList.get(0));
    }

    public static void function17() {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        // food.clear();
        System.out.println(food);
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

    public static void function16() {
        // PRIMITIVE IS MUCH FASTER
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

    }

    public static void function15() {
        String name = "Bro ";
        boolean result = name.equalsIgnoreCase("bro");
        int result2 = name.length();
        char result3 = name.charAt(0);
        int result4 = name.indexOf("o");
        boolean result5 = name.isEmpty();
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();
        String result8 = name.trim();
        String result9 = name.replace('o', 'a');

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.print(result8);
        System.out.print(result9);
    }

    public static void function14() {
        String[][] cars = {
                { "Camaro", "Corvette", "Silverado" },
                { "Mustang", "Ranger", "F-150" },
                { "Ferrari", "Lambo", "Tesla" }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }

    public static void function13() {
        String[] arr = new String[3];
        String[] cars = { "Camaro", "Corvette", " Tesla", "BMW" };

        cars[0] = "Mustang";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

    public static void function12() {
        Scanner scanerr = new Scanner(System.in);

        int rows;
        int columns;
        String symbol;

        System.out.println("Enter # of rows: ");
        rows = scanerr.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scanerr.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanerr.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
        }
    }

    public static void function11() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        System.out.println("Happy new year!");
    }

    public static void function10() {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

        System.out.println("Hello " + name);
    }

    public static void function9() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game ! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }

    public static void function8() {

        Scanner scane = new Scanner(System.in);

        System.out.println("What day is today? ");
        String day = scane.nextLine();
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
        }
    }

    public static void function7() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age? ");

        int age = scan.nextInt();

        if (age == 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }
    }

    public static void function5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        double x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        double y = scanner.nextDouble();

        double z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is " + z);

        scanner.close();
    }

    public static void function6() {
        Random random = new Random();

        int x = random.nextInt(2) + 1;
        double y = random.nextDouble();

        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(z);
    }

    public static void function4() {
        double x = 3.14;
        double y = -10;
        double z = (Math.ceil(x));

        System.out.println(z);
    }

    public static void function() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        System.out.println(name + " like " + food);

        scanner.close();
    }

    public static void function2() {
        int friends = 10;
        friends--;

        System.out.println(friends);
    }

    public static void function3() {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " year old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}