import java.util.*;

public class BillCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sale, taxes, total;
		
		final double TAX_RATE = 0.08;
		final double SHIPPING_FEE = 5.00;
		
		System.out.print("Enter The Item Price : ");
		sale = input.nextDouble();
		taxes = sale* TAX_RATE;
		total = sale + taxes;
		
		System.out.println("sale:$" + sale);
		System.out.println("tax:$" + taxes);
		
		
		//tipe penggunaa bollean
		if(sale < 25.00)
		{
			total += SHIPPING_FEE;
			System.out.println("Shipping is $5.00");
		}
		
		System.out.println("Final cost $" + total);
		
	}
}