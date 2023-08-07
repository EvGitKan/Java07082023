//Задание
//
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Directory newDirect = new Directory();
        Menu newMenu = new Menu();
        Scanner scanner = new Scanner(System.in);

        newMenu.printMenu();

        while (scanner.hasNextInt()){
            boolean point = false;
            switch (scanner.nextInt()){
                case 1 : {
                    newDirect.getDirect();
                    newMenu.printMenu();
                }
                break;
                case 2 : {
                    newDirect.addNumber();
                    newMenu.printMenu();
                }
                break;
                case 3 : {
                    newDirect.getNumber();
                    newMenu.printMenu();
                }
                break;
                case 4 : point = true;
                break;
                default: {
                    System.out.println("Введен неверный пункт меню.");
                    newMenu.printMenu();
                }
            }
            if (point) break;
        }
    }
}
