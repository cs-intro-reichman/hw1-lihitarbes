// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
int lin =Integer.parseInt(args[0]);
int a = (int)((Math.random()) * (lin));
int b = (int)(Math.random() * (lin));
int c = (int)(Math.random() * (lin));

System.out.println(a + " " + b + " " + c);

int small = Math.min(a, b);
int small1 = Math.min(small, c);
int large = Math.max(a, b);
int large1 = Math.max(large, c); 
int middle = Math.max(small, c); 
int middle1 = Math.min(middle, large);

System.out.println(small1  + " " + middle1 + " " + large1);
	}
	}



