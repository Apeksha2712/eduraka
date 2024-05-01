package edurekaObjectOriented;

class Teacher {
	String designation="Teacher";
	String collegeName="Edureka";
	
	void does() {
		System.out.println("Teaching");
	}

}
class SingleInheritance extends Teacher{
	String student="learner";
	public static void main(String[] args){
		SingleInheritance stu=new SingleInheritance();
	System.out.println(stu.designation);
	System.out.println(stu.collegeName);
	System.out.println(stu.student);
	stu.does();
}
}