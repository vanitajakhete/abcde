package constructor;

public class without {
int id;
String name;
without(int id,String name)
{
	this.id=id;
	this.name=name;
}

without()
{
	
}

void display()
{
	System.out.println(id+" "+name);
}

public static void main(String[] args) {
	without w=new without(12,"pooja");
	without w1= new without();
	w1.id=w.id;
	w1.name=w.name;
	w.display();w1.display();
}
}
