import java.util.*;

public class Directory {
    HashMap<Long, String> direct = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void getNumber() {
        System.out.println("Введите имя: ");
        String str = scanner.nextLine();
        if (direct.containsValue(str)) {
            for (Map.Entry entry : direct.entrySet()) {
                if (entry.getValue().equals(str)) {
                    System.out.printf("%s : %d\n", entry.getValue(), entry.getKey());
                }
            }
        } else System.out.println("Такого человека нет в справочнике");
    }

    public void getDirect() {
        if (!direct.isEmpty()) {
            List<Long> listDirect = new ArrayList<>(direct.keySet());
            Collections.sort(listDirect);
            Collections.reverse(listDirect);
            LinkedHashMap<Long, String> sortArray = new LinkedHashMap<>(direct);
            for (Long i : listDirect) {
                System.out.printf("%d : %s\n", i, sortArray.get(i));
            }
        } else System.out.println("Справочник пуст");
    }

    public void addNumber() {
        System.out.println("Введите номер и имя через запятую: ");
        String[] arrayString = scanner.nextLine().trim().split(",");
        Long number = Long.parseLong(arrayString[0].trim());
        String str = arrayString[1].trim();
        if (direct.containsKey(number)) {
            System.out.println("Такой номер уже есть в справочнике. Хотите перезаписать? y/n");
            if (scanner.nextLine().equals("y")) {
                direct.replace(number, str);
            }
        } else if (direct.containsValue(str) && !direct.containsKey(number)) {
            System.out.println("Такой человек уже есть в справочнике. Хотите его добавить с другим номером? y/n");
            if (scanner.nextLine().equals("y")) {
                direct.put(number, str);
            }
        } else direct.put(number, str);

    }
}
