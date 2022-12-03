import java.util.ArrayList;
import java.util.Scanner;

public class Victorin {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Тип квеста: \n 1. Самолётики \n 2. Трегонаметрея \n 3. Анекдоталогия \n 4. Выход\n Введите номер: ");
        int a = 0;
        while (a == 0) {
            try {
                String nAsString = in.next();
                int N = Integer.parseInt(nAsString);
                if (N <= 5 || N > 0) {
                    switch (N) {
                        case 1: {
                            jet(a);
                            break;
                        }
                        case 2: {
                            trigan(a);
                            break;
                        }

                        case 3: {
                            anekdot(a);
                            break;
                        }
                        case 5: {
                            System.out.println("");
                            System.out.println(ANSI_RED + "Штирлиц всё ночь топил камин, под утро камин утонул" + ANSI_RESET);
                            System.out.println("");
                            break;
                        }
                        case 4: {
                            System.exit(1);
                            break;
                        }
                        default:
                            System.out.println("");
                            System.out.print(ANSI_YELLOW + "*Такого пункта нету* \n" + ANSI_RESET);
                            System.out.println("");
                            break;
                    }
                    System.out.println(ANSI_YELLOW + "*Вы вернулись в меню(ошибка или конец викторины)*" + ANSI_RESET);
                    System.out.print("Тип квеста: \n 1. Самолётики \n 2. Трегонаметрея \n 3. Анекдоталогия \n 4. Выход\n Введите номер: ");
                } else {
                    System.out.print(ANSI_YELLOW + "*Вводи значение в корекном виде*\n" + ANSI_RESET + "\nПовторить ввод:");
                }
            } catch (Exception e) {
                System.out.println(ANSI_YELLOW + "*Вводи значение в корекном виде*\n" + ANSI_RESET + "\nПовторить ввод:");
            }
        }
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int jet(int a) {
        Scanner in = new Scanner(System.in);
        System.out.println("вы попали на квест по самолётам");
        ArrayList<String> Quasion = new ArrayList<>();
        ArrayList<String> Ansver = new ArrayList<>();
        Quasion.add(0,"Лист персонажа");
        Quasion.add(1, String.valueOf(250));
        Quasion.add(2, "Скальпель");
        Quasion.add(3, "Разбавленный спирт 3x0.5");
        return a;
    }
    public static int trigan(int a) {
        Scanner in = new Scanner(System.in);
        return a;
    }
    public static int anekdot(int a) {
        Scanner in = new Scanner(System.in);
        return a;
    }
}
