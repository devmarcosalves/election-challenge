package methods;
import java.util.Scanner;
import static methods.Compute.pf;
import static methods.Compute.pb;
import static methods.Compute.pc;
import static methods.Compute.pn;

public class Winner {
	public double pf, pc, pb, pn;
	public int mv;
	
public String vencedor() {
	pf = Compute.pf;
	pc = Compute.pc;
	pb = Compute.pb;
	pn = Compute.pn;
 	mv = 0;
    if(pn>pf && pn>pc && pn>pb){
    	System.out.print("\nPelo excesso de votos NULOS, a eleição foi CANCELADA.");
    	return "Haverá uma nova eleição com outros candidatos";
	}
    if(pf>50 || pc>50 || pb>50){
        if(pf>pc && pf>pb && pf>pn){
            mv = 10;
            return "O vencedor é FULANO";
        }else if(pc>pf && pc>pb && pc>pn){
            mv = 15;
            return "O vencedor é CICLANO";
        }else if(pb>pf && pb>pc && pb>pn){
            mv = 20;
            return "O vencedor é BELTRANO";
        }
    }else if(pf<=50 || pc<=50 || pb<=50){
    	return "SEGUNDO TURNO";
    }
	return null;
}	
}