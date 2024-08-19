package hospital.funcionarios;

public class Pediatra extends Medico{

	public Pediatra(String nome, String cpf, String dataNascimento, String dataAdmissao, int crm) {
		super(nome, cpf, dataNascimento, dataAdmissao, crm);
	}

	@Override
	public void operar() {
		this.falar("Verificando qualidade da criança");
	}

}
