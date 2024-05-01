package edurekaObjectOriented;





class one {
	public void print_edureka() {
		System.out.println("edureka");
	}
}
	class two extends one{
		public void print_happy() {
			System.out.println("happy");
		}
	}
	class three extends two{
          public void print_learing() {
			System.out.println("learning");
		}
	}
	

 class MultiLevelInheritance {
public static void main(String[] args) {
	three th=new three();
	th.print_edureka();
	th.print_happy();
	th.print_learing();
}
}
