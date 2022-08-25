package abstraction;

public class AbstractionChild2 extends AbstractionChild1  {
	
	void SIP() {
		System.out.println("Prag Parikh");
	}
	public static void main(String[] args) {
		AbstractionChild2 okk = new AbstractionChild2();
		okk.buy();
		okk.sale();
		okk.IPO();
		okk.SIP();
	}

}
