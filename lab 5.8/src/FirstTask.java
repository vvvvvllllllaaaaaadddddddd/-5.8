public class FirstTask {
    public static void main(String[] args) {
        int n = 62;
        if (n > 50) {
            if (n < 100) {
                System.out.println("Число " + n + " міститься на проміжку (50;100)");
            }
        }if (n < 50) {
            System.out.println("Число " + n + " не міститься на проміжку (50;100)");
        }if (n > 100) {
            System.out.println("Число " + n + " не міститься на проміжку (50;100)");
        }
    }
}
