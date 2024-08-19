package hospital.funcionarios;
import hospital.pacientes.Paciente;
import java.util.Scanner;

public class Atendente extends Funcionario{

	public Atendente(String nome, String cpf, String dataNascimento, String dataAdmissao) {
		super(nome, cpf, dataNascimento, dataAdmissao);
	}
	
	public void atenderPaciente(Paciente pacienteAtendendo) {
		Scanner input = new Scanner(System.in);
		String nomePaciente = pacienteAtendendo.getNome();
		this.falar("Olá " + nomePaciente + "! Me informe o servico que necessita: ");
		String servicoRequisitado = pacienteAtendendo.getResposta();
		boolean validadeServico = this.validarServicoRequisitado(servicoRequisitado);
		
		if(validadeServico) {
			pacienteAtendendo.setProcedimentoNecessario(servicoRequisitado);
			pacienteAtendendo.setEstado("Atendido");
			this.falar(": Certo Sr." + nomePaciente + "! Nosso médicos irão atende-lo!");
		}else {
			this.falar(": Lamento Sr. " + nomePaciente + ", infelizmente não oferecemos o serviço de " + servicoRequisitado);
		}
	}
	
}
