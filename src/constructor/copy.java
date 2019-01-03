package constructor;

public class copy {
	int id;
	String name;
	copy(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	copy(copy c)
	{
		id=c.id;
		name=c.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		copy c=new copy(1,"vanita");
		copy c1= new copy(c);
		c1.display();
		c.display();
	}
}
