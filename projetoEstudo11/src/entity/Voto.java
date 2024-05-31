package entity;

public class Voto {

	public Double getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(Double totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	private Double votosNullos;
	private Double votosValidos;
	private Double votosBracos;
	private Double totalEleitores;
	
	public Voto() {
		// TODO Auto-generated constructor stub
	}

	public Voto(Double votosNullos, Double votosValidos, Double votosBracos, Double totalEleitores) {
		super();
		this.votosNullos = votosNullos;
		this.votosValidos = votosValidos;
		this.votosBracos = votosBracos;
		this.totalEleitores = totalEleitores;
	}

	@Override
	public String toString() {
		return "Voto [votosNullos=" + votosNullos + ", votosValidos=" + votosValidos + ", votosBracos=" + votosBracos
				+ ", totalElçeitors=" + totalEleitores + "]";
	}
	
	public Double getVotosNullos() {
		return votosNullos;
	}

	public void setVotosNullos(Double votosNullos) {
		this.votosNullos = votosNullos;
	}

	public Double getVotosValidos() {
		return votosValidos;
	}

	public void setVotosValidos(Double votosValidos) {
		this.votosValidos = votosValidos;
	}

	public Double getVotosBracos() {
		return votosBracos;
	}

	public void setVotosBracos(Double votosBracos) {
		this.votosBracos = votosBracos;
	}
}
