import java.util.*;
public class UC8OOPS {
    static Map<Character, String[]> map = new HashMap<>();
    static {
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }
    static void render(String word) {
        for (int i = 0; i < 5; i++) {
            for (char c : word.toUpperCase().toCharArray()) {
                System.out.print(map.get(c)[i] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        render("OOPS");
    }
}