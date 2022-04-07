import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bakiye=10000;
		int sayac = 0;

		String kullanıcı,şifre;
		System.out.print("Kullanıcı Adını Giriniz:");
		kullanıcı=scan.nextLine();
		System.out.print("Şifreyi Giriniz: ");
		şifre=scan.nextLine();

		if (kullanıcı.equals("deneme") && şifre.equals("deneme1")) {
			System.out.println("Sisteme başarılı şekilde giriş yapıldı !\n");
			System.out.println("1-Bakiye sorgulama.");
			System.out.println("2-Para çekme.");
			System.out.println("3-Para yatırma.");
			while (true) {
				System.out.println();
				System.out.print("Lütfen yapmak istediğiniz işlemi giriniz: ");
				int islem=scan.nextInt();
				switch (islem) {
				case 1:
					System.out.println();
					System.out.println("Bakiyeniz: "+ bakiye +" TL'dir.");
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.print("Miktar giriniz: ");
					int miktar =scan.nextInt();
					bakiye-=miktar;
					System.out.println("Güncel bakiyeniz "+ bakiye +" TL'dir.");
					System.out.println();
					break;
				case 3:
					System.out.println();
					System.out.println("Miktar giriniz: ");
					int miktar2 =scan.nextInt();
					bakiye+=miktar2;
					System.out.println("Güncel bakiyeniz "+ bakiye +" TL'dir.");
					System.out.println();
					break;
				default:
					System.out.println("Geçersiz işlem girdiniz:");
					break;	
				}
				System.out.println("Yapmak istediğiniz başka bir işlem var mı? E/H");
				String tekrar=scan.next();
				if (tekrar.equalsIgnoreCase("e"))
					continue;
				if (tekrar.equalsIgnoreCase("h") )
					System.out.println("Çıkış Yapıldı.");       
				break;                                         
			}
		}else {
			System.out.println("Kullanıcı adı ve şifrenizi kontrol edip tekrar deneyin!");
			sayac++;
			System.out.println(sayac+". hatalı denemeniz.");
		}
		scan.close();
	}}