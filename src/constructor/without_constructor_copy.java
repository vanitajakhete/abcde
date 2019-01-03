package constructor;

public class without_constructor_copy {
int id;
String name;
without_constructor_copy(int i,String n)
{
	id=i;
	name=n;
	
}

without_constructor_copy()
{
	
}

void display()
{
	System.out.println(id+""+name);
}

public static void main(String args[])
{
	without_constructor_copy w= new without_constructor_copy(1,"vanita");
	without_constructor_copy w1= new without_constructor_copy();
	w1.id=w.id;
	w1.name=w.name;
	w.display();
	w1.display();
}
}
