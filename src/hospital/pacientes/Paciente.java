package hospital.pacientes;
import hospital.pessoa.Pessoa;
import java.util.Scanner;

import hospital.funcionarios.*;

public class Paciente extends Pessoa{
	private String procedimentoNecessario = "";
	private String estado;
	
	public Paciente(String nome, String cpf, String dataNascimento){
		super(nome, cpf, dataNascimento);
		this.estado = "Esperando";
	}
	
	public void setProcedimentoNecessario(String procedimentoNecessario){
		this.procedimentoNecessario = procedimentoNecessario;
	}
	
	public void setEstado(String novoEstado) {
		this.estado = novoEstado;
	}
	
	public String getProcedimentoNecessario() {
		return this.procedimentoNecessario;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getResposta() {
		Scanner input = new Scanner(System.in);
		System.out.print(this.nome + ": ");
		return input.nextLine();
	}
	
	public void serAtendido(Funcionario funcionario) {
		if(!(funcionario instanceof Atendente)) {
			System.out.println(funcionario.getNome() + ": Converse com um atendente");
		}else{
			Atendente atendente = (Atendente) funcionario;
			atendente.atenderPaciente(this);
		}
	}
}
