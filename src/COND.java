
public class COND {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int g=30;
		if (a < b) {
			System.out.println("a is less than b");
			int c = 50;
			int d = 40;
			if (c > d) {
				System.out.println("c is greater than d");
				int e = 20;
				int f = 0;
				switch (e) {
				case 10: {
					f = 10;
					System.out.println(f);
					break;		
				}
				case 20: {
					if(e<=20)
					f = 20;
					System.out.println(f);
					break;
				}
				case 30: {
					if(e<=30)
					f = 30;
					System.out.println(f);
					break;
				}
				case 40: {
					if(e<=40)
					f = 40;
					System.out.println(f);
					break;
				}
				case 50: {
					if(e<=50)
					f = 50;
					System.out.println(f);
					break;
				}
				case 60: {
					if(e<=60)
					f = 60;
					System.out.println(f);
					break;
				}
				case 70: {
					if(e<=70)
					f = 70;
					System.out.println(f);
					break;
				}
				case 80: {
					if(e<=80)
					f = 80;
					System.out.println(f);
					break;
				}
				case 90: {
					if(e<=90)
					f = 90;
					System.out.println(f);
					break;
				}
				default:System.out.println(f);
				}
			} else
				System.out.println("b is greater than b");
		} else
			System.out.println("b is greater than a");
		if(a!=b)
			System.out.println("a is not equal to b");
		if(a!=b && g!=b)
			System.out.println("a is not equal to both b and g");
		a++;
		System.out.println(a++);
		a++;
		b++;
		System.out.println(a++);
		System.out.println(b++);
		a=a+3+b++;
		g=g*2+b++;
		System.out.println(a);
		System.out.println(g);
		System.out.println((a<b)?250:350);
	}

}
