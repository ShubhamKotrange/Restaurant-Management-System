import java.util.*;
class  Restaurant
{
	static String username;
	static String pass;
	static String phone;
	static ArrayList<String> cart=new ArrayList<>();
	static double bill;
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		for(; ;)
		{
			System.out.println();
			System.out.println("        *****Welcome to Taj*****");
			System.out.println();
			System.out.println("1. Sign up");
			System.out.println("2. sign In");
			System.out.println();
			System.out.print("Enter an Option:");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:createAccount(sc);break;
				case 2:login(sc);break;
				default:System.out.println("Wrong option Entered");
			}
		}
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println();
		System.out.print("Create Account");
		System.out.println();
		System.out.print("Username :");
		sc.nextLine();
		username=sc.nextLine();
		System.out.print("Password : ");
		pass=sc.next();
		System.out.print("Contact Number: ");
		phone=sc.next();
		System.out.println();
		System.out.println("Account Created ");
		System.out.println();
	}

	public static void login(Scanner sc)
	{
		if(username!=null)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(" ");
				System.out.println("Login Page ");
				System.out.println();
				System.out.print("Username/Contact :");
				sc.nextLine();
				String un1=sc.nextLine();
				System.out.print("Password :");
				String pass1=sc.next();

				if((un1.equals(username))||(un1.equals(phone)) && (pass1.equals(pass)))
				{
					homepage(sc);
				}
				else{
					System.out.println();
					System.out.println("Wrong Cred Entered");
					System.out.println();
				}
			}
			System.exit(0);
		}
		else{
			System.out.println("Create your Account First");
		}
	}
	public static void homepage(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("Home Page");
			System.out.println();
			System.out.println("1. VEG MENU");
			System.out.println("2. NON-VEG MENU");
			System.out.println("3. CHECKOUT");
			System.out.println("4. LOGOUT");
			System.out.println();
			System.out.print("Enter an option");
			int option=sc.nextInt();
			switch(option)
			{
				case 1: vegMenu(sc);break;
				case 2: nonvegMenu(sc);break;
				case 3: checkout(sc);break;
				case 4: System.exit(0);
					System.out.println("THANK YOU NEVER VISIT AGAIN");break;
				default: System.out.println("Wrong Option");break; 
			}
		}
	}
	public static void vegMenu(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("VEG DISHES");
			System.out.println("101. Paneer Tikka : 200");
			System.out.println("102. Paneer Butter Masala : 400");
			System.out.println("103. Dal Tadka : 150");
			System.out.println("104. Veg Marath : 350");
			System.out.println("105. Veg Biryani : 400");
			System.out.println("106. MENU");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id=sc.nextInt();
			switch(id)
			{
				case 101: cart.add("Paneer Tikka : 200");
					bill+=200;
					System.out.println("Paneer Tikka added inside the cart");break;
				case 102: cart.add("Paneer Butter Masala : 400");
					bill+=400;
					System.out.println("Paneer Butter masala added inside the cart");break;
				case 103: cart.add("Dal Tadka : 150");
					bill+=150;
					System.out.println("Dal Tadka added inside the cart");break;
				case 104: cart.add("Veg Maratha : 350");
					bill+=350;
					System.out.println("Veg maratha added inside the cart");break;
				case 105: cart.add("Veg Biryani : 200");
					bill+=200;
					System.out.println("Veg Biryani added inside the cart");break;
				case 106: return;
				default: System.out.println("Wrong Dish id");break;

			}

		}
	}
	public static void nonvegMenu(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("NON-VEG DISHES");
			System.out.println("107. Chicken Tikka : 200");
			System.out.println("108. Chicken Savji : 400");
			System.out.println("109. Chicken Biryani : 150");
			System.out.println("110. Mutton Biryani : 350");
			System.out.println("111. Checken Curry : 400");
			System.out.println("106. MENU");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id=sc.nextInt();
			switch(id)
			{
				case 107: cart.add("Chicken Tikka : 200");
					bill+=200;
					System.out.println("Chicken Tikka added inside the cart");break;
				case 108: cart.add("Chicken Savaji : 400");
					bill+=400;
					System.out.println("Chicken Savaji masala added inside the cart");break;
				case 109: cart.add("Chicken Biryani : 150");
					bill+=150;
					System.out.println("Chicken Biryani added inside the cart");break;
				case 110: cart.add("Mutton biryani : 350");
					bill+=350;
					System.out.println("Mutton biryani added inside the cart");break;
				case 111: cart.add("Chicken Curyy : 200");
					bill+=200;
					System.out.println("Checkn Curry added inside the cart");break;
				case 106: return;
				default: System.out.println("Wrong Dish id");break;

			}
			
		}
	}
	public static void cart(Scanner sc)
	{
		System.out.println("YOUR PURCHASED FOOD");
		System.out.println();
		for(String food :cart)
		{
			System.out.println(food);
		}
		System.out.println();
		System.out.println("Your total Bill is:" +bill +"rs");
		System.out.println();
	}
	public static void checkout(Scanner sc)
	{
		System.out.println("CHECKOUT TOMO");
		cart(sc);
	}

}