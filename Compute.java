package methods;

public class Compute {
	public int voto;
	public static int votosc=0;
	public double vf=0;
	public double vc=0;
	public double vb=0;
	public double vn=0;
	public static double pf;
	public static double pc;
	public static double pb;
	public static double pn;
	public void computar(){
		votosc++;
	    switch(voto){
	    case 10:
    		vf++;
    		break;
    	case 15:
    		vc++;
	        break;
        case 20:
            vb++;
            break;
        case 99:
            vn++;
            break;
        default:
        	votosc--;
	        System.out.print("Desculpe, não conseguimos identificar essa opção\n");
            break;
	    }
    pf = (vf / votosc) * 100;
    pc = (vc / votosc) * 100;
    pb = (vb / votosc) * 100;
    pn = (vn / votosc) * 100;
	}
}