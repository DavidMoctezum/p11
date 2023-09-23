import java.util.Scanner;

public class p11_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresa la operacion que desea realizar (suma,resta,multiplicacion,division,potencia,raiz cuadrada), ");
		String opc="suma";
		opc=teclado.nextLine();
		switch(opc){
		case "suma":
			System.out.println("Haremos una suma");
			Scanner input = new Scanner(System.in);
			int a,b,c;
			System.out.println("Ingresa dos valores: ");
			a = input.nextInt();
			b = input.nextInt();
			c = a + b;
			System.out.println("La suma es:" + c);
			break;

		case "resta":
			System.out.println("Haremos una resta");
			Scanner res = new Scanner(System.in);
			int ar,br,cr;
			System.out.println("Ingresa dos valores: ");
			ar = res.nextInt();
			br = res.nextInt();
			cr = ar - br;
			System.out.println("La resta es:" + cr);
			break;

		case "multiplicacion":
			System.out.println("Haremos una multiplicacion");
			Scanner mul = new Scanner(System.in);
			int am,bm,cm;
			System.out.println("Ingresa dos valores: ");
			am = mul.nextInt();
			bm = mul.nextInt();
			cm = am * bm;
			System.out.println("La multiplicacion es:" + cm);
			break;
		case "division":
			System.out.println("ingrese la division");
			Scanner div = new Scanner(System.in);
			int ad,bd,cd;
			System.out.println("Ingresa dos valores: ");
			ad = div.nextInt();
			bd = div.nextInt();
			cd = ad / bd;
			System.out.println("La division es:" + cd);
			break;
		case "potencia":
			System.out.println("haremos una potencia");
			Scanner pot = new Scanner(System.in);
			int ap,bp,cp;
			System.out.println("Ingresa dos valores: ");
			ap = pot.nextInt();
			bp = pot.nextInt();
			cp = ap  bp;
			System.out.println("La potencia es:" + cp);
			break;
			case "raiz cuadrada":
			System.out.println("ingrese la raiz cuadrada");
			Scanner raz = new Scanner(System.in);
			int az,bz,cz;
			System.out.println("Ingresa dos valores: ");
			az = raz.nextInt();
			bz = raz.nextInt();
			cz = az - bz;
			System.out.println("La raiz es:" + cz);
			break;
		default:
			System.out.println("no se encuentra la opcion");
		}
	}
}