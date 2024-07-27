package classe.medico;

public class Procedimento {
    private int id;
    private String cpfPaciente;
    private String protocoloConsulta;
    private String procedimento;

    private Procedimento(Builder builder) {
        this.id = builder.id;
        this.cpfPaciente = builder.cpfPaciente;
        this.protocoloConsulta = builder.protocoloConsulta;
        this.procedimento = builder.procedimento;
    }

    public Procedimento(String cpf, String valueOf, String procedimento2) {
		// TODO Auto-generated constructor stub
	}

	public static class Builder {
        private int id;
        private String cpfPaciente;
        private String protocoloConsulta;
        private String procedimento;

        public Builder(int id) {
            this.id = id;
        }

        public Builder cpfPaciente(String cpfPaciente) {
            this.cpfPaciente = cpfPaciente;
            return this;
        }

        public Builder protocoloConsulta(String protocoloConsulta) {
            this.protocoloConsulta = protocoloConsulta;
            return this;
        }

        public Builder procedimento(String procedimento) {
            this.procedimento = procedimento;
            return this;
        }

        public Procedimento build() {
            return new Procedimento(this);
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public String getProtocoloConsulta() {
		return protocoloConsulta;
	}

	public void setProtocoloConsulta(String protocoloConsulta) {
		this.protocoloConsulta = protocoloConsulta;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}


}