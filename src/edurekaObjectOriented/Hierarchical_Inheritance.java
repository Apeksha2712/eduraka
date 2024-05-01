package edurekaObjectOriented;

class One{
	public void print_edureka() {
		System.out.println("edureka");
	}
}
class Two extends One{
	public void print_happy() {
		System.out.println("Happy");
	}
}
class Three  extends One{
	public void print_learning() {
		System.out.println("learning");
	}
}
public class Hierarchical_Inheritance {
public static void main(String[] args) {
	Three th=new Three();
	th.print_learning();
	th.print_edureka();	
	
	Two tw=new Two();
	tw.print_happy();
	tw.print_edureka();	
		
	
	
}
}
