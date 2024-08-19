package hospital.procedimentos;

import hospital.funcionarios.Medico;
import hospital.pacientes.Paciente;

public abstract class Operacao {
	protected String operacaoNome;
	protected Medico[] medicosOperantes;
	public abstract void setMedicos(Medico[] medicos);
	public abstract void serRealizada(Paciente pacienteOperando);
	public String getNome() {
		return operacaoNome;
	}
}
