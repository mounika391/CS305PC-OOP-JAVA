package Student;
class Student extends Person{
	private String id, name, branch,password;
	Student(String n){
	super(n);
	this.name = n;
	}
	public void getID(String id){
	this.id = id;
	}
	public void getBranch(String branch){
	this.branch = branch;
	}
	public void getPassword(String password){
	this.password = password;
	}
	@Override
	public String getDetails(){
		return (id+","+name+","+branch+","+password);
	}
}

