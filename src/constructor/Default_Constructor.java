package constructor;

public class Default_Constructor {
int id;
String name;

void display()
{
	System.out.println(id+" "+name);
}

public static void main(String[] args) {
	Default_Constructor d= new Default_Constructor();
    Default_Constructor d1= new Default_Constructor();
	d.display();
    d1.display();
}
}
