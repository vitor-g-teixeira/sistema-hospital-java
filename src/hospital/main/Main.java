package hospital.main;
import hospital.pacientes.Paciente;
import hospital.procedimentos.Parto;
import hospital.utils.Validar;
import hospital.funcionarios.*;

public class Main {
	
	public static void main(String[] args) {
		while(true) {
			Paciente paciente = new Paciente("Jonas", "866.931.230-15", "18/04/2003");
			Atendente atendente = new Atendente("Andressa", "123.456.789-10", "12/02/2000", "22/05/2019");
			Anestesista anestesista = new Anestesista("Jorge", "234.567.890-12", "15/06/1990", "28/01/2022", 1);
			Obstetra obstetra = new Obstetra("João", "345.678.901-23", "17/03/1983", "26/06/2009", 2);
			Pediatra pediatra = new Pediatra("Jaime", "345.678.901-23", "17/03/1988", "12/05/2012", 3);
			
			paciente.serAtendido(atendente);
			
			if(Validar.procedimento(paciente.getProcedimentoNecessario())) {
				Parto operacao = new Parto();
				operacao.setMedicos(new Medico[]{anestesista, obstetra, pediatra});
				operacao.serRealizada(paciente);
				break;
			}//else if() {
				
			//}
		}
	}
	
}
