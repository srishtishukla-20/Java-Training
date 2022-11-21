package polymorphismExample;

public class runtimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new SBI();
		System.out.println(b.getRateOfInterest());
		bank b1=new ICICI();
		System.out.println(b1.getRateOfInterest());
		bank b2=new AxisBank();
		System.out.println(b2.getRateOfInterest());

	}

}
