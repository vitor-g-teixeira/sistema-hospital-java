package hospital.procedimentos;
import hospital.pacientes.Paciente;
import hospital.funcionarios.*;

public final class Parto extends Operacao{
	public Parto() {
		operacaoNome = "Parto";
	}
	
	@Override
	public void setMedicos(Medico[] medicos) {
		this.medicosOperantes = medicos;
	}
	
	@Override
	public void serRealizada(Paciente pacienteOperando) {
		// TODO Auto-generated method stub
		pacienteOperando.setEstado("Operando");
		for (Medico medico : medicosOperantes) {
			medico.operar();
		}
		pacienteOperando.setProcedimentoNecessario("");
		pacienteOperando.setEstado("Operado");
	}
}
