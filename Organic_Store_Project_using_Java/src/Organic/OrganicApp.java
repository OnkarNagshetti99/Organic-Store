
package Organic;

import java.util.Scanner;

public class OrganicApp {
	

	String name;
	
	OrganicApp(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public OrganicApp() {} // Constructor
	
	Scanner sc = new Scanner (System.in);

	OrganicApp [] f = new OrganicApp[6];
	OrganicApp [] v = new OrganicApp[6];

	int bill = 0;int kgs;  int Total; 

	static void addMenu()
	 {
   	   String m [] ={"1.Fruits ", "2.Vegetables","3.Cosmatics","4.Masala Powders"};
   	  for (int i = 0; i < m.length; i++) 
   	  {
			System.out.println(m[i]);
		 } 
	 }
	
	 public void addFruits()
     {
    	 
        f[0] = new OrganicApp("125 ----Mangoes 1 kg is 50") ;
        f[1] = new OrganicApp("126 ----Apples 1 kg is 100");
        f[2] = new OrganicApp ("127 ----Bananas 1 kg is 25");
        f[3] = new OrganicApp("128 ----Papaya 1 kg is 44");
        f[4] = new OrganicApp ("129 ----Grapes 1 kg is 60");
        f[5] = new OrganicApp("130 ----Oranges 1 kg is 50");
     
		 for (int i = 0; i < f.length; i++)
	     {
				System.out.println(f[i]);
		 }   
     
	 System.out.println("Please choose your product code :");
	 int code = sc.nextInt();



	        switch (code)
		   {
		      case 125:
		      {
		    	  System.out.println("Mangoes is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*50);
		    	  
		    	  
			     break;
			  }
		      case 126:
		      {
		    	  System.out.println("Apples is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*100);
			     break;
			  }
		      case 127:
		      {
		    	  System.out.println("Bananas is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*25);
			     break;
			  }
		      case 128:
		      {
		    	  System.out.println("Papaya is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*44);
			     break;
			  }
		      case 129:
		      {
		    	  System.out.println("Grapes is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*60);
			     break;
			  }
		      case 130:
		      {
		    	  System.out.println("Oranges is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*50);
			     break;
			  }

		      case 2:
		      {

		    	  return;
		      }
	    }
             Total+=bill;
}
	 public void addVegetable()
     {
    	 
    	 
    	 
    	  v[0]= new OrganicApp ("225 ----Potato 1 kg is 41");
    	  v[1]= new OrganicApp("226 ----Brinjal 1 kg is 35");
    	  v[2]= new OrganicApp("227 ----Carrots 1 kg is 60");
    	  v[3]= new OrganicApp("228 ----Beetroot 1 kg is 44");
    	  v[4]= new OrganicApp("229 ----Drumstick 1 kg is 60");
    	  v[5]= new OrganicApp("230 ----Mushroom 1 kg is 50");
          
    	  for (int i = 0; i < v.length; i++)
    	  {
			System.out.println(v[i]);
		  }
    	 
    	 System.out.println("Please choice your product code :");
    	 int code = sc.nextInt();
    	 
    	 
    	 switch (code)
		   {
		      case 225:
		      {
		    	  System.out.println("Potato is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*41);
		    	  
		    	  
			     break;
			  }
		      case 226:
		      {
		    	  System.out.println("Brinjal is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*35);
			     break;
			  }
		      case 227:
		      {
		    	  System.out.println("Carrots is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*60);
			     break;
			  }
		      case 228:
		      {
		    	  System.out.println("Beetroot is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*44);
			     break;
			  }
		      case 229:
		      {
		    	  System.out.println("Drumstick is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*60);
			     break;
			  }
		      case 230:
		      {
		    	  System.out.println("Mushroom is good choice how many kgs you need?");
		    	  kgs=sc.nextInt();
		    	   bill = (kgs*50);
			     break;
			  }
		      
		   }
         Total += bill;
         
     	 
     }
       
     
     


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		OrganicApp a = new OrganicApp();

		System.out.println("=======================Welcome to Organic Store========================");
		System.out.println("The available products in the Store are");

		OrganicApp.addMenu();

		System.out.println("Please enter Your Choice ?");
		System.out.println("--------------------------------");
		System.out.println("1   =====> enter");
		System.out.println("--------------------------------");

		int choice;

		for (;;) 
		{
			choice = sc.nextInt();
			if (choice == 1)
			{
				a.addFruits();

				System.out.println("If you ant to continue with the Shopping then press 1 ======>"
						+ "Display All the products once again");
				System.out.println("If you want exit press 2=======>");
				choice = sc.nextInt();
				if (choice == 1) 
				{

					a.addMenu();
				}

				else if (choice == 2) 
				{
					System.out.println("==================================================");
					System.out.println("========================");
					System.out.println("========Welcome to Organic Store ========");
					System.out.println("Total bill of your purchased item is : " + a.Total);
					if (a.Total > 500) {
						int dis = ((a.Total * 5) / 100);
						int Final = a.Total - dis;
						System.out.println("you recived a discout of 5% : " + dis);
						System.out.println("Final bill is :" + Final);
						System.out.println("=========Thank you so much for shopping you saved " + dis + "rs=====");
                        System.out.println("===============JAVA IS AWESOME===========");

					}
					break;
				}

			}

			if (choice == 2)
			{
				a.addVegetable();

				System.out.println("If you ant to continue with the Shopping then press 1 ======>"
						+ "Display All the products once again");
				System.out.println("If you want exit press 2=======>");
				
				choice = sc.nextInt();
				if (choice == 1)
				{

					a.addMenu();
				}

				else if (choice == 2) 
				{
					System.out.println("==================================================");
					System.out.println("========================");
					System.out.println("========Welcome to Organic Store ========");
					System.out.println("Total bill of your purchased item is : " + a.Total);
					if (a.Total > 500) 
					{
						int dis = ((a.Total * 5) / 100);
						int Final = a.Total - dis;
						System.out.println("you recived a discout of 5% : " + dis);
						System.out.println("Final bill is :" + Final);

						System.out.println("=========Thank you so much for shopping you saved " + dis + "rs=====");
                        System.out.println("===============JAVA IS AWESOME===========");

					}

				}

			}
		}

	}

}
