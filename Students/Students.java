class Students{
	String name;
	int age;
	String location;
	
	void details(){
		System.out.println(name + " is " + age + " years old, from " + location);
	}
	
	public static void main(String[] args){
		Students student1 = new Students();
		student1.name = "Suraj";
		student1.age = 26;
		student1.location = "Dharwad";
		student1.details();
	
		Students student2 = new Students();
		student2.name = "Sanjay";
		student2.age = 25;
		student2.location = "Bangalore";
		student2.details();

		Students student3 = new Students();
		student3.name = "Namrata";
		student3.age = 24;
		student3.location = "Karwar";
		student3.details();
	}
}