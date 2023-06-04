import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int sayi;
     double sonuc,toplam=0.0;
     Scanner input=new Scanner(System.in);
     sayi=input.nextInt();
     sonuc=1;
     for(double i=1;i<=sayi;i++){
         sonuc=sonuc/i;
         toplam=toplam+sonuc;
     }
     System.out.print("Sonuc:"+toplam);
    }
}