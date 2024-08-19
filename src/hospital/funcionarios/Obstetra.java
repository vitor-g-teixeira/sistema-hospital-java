package hospital.funcionarios;

public class Obstetra extends Medico{
	
	public Obstetra(String nome, String cpf, String dataNascimento, String dataAdmissao, int crm) {
		super(nome, cpf, dataNascimento, dataAdmissao, crm);
	}

	@Override
	public void operar() {
		this.falar("Realizando parto");
	}

}
