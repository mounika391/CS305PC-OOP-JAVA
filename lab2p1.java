import java.util.Scanner;
class lab2p1{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	s.nextLine();
	String op = s.nextLine();
	switch(op){
		case"++":
			System.out.println("post:"+(a++));
			System.out.println("pre:"+(++a));
			break;
		case"--":
			System.out.println("post:"+(a--));
			System.out.println("pre:"+(--a));
			break;
		case"+":
			a=+a;
			System.out.println("Unary + :"+(+a));
			break;
		case"-":
			a=-a;
			System.out.println("Unary + :"+(a));
			break;
		case"~":
			System.out.println("Unary + :"+(~a));
			break;
		default	:
			System.out.println("enter the wrong OP");
			System.out.println("the out :" + (a++ + ++a));
			
	
		}
	}
	}
