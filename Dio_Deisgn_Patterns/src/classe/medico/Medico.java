package classe.medico;

public class Medico {
    private String nomeCompleto;
    private int idade;
    private String cpf;
    private String nomeDaRua;
    private String numeroDaCasa;
    private String cep;
    private String crm;
    private int especialidade;
    private String telefone;

    private Medico(Builder builder) {
        this.nomeCompleto = builder.nomeCompleto;
        this.idade = builder.idade;
        this.cpf = builder.cpf;
        this.nomeDaRua = builder.nomeDaRua;
        this.numeroDaCasa = builder.numeroDaCasa;
        this.cep = builder.cep;
        this.crm = builder.crm;
        this.especialidade = builder.especialidade;
        this.telefone = builder.telefone;
    }

    public Medico(String nome, int idade2, String cpf2, String nomeDaRua2, int numeroDaCasa2, String cep2, String crm2,
			int especialidade2, String telefone2) {
		// TODO Auto-generated constructor stub
	}

	public static class Builder {
        private String nomeCompleto;
        private int idade;
        private String cpf;
        private String nomeDaRua;
        private String numeroDaCasa;
        private String cep;
        private String crm;
        private int especialidade;
        private String telefone;

        public Builder(String nomeCompleto, int idade) {
            this.nomeCompleto = nomeCompleto;
            this.idade = idade;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder nomeDaRua(String nomeDaRua) {
            this.nomeDaRua = nomeDaRua;
            return this;
        }

        public Builder numeroDaCasa(String numeroDaCasa) {
            this.numeroDaCasa = numeroDaCasa;
            return this;
        }

        public Builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder crm(String crm) {
            this.crm = crm;
            return this;
        }

        public Builder especialidade(int especialidade) {
            this.especialidade = especialidade;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Medico build() {
            return new Medico(this);
        }
    }

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}

	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}