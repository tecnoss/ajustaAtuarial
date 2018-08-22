package consulta;

public class GuiaMedica {

	private String ccnumguia;
	private String pespmatr_08;
	private String pespmato_65;
	private String extra_01;
	
	public String getCcnumguia() {
		return ccnumguia;
	}
	public void setCcnumguia(String ccnumguia) {
		this.ccnumguia = ccnumguia;
	}
	public String getPespmatr_08() {
		return pespmatr_08;
	}
	public void setPespmatr_08(String pespmatr_08) {
		
		this.pespmatr_08 = String.format ("%8.8s", pespmatr_08);
	}
	public String getPespmato_65() {
		return pespmato_65;
	}
	public void setPespmato_65(String pespmato_65) {
		
		this.pespmato_65 = String.format ("%8.8s", pespmato_65);
	}
	public String getExtra_01() {
		return extra_01;
	}
	public void setExtra_01(String extra_01) {
		
		this.extra_01 = String.format ("%5.5s", extra_01.trim());
	}
	
	
	
}
