public class SecondTask {
    public static void main(String[] args) {
        int a, b, c, d, n;;
        n = 546;
        a = n % 10;                 //Не розумію як зробити це завдання
        b = n / 10;
        d = n % 100;
        c = n / 100;
        if (a > d && a > c) {
            System.out.println("Найбільше число, числа " + n + " : " + a);
        }
        if (d > a && d > c) {
            System.out.println("Найбільше число, числа " + n + " : " + d);
        } else if (c > a && c > d) {
            System.out.println("Найбільше число, числа " + n + " : " + c);
        } else if (a == d && d == c){
            System.out.println("Всі числа однакові");
        }else {
            System.out.println("Введено щось не то");
        }
    }
}



