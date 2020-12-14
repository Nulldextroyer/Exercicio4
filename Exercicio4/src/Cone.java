
public class Cone {
	// declaraçoes 
	private float H;
	private float R;
	private int TipoT;
	
	//contrutores 
	public Cone(){
		
	}//vazio
	
	public Cone(float H, float R, int TipoT) {
		setH(H);
		setR(R);
		setTipoT(TipoT);
	}//3 leituras
	
	public Cone(float H, float R) {
		setH(H);
		setR(R);
	}//2 leituras
	
	public Cone(float H) {
		setH(H);
	}
	
	// get and set 
	public float getH() {
		return H;
	}
	public void setH(float h) {
		if(h > 0)
			this.H = h;
	}
	public float getR() {
		return R;
	}
	public void setR(float r) {
		if(r > 0)
			this.R = r;
	}
	public int getTipoT() {
		return TipoT;
	}
	public void setTipoT(int tipoT) {
		this.TipoT = tipoT;
	}
	
	//metodos
	
	public double Geratriz(){
		return Math.sqrt((H*H)+(R*R));
	}
	
	public double AreaF() {
		return 3.14*(R*R);
	}
	
	public double AreaL() {
		return 3.14*R*Geratriz();
	}
	
	public double AreaT() {
		return 3.14*R*(Geratriz()+R);
	}
	
	public double Litros() {
		return AreaT()/3.45;
	}
	
	public double LatasT() {
		return Math.ceil(Litros()/18);
	}
	
	public double Preco() {
		double valor;
		if(TipoT == 1) {
			valor = LatasT()*238.90;
		}else if(TipoT == 2) {
			valor = LatasT()*467.98;
		}else {
			valor = LatasT()*758.34;
		}
		return valor;
	}
	//toString 
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [H=");
		builder.append(H);
		builder.append(", R=");
		builder.append(R);
		builder.append(", TipoT=");
		builder.append(TipoT);
		builder.append(", Geratriz=");
		builder.append(Geratriz());
		builder.append(", AreaF=");
		builder.append(AreaF());
		builder.append(", AreaL=");
		builder.append(AreaL());
		builder.append(", Area=");
		builder.append(AreaT());
		builder.append(", Litros=");
		builder.append(Litros());
		builder.append(", LatasT=");
		builder.append(LatasT());
		builder.append(", Preco=");
		builder.append(Preco());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
