class Welcome
{	
	public void display()
	{
 		System.out.print("Welcome to Delloite");							System.out.println("\nWelcome to ITPL");
	}
	public void accept()
	{
		System.out.println("Welcome in accpet");
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to MAIN");
		Welcome w=new Welcome();
		w.display();
		w.accept();
		Bye b=new Bye();
		b.sayBye();
	}
}