// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
	int currentvalue = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	double rate1 = (rate / 100.00);
	int n = Integer.parseInt(args[2]);
	double futurevalue = (double)currentvalue * Math.pow((1.0 + rate1), n);
System.out.println(" After " + n+ " years" + ", a " + "$" + currentvalue +  " saved at " + rate + "%" + " will yield " + "$" + (int)futurevalue );
	}

}
