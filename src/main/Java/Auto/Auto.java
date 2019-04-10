package Auto;

public class Auto {

	private Boolean estado;
	private int temp;
	private Double veloc;
	private Double combustible;
	private Integer capComb;

	public void encender() throws  CombustibleException{
		
		estado = true;
		temp = 70;
		combustible = combustible - combustible * 0.001;
		throw new CombustibleException();
		
	}

	void apagar() {

	}

	public void SetCombustible(Double i) {
		combustible = i;

	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public Double getVeloc() {
		return veloc;
	}

	public void setVeloc(Double veloc) {
		this.veloc = veloc;
	}

	public Double getCombustible() {
		return combustible;
	}

	public void setCombustible(Double combustible) {
		this.combustible = combustible;
	}

	public Integer getCapComb() {
		return capComb;
	}

	public void setCapComb(Integer capComb) {
		this.capComb = capComb;
	}

}
