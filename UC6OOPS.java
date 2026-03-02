public class UC6OOPS {
    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }
    static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }
    static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
    public static void main(String[] args) {
        String[][] banner = {
                getO(),
                getO(),
                getP(),
                getS()
        };
        for (int row = 0; row < banner[0].length; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
}