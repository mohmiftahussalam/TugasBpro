import java.util.*;

public class TebakCoin{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Program Tebak Coin");
		System.out.println("Massukan Tebakan Anda [1: gambar 0:Angka]");
		int tebakanUser = sc.nextInt();
		System.out.println("Anda Menebak = " + (tebakanUser==1?"Gambar":"Angka"));
		
		//tampilkan apa yang dikeluarkan oleh program/komputer
		//jika tebakan user sama dengan angka yang dikeliarkan komputer
		//maka user menang ! jika tidak user kalah
		
		int pcOut = (int) (Math.random() + 0.5);
		System.out.println("Komputer Menghasilkan = " + (pcOut==1?"Gambar":"Angka"));
		if(tebakanUser==pcOut)
			System.out.println("Selamat Anda Menang");
		else
			System.out.println("Maaf Anda Kalah");
			
	}
}