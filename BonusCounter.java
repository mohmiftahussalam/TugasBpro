/**
* Program untuk menghitung bonus pembelian
* dengan ketentuan setiap beli 2 gratis 1
* contoh beli = 3 --> 3+1 = 4
*/

public class BonusCounter{
	public static void main(String []args){
		int jmlBarang=25;
		int bonus = jmlBarang/2;
		int jmlBarangPlusBonus = jmlBarang + bonus; 
		int harga1 = 25000;
		int hargaplusbonus = jmlBarang * harga1;
		
		System.out.println("");
		
		System.out.println("jmlBarang yang dibeli= " + jmlBarang);
		System.out.println("bonus yang didapat = " + bonus);
		System.out.println("jmlBarang + bonus = " + jmlBarangPlusBonus);
		System.out.println("Harga Jumlah Barang + bonus = " + hargaplusbonus );
	}
}

// Tugas : 1 barang = 25000 , cari harga jual+bonus = ?????????????