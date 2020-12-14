
public class MainCone {

	public static void main(String[] args) {
		Cone c = new Cone();
		c.setH(8);
		c.setR(6);
		c.setTipoT(1);
		System.out.println(c);
		
		Cone c2 = new Cone(8,6,1);
		System.out.println(c2);
		
		Cone c3 = new Cone(8,6);
		c3.setTipoT(1);
		System.out.println(c3);
		
		Cone c4 = new Cone(8);
		c4.setR(6);
		c4.setTipoT(1);
		System.out.println(c4);
	}

}
