package hospital.utils;
import hospital.procedimentos.*;

public abstract class Validar {
	private static Parto parto = new Parto();
	//private static LipoAspiracao lipoAspiracao = new LipoAspiracao();
	//private static Vasectomia vasectomia = new Vasectomia();
	
	public static Operacao[] operacoesDisponiveis = new Operacao[] {parto/*, consultaInfantil, lipoAspiracao*/};
	
	public static boolean procedimento(String procedimentoRequisitado) {
		boolean validadeprocedimento = false;
		for (Operacao operacao : operacoesDisponiveis) {
			if(procedimentoRequisitado.equalsIgnoreCase(operacao.getNome())) {
				validadeprocedimento = true;
				break;
			}
		}
		return validadeprocedimento;
	}
}
