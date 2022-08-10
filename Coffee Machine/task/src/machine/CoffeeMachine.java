package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int money = 550;
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int cups = 9;
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isNoEnd = true;


    public static void main(String[] args) {
        action();
    }

    private static void action() {
        while (isNoEnd) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> has();
                case "exit" -> isNoEnd = false;
            }
        }
    }

    private static void has() {
        System.out.printf("\nThe coffee machine has:\n" +
                        "%d ml of water\n" +
                        "%d ml of milk\n" +
                        "%d g of coffee beans\n" +
                        "%d disposable cups\n" +
                        "$%d of money\n",
                water, milk, coffeeBeans, cups, money);
        action();
    }

    private static void fill() {
        System.out.println("\nWrite how many ml of water you want to add:");
        int waterAdd = scanner.nextInt();
        water += waterAdd;
        System.out.println("Write how many ml of milk you want to add:");
        int milkAdd = scanner.nextInt();
        milk += milkAdd;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeansAdd = scanner.nextInt();
        coffeeBeans += coffeeBeansAdd;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsAdd = scanner.nextInt();
        cups += cupsAdd;
    }

    private static void take() {
        System.out.println("\nI gave you $" + money);
        money = 0;
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String drink = scanner.next();
        switch (drink) {
            case "1" -> {
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water -= 250;

                }
                if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeeBeans -= 16;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    cups--;
                }
                money += 4;
                System.out.println("I have enough resources, making you a coffee!");

            }
            case "2" -> {
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water -= 350;

                }
                if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeeBeans -= 20;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    cups--;
                }
                if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else {
                    milk -= 75;
                }
                money += 7;
                System.out.println("I have enough resources, making you a coffee!");
            }
            case "3" -> {
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water -= 200;
                }
                if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeeBeans -= 12;
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    cups--;
                }
                if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else {
                    milk -= 100;
                }
                System.out.println("I have enough resources, making you a coffee!");
                money += 6;
            }
            case "back" -> {
                action();
            }
        }
    }
}
