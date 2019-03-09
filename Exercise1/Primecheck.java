package Exercise1;

public class Primecheck {

	void prime(int a)
	{
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			flag=1;
		
		}
		switch(flag)
		{

		   case 1 :
			   System.out.println("Not Prime");
		      break; 
		   
		   case 0 :
		   System.out.println("Prime");
		 
		    
		}
	}
}
