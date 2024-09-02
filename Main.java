import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.print("Toplam = " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.print("Cikarma = " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Carpma = " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Ikinci sayi sifirdan farkli olmali!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolum = " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Cevresi : " +(2*(a+b)));
        System.out.println("Alani : " + (a*b));
    }

            public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int select;

            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Mod Alma\n"
                    + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

            while (true) {
                System.out.println(menu);
                System.out.println("Bir islem seciniz : ");
                System.out.print("================");
                select = scan.nextInt();

                if (select == 0) {
                    break;
                }
                System.out.print("Ilk sayi : ");
                int a = scan.nextInt();
                System.out.print("Ikinci sayi :");
                int b = scan.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        if (divided(a, b) == 0) {
                            System.out.println("Ikinci sayi '0' dan farkli olmali ");
                        }
                        break;
                    case 5:
                        System.out.println("Us Hesabi : " + power(a, b));
                        break;
                    case 6:
                        System.out.println("Mod islemi :" + mod(a, b));
                        break;
                    case 7:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("Gecersiz bir islem girdiniz : ");

                }
            }
            System.out.println("Gule Gule!");
        }
    }

