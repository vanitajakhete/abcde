package constructor;

public class Both_Constructor_Type_Mixing
{
	int id;
	Both_Constructor_Type_Mixing(int id)
	{
		super();
		this.id=id;
	}
	
	void display()
	{
		System.out.println(+id);
	}
	
	public static void main(String[] args) {
		Both_Constructor_Type_Mixing b= new Both_Constructor_Type_Mixing(10);
		b.display();
	}

}
