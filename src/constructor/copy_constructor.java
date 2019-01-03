package constructor;

public class copy_constructor {
int id;
String name;

copy_constructor(int i,String n)
{
	id=i;
	name=n;
	
}

copy_constructor(copy_constructor c)
{
	id=c.id;
	name=c.name;
}

void display()
{
	System.out.println(id+""+name);
}

public static void main(String args[])
{
	copy_constructor c= new copy_constructor(1,"vanita");
	copy_constructor c1= new copy_constructor(c);
	c.display();
	c1.display();
}
}
