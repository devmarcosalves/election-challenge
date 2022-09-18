package application;
import java.util.Locale;
import java.util.Scanner;
import methods.Compute;
import methods.Winner;
import methods.SecondRound;
public class Voting {
	public static void main(String[] args) {
		Compute com = new Compute();
		Winner win = new Winner();
		SecondRound sec = new SecondRound();
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    int opc=0;
	    String nome;
	    double titulo;
		System.out.print("\t\tSistema Nacional de Eleição\n");
		do{
			System.out.print("\nDigite o seu primeiro nome: ");
			nome = sc.next();
		    System.out.print("Digite o número do título de eleitor: ");
		    titulo = sc.nextDouble();
		    System.out.print("CANDIDATOS: \n10-FULANO 15-CICLANO \n20-BELTRANO 99-BRANCO/NULO");
		    System.out.print("\nDigite o seu voto: ");
		    com.voto = sc.nextInt();
		    com.computar();
		    System.out.print("Digite 1 para votar novamente ou 0 para sair: ");
		    opc = sc.nextInt();
		}while(opc==1);
		String vencedor = win.vencedor();
		System.out.println("\n" + vencedor);
		if(vencedor == "SEGUNDO TURNO") {
			sec.segundoturno();
		}
		sc.close();
	}
}