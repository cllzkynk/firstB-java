package week_10;

import java.util.Scanner;

public class SchoolManegment {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("*********KURSUMUZA HOSGELDİNİZ*********");

		String islemler = "1.İslem : Kayıt İşlemleri\n" + "2.İşlem : Eğitim İşlemleri\n"
				+ "3.İşlem : Muhasebe İşlemleri\n" + "4.İşlem : Çıkış için q";

		while (true) {
			System.out.println("**************************************");
			System.out.println("Ana sayfaya hogeldiniz...");
			System.out.println(islemler);
			System.out.println("**************************************");
			System.out.print("Yapmak istediğiniz işlemi giriniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Çıkış yapılıyor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("**************************************");
				System.out.println("Kayıt işlemlerine hoşgeldiniz...");
				String kayitislemler = "1.İslem : Kurs Kaydı\n" + "2.İşlem : Kayıt Silme\n" + "3.İşlem : Ön Kayıt\n"
						+ "4.İşlem : Çıkış için q";
				System.out.println(kayitislemler);
				System.out.println("**************************************");

				while (true) {

					System.out.print("Lütfen işem seçiniz: ");
					String kayitislem = scanner.nextLine();

					if (kayitislem.equals("q")) {
						System.out.println("Çıkış yapılıyor...");
						break;
					} else if (kayitislem.equals("1")) {
						System.out.println("**************************************");
						System.out.print("Lütfen Ad-Soyad giriniz: ");
						String ad = scanner.nextLine();

						System.out.println("Kurs Kaydınız yapılıyor...");
						System.out.println(ad + " kurs kaydınız başarı ile yapılmıştır.");
					} else if (kayitislem.equals("2")) {
						System.out.println("**************************************");
						System.out.print("Lütfen Ad-Soyad giriniz: ");
						String ad = scanner.nextLine();

						System.out.println("Kurs Kaydınız siliniyor...");
						System.out.println(ad + " kurs kaydınız başarı ile silinmiştir.");
					} else if (kayitislem.equals("3")) {
						System.out.println("**************************************");
						System.out.print("Lütfen Ad-Soyad giriniz: ");
						String ad = scanner.nextLine();

						System.out.println("Ön kaydınız yapılıyor...");
						System.out.println(ad + " ön kaydınız yapıldı.");
					} else {
						System.out.println("Hatalı giriş yaptınız...");
					}

				}

			} else if (islem.equals("2")) {
				System.out.println("**************************************");
				System.out.println("Eğitim işlemlerine hoşgeldiniz...");
				String kayitislemler = "1.İslem : Mentörler\n" + "2.İşlem : Mentöring saatleri\n"
						+ "3.İşlem : Ders Saatleri\n" + "4.İşlem : Çıkış için q";
				System.out.println(kayitislemler);
				System.out.println("**************************************");

				while (true) {

					System.out.print("Lütfen işem seçiniz: ");
					String kayitislem = scanner.nextLine();

					if (kayitislem.equals("q")) {
						System.out.println("Eğitim işlemlerinden çıkılıyor...");
						break;
					} else if (kayitislem.equals("1")) {
						System.out.println("**************************************");
						System.out.println("Mentörlerimiz: ");

						System.out.println("1.Mentör : Ömer Bey\n" + "2.Mentör : Sema Hanım\n" +

								"3.Mentör : Burak Bey\n" + "4.Mentör : Zeynep Hanım\n" + "5.Mentör : Tahir Bey");
						System.out.println("**************************************");

					} else if (kayitislem.equals("2")) {
						System.out.println("**************************************");
						System.out.println("Mentöring Saatleri: ");
						System.out.println("1.Ömer Bey : Cumartesi 12.00\n" + "2.Sema Hanım : Salı 18.00\n"
								+ "3.Burak Bey : Cumartesi 11.00\n" + "Zeynep Hanım : Cuma 18.00\n"
								+ "Tahir Bey : Pazartesi 18.00");
						System.out.println("**************************************");

					} else if (kayitislem.equals("3")) {
						System.out.println("**************************************");
						System.out.println("Ders Saatleri: ");
						System.out.println("Pazartesi: 19.00-22.00\n" + "Salı: 19.00-22.00\n"
								+ "Çarşamba: 19.00-22.00\n" + "Perşembe: 19.00-22.00\n" + "Cuma: 19.00-22.00");
						System.out.println("**************************************");
					} else {
						System.out.println("Hatalı giriş yaptınız...");
					}

				}

			} else if (islem.equals("3")) {
				System.out.println("**************************************");
				System.out.println("Muhasebe işlemlerine hoşgeldiniz...");
				String kayitislemler = "1.İslem : Para Ödeme\n" + "2.İşlem : Ödeme Planı\n" + "3.İşlem : Kalan Ödeme\n"
						+ "4.İşlem : Çıkış için q";
				System.out.println(kayitislemler);
				System.out.println("**************************************");

				while (true) {

					System.out.print("Lütfen işem seçiniz: ");
					String kayitislem = scanner.nextLine();

					if (kayitislem.equals("q")) {
						System.out.println("Muhasebe işlemlerinden çıkılıyor...");
						break;
					} else if (kayitislem.equals("1")) {
						System.out.println("**************************************");
						System.out.println("Para Ödeme: ");

						System.out.print("Yatırmak istediğiniz tutar: ");
						String tutar = scanner.nextLine();
						System.out.println(tutar + " Euro ödendi");
						System.out.println("**************************************");

					} else if (kayitislem.equals("2")) {
						System.out.println("**************************************");
						System.out.println("Ödeme Planı: ");
						System.out.println("6 ay boyunca 900 Euro. İşe girince 2900 Euro");
						System.out.println("**************************************");

					} else if (kayitislem.equals("3")) {
						System.out.println("**************************************");
						System.out.println("Kalan Ödemeler: ");
						System.out.println("Kalan ödeme = ıvır zıvır");
						System.out.println("**************************************");
					} else {
						System.out.println("Hatalı giriş yaptınız...");
						break;
					}

				}
			} else {
				System.out.println("Hatalı giriş yaptınız...");
				break;
			}

		}
	}
}
