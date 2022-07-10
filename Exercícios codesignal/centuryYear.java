public class centuryYear {
    public static void main(String args[]) {
        System.out.printf("%s", century(2000));
    }
    public static int century(int year) {
        if (year % 100 != 0) {
            return 1 + (year/100);

        } else {
            return year / 100;
        }
    }
}
