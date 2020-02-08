import java.util.*;
abstract class Sweets{
	protected int wt;
	public Sweets(int wt)
	{
		this.wt=wt;
	}
	abstract void show();
}

class Soanpapdi extends Sweets{
	public Soanpapdi(int wt)
	{
		super(wt);
	}
	void show()
	{
		System.out.println("Weight of Soanpapdi:"+wt+"grams");
	}
}

class Mysorepak extends Sweets{
	public Mysorepak(int wt)
	{
		super(wt);
	}
	void show()
	{
		System.out.println("Weight of Mysorepak:"+wt+"grams");
	}
}

abstract class Candy{
	protected int wt;
	public Candy(int wt)
	{
		this.wt=wt;
	}
	abstract void show();
}

class Jelly extends Candy{
	public Jelly(int wt)
	{
		super(wt);
	}
	void show()
	{
		System.out.println("Weight of Jelly:"+wt+"grams");
	}
}

class Nutties extends Candy{
	public Nutties(int wt)
	{
		super(wt);
	}
	void show()
	{
		System.out.println("Weight of Nutties:"+wt+"grams");
	}
}


public class NewGift {

	public static void main(String[] args) {
		int s,m,j,n,p,x,i,sum=0;
		System.out.print("Enter the number of Soanpapdi required:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		ArrayList<Sweets> list=new ArrayList<Sweets>();
		System.out.println("Enter the Weights of Soanpapdi:");
		for(i=0;i<s;i++)
		{
			x=sc.nextInt();
			sum=sum+x;
			Sweets sw=new Soanpapdi(x);
			sw.show();
			list.add(sw);
		}
		System.out.println("Total Weight of Soanpapdi:"+sum);
		sum=0;
		System.out.print("Enter the number of Mysorepak required:");
		m=sc.nextInt();
		ArrayList<Sweets> list1=new ArrayList<Sweets>();
		System.out.println("Enter the Weights of Mysorepak:");
		for(i=0;i<m;i++)
		{
			x=sc.nextInt();
			sum=sum+x;
			Sweets myp=new Mysorepak(x);
			myp.show();
			list1.add(myp);
		}
		System.out.println("Total Weight of Mysorepak:"+sum);
		sum=0;
		System.out.print("Enter the number of Jelly required:");
		j=sc.nextInt();
		ArrayList<Candy> list2=new ArrayList<Candy>();
		System.out.println("Enter the Weights of Jellies:");
		for(i=0;i<j;i++)
		{
			x=sc.nextInt();
			sum=sum+x;
			Candy cad=new Jelly(x);
			cad.show();
			list2.add(cad);
		}
		System.out.println("Total Weight of Jelly:"+sum);
		sum=0;
		System.out.print("Enter the number of Nutties required:");
		n=sc.nextInt();
		ArrayList<Candy> list3=new ArrayList<Candy>();
		System.out.println("Enter the Weights of Nutties:");
		for(i=0;i<n;i++)
		{
			x=sc.nextInt();
			sum=sum+x;
			Candy nut=new Nutties(x);
			nut.show();
			list3.add(nut);
		}
		System.out.println("Total Weight of Nutties:"+sum);
		sum=0;
		Collections.sort(list2,new Comparator<Candy>()
		{
			public int compare(Candy c1,Candy c2)
			{
				return Integer.valueOf(c1.wt).compareTo(c2.wt);
			}
		});
		System.out.println("The Ascending Order of Jelly:-");
	
		for(i=0;i<list2.size();i++)
			System.out.println("Order : "+list2.get(i).wt);
		
		Collections.sort(list3,new Comparator<Candy>()
		{
			public int compare(Candy c1,Candy c2)
			{
				return Integer.valueOf(c1.wt).compareTo(c2.wt);
			}
		});
		System.out.println("The Ascending Order of Nutties:-");
	
		for(i=0;i<list3.size();i++)
			System.out.println("Order : "+list3.get(i).wt);
		

	}

}