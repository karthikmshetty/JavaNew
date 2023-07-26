package naveen;

public class Task4 {

	//Arm Strong umber  
	public static void main(String[] args) 
	{
        
		int num=947;
		int temp=num,temp2=num;
		int count=0,prod=1,sum=0;
		int rem=0;
		
		while(num>0)
		{	num/=10;
			count++;
		}

		while(temp2>0)
		{
			int count1=count;
			rem=temp2%10;
		    while(count1>0)
			{
				prod=prod*rem;
				count1--;
			}
		 
		    sum+=prod;
		    prod=1;
		    temp2/=10;
		}
				  if(temp==sum)
				System.out.println("given number is armstrong number");
				  else
					  System.out.println("given number is not an amstrong number");
	}

}
