package br.progep.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fun_codigo")
	private Long codigo;
	
	@Column(name = "fun_nome", nullable = false, length = 50)
	@Length(max = 50, message = "O nome do Funcion�rio n�o pode ter mais que {max} carateres!")
	@NotBlank(message = "O nome do funcion�rio n�o pode ficar em branco!")
	private String nome;
	
	@Column(name = "fun_cpf", nullable = false, length = 14, unique = true)
	@Length(max = 14, message = "O CPF do Funcion�rio n�o pode ter mais que {max} carateres!")
	@NotBlank(message = "O CPF do funcion�rio n�o pode ficar em branco!")
	@CPF
	private String cpf;
	
	@Column(name = "fun_senha", nullable = false, length = 32)
	@Length(max = 32, message = "A senha do Funcion�rio n�o pode ter mais que {max} carateres!")
	@NotBlank(message = "A senha do funcion�rio n�o pode ficar em branco!")
	private String senha;
	
	@Column(name = "fun_funcao", nullable = false, length = 50)
	@Length(max = 50, message = "A fun��o do Funcion�rio n�o pode ter mais que {max} carateres!")
	@NotBlank(message = "A fun��o do funcion�rio n�o pode ficar em branco!")
	private String funcao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo = " + codigo + ", nome = " + nome + ", cpf = " + cpf + ", senha = " + senha + ", funcao = "
				+ funcao + "]";
	}
	
	

}
