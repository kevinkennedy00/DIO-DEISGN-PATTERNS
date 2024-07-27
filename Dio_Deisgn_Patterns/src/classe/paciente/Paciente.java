package classe.paciente;

public class Paciente {
    private String nomeCompleto;
    private int idade;
    private String cpf;
    private String nomeDaRua;
    private String numeroDaCasa;
    private String cep;
    private String sintomasDoPaciente;
    private String telefone;
    private String protocolo;

    private Paciente(Builder builder) {
        this.nomeCompleto = builder.nomeCompleto;
        this.idade = builder.idade;
        this.cpf = builder.cpf;
        this.nomeDaRua = builder.nomeDaRua;
        this.numeroDaCasa = builder.numeroDaCasa;
        this.cep = builder.cep;
        this.sintomasDoPaciente = builder.sintomasDoPaciente;
        this.telefone = builder.telefone;
        this.protocolo = builder.protocolo;
    }

    public static class Builder {
        private String nomeCompleto;
        private int idade;
        private String cpf;
        private String nomeDaRua;
        private String numeroDaCasa;
        private String cep;
        private String sintomasDoPaciente;
        private String telefone;
        private String protocolo;

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

        public Builder sintomasDoPaciente(String sintomasDoPaciente) {
            this.sintomasDoPaciente = sintomasDoPaciente;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder protocolo(String protocolo) {
            this.protocolo = protocolo;
            return this;
        }

        public Paciente build() {
            return new Paciente(this);
        }

		public Builder numeroDaCasa(int numeroCasa) {
			// TODO Auto-generated method stub
			return null;
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

	public String getSintomasDoPaciente() {
		return sintomasDoPaciente;
	}

	public void setSintomasDoPaciente(String sintomasDoPaciente) {
		this.sintomasDoPaciente = sintomasDoPaciente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

 
}
