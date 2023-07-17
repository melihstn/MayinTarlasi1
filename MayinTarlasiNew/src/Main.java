import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int row, column;
        System.out.println("mayın tarlasına hoşgeldiniz..");
        System.out.println("lütfen oynamak istediğiniz boyutları giriniz.");
        System.out.print("satır sayısı : ");
        row = scan.nextInt();
        System.out.print("sütün sayısı : ");
        column = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();

    }
}