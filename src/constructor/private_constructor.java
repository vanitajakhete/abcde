package constructor;

 class private1_const {
int id;
String name;
 private1_const(int id,String name)
{
	System.out.println("parametrised constuctor");	
	this.id=id;
	this.name=name;
}

 /*private*/ private1_const()
{
    this(1,"vanita");
	System.out.println("default constructor");
}
}
public class private_constructor
{
public static void main(String[] args) {
	private1_const p= new private1_const();
	System.out.println(p.id+" "+p.name);
}
}

