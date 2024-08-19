package hospital.funcionarios;
import hospital.pessoa.Pessoa;
import hospital.utils.Validar;

public abstract class Funcionario extends Pessoa{
	
	protected String dataAdmissao;
	
	protected Funcionario(String nome, String cpf, String dataNascimento, String dataAdmissao) {
		super(nome, cpf, dataNascimento);
		this.dataAdmissao = dataAdmissao;
	}
	
	public void falar(String mensagem) {
		System.out.println(this.nome + ": " + mensagem);
	}
	
	public String getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public boolean validarServicoRequisitado(String servicoRequisitado) {
		return Validar.procedimento(servicoRequisitado);
	}
	
}
