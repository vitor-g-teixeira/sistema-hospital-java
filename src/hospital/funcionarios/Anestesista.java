package hospital.funcionarios;

public class Anestesista extends Medico{

	public Anestesista(String nome, String cpf, String dataNascimento, String dataAdmissao, int crm) {
		super(nome, cpf, dataNascimento, dataAdmissao, crm);
	}

	@Override
	public void operar() {
		this.falar("Anestesiando");
	}
}
