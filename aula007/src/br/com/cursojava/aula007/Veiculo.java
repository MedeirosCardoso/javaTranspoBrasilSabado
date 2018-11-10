package br.com.cursojava.aula007;

public class Veiculo {

	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	{
		System.out.println("linha de bloco");
	}

	public Veiculo(Integer id) {
		this(); // faz uma chamada ao construtor sem argumento.
		this.id = id;
	}
	
	public Veiculo(){
		super(); // faz uma chamada ao construtor da classe pai, classe Object.
	}
	public Veiculo(String marca){
		this.marca = marca;
	}
	public static Veiculo build(String marca){
		return new Veiculo(marca);
	}
		public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
