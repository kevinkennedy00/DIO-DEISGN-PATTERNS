package classe.paciente;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private int id;
    private String cpfPaciente;
    private int especialidade;
    private LocalDate dataConsulta;
    private LocalTime horario;
    private String protocolo;

    private Consulta(Builder builder) {
        this.id = builder.id;
        this.cpfPaciente = builder.cpfPaciente;
        this.especialidade = builder.especialidade;
        this.dataConsulta = builder.dataConsulta;
        this.horario = builder.horario;
        this.protocolo = builder.protocolo;
    }

    public Consulta(String cpfPaciente2, int especialidade2, LocalDate dataConsulta2, LocalTime horarioConsulta,
			String protocolo2) {
		// TODO Auto-generated constructor stub
	}

	public static class Builder {
        private int id;
        private String cpfPaciente;
        private int especialidade;
        private LocalDate dataConsulta;
        private LocalTime horario;
        private String protocolo;

        public Builder(int id) {
            this.id = id;
        }

        public Builder cpfPaciente(String cpfPaciente) {
            this.cpfPaciente = cpfPaciente;
            return this;
        }

        public Builder especialidade(int especialidade) {
            this.especialidade = especialidade;
            return this;
        }

        public Builder dataConsulta(LocalDate dataConsulta) {
            this.dataConsulta = dataConsulta;
            return this;
        }

        public Builder horario(LocalTime horario) {
            this.horario = horario;
            return this;
        }

        public Builder protocolo(String protocolo) {
            this.protocolo = protocolo;
            return this;
        }

        public Consulta build() {
            return new Consulta(this);
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

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}


}
