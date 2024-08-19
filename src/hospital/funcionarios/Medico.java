package hospital.funcionarios;

public abstract class Medico extends Funcionario{
	
	protected int crm;
	
	protected Medico(String nome, String cpf, String dataNascimento, String dataAdmissao, int crm) {
		super(nome, cpf, dataNascimento, dataAdmissao);
		this.crm = crm;
	}
	
	public int getCrm(){
		return this.crm;
	}
	
	public abstract void operar();
}
