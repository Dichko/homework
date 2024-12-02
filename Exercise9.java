public class Exercise9 {
    public static void main(String[] args) {
        int year=2024;
        boolean c=(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
                System.out.println(c);
    }
}

