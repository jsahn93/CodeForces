import java.util.Scanner;

public class five118A {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a[] = sc.next().split("");
		String b = new String();


		for(int i=0; i<a.length; i++) {
			
			if(a[i].equals("a") || a[i].equals("A") || a[i].equals("e") || a[i].equals("E") || a[i].equals("i") || 
					a[i].equals("I") || a[i].equals("o") || a[i].equals("O")  || a[i].equals("u") || a[i].equals("U") 
					|| a[i].equals("y") || a[i].equals("Y")) {
				a[i] = "";
			} else {
				a[i] = "." + a[i];
			}
			b += a[i];
		} 		
		System.out.println(b.toLowerCase());
	}
}
