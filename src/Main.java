import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiniz : ");
        int secim = scan.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2 :
                System.out.println("Çıkartma : " + (n1-n2));
                break;
            case 3 :
                if(n2 != 0){
                    System.out.println("Bölme : " + (n1/n2));
                }else {
                    System.out.println("Sıfıra bölünemez!");
                }
                break;
            case 4 :
                System.out.println("Çarpma : " + (n1*n2));
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }


    }
}
