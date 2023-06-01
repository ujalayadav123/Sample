import java.util.Scanner;
//Calculate SI=P*R*T/100
class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t,p,r;
		System.out.println("Enter Time : ");
		t = sc.nextInt();
		System.out.println("Enter Principal : ");
		p = sc.nextInt();
		System.out.println("Enter Rate of Intereset : ");
		r = sc.nextInt();
		System.out.println("Simple Interest : "+((p * r * t)/100));
	}
}
