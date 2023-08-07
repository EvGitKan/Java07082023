import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    LinkedHashMap<Integer, String> menu = new LinkedHashMap<>();

    public void printMenu(){
        menu.put(1,"Показать весь справочник");
        menu.put(2,"Добавить новый номер");
        menu.put(3,"Найти по номеру");
        menu.put(4,"Выход");
        System.out.println("------------------------------------");
        for (Map.Entry entry : menu.entrySet()) {
            System.out.printf("%d. %s\n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------------");
    }
}
