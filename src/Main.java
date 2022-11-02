import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();
            if (userName.equals("baris") && password.equals("123")){
                System.out.println("Merhabalar, Çakır Banka Hoşgeldiniz!");
              do {

                  System.out.println("1- Para Yatırma \n" +
                          "2- Para Çekme\n" +
                          "3- Bakiye Sorgulama\n" +
                          "4- Çıkış Yap ");
                  System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                  select = input.nextInt();

                  switch (select){
                      case 1:
                          System.out.print("Para Miktarı : ");
                          int price = input.nextInt();
                          balance += price;
                          System.out.println("Güncel Bakiyeniz :" + balance);
                          break;
                      case 2:
                          System.out.print("Para Miktarı : ");
                          int brice = input.nextInt();

                            if (brice > balance){
                              System.out.println("İşlem için bakiyeniz yetersiz!");

                          }else {
                                balance -= brice;
                                System.out.println("Güncel Bakiyeniz :" + balance);
                            }
                          break;
                      case 3:
                          System.out.println("Bakiyeniz : " + balance);
                          break;



                  }
              }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
              break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right ==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }


    }
}