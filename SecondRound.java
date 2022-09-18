package methods;
import static methods.Compute.pf;
import static methods.Compute.pb;
import static methods.Compute.pc;
import static methods.Compute.pn;

public class SecondRound {
	public double pf, pc, pb, pn;

	public void segundoturno(){
		pf = Compute.pf;
		pc = Compute.pc;
		pb = Compute.pb;
		pn = Compute.pn;
		System.out.println((pf>pn && pf>pb && pc>pb) ? "Candidatos: \n10-FULANO 15-CICLANO" :
	    (pf>pn && pf>pc && pb>pc) ? "Candidatos: \n10-FULANO 20-BELTRANO" : 
	    (pc>pn && pc>pb && pf>pb) ? "Candidatos: \n15-CICLANO 10-FULANO" :
	    (pc>pn && pc>pf && pb>pf) ? "Candidatos: \n15-CICLANO 20-BELTRANO" :
	    (pb>pn && pb>pc && pf>pc) ? "Candidatos: \n20-BELTRANO 10-FULANO" :
	    (pb>pn && pb>pf && pc>pf) ? "Candidatos: \n20-BELTRANO 15-CICLANO" : "teste de erro");
    }
}