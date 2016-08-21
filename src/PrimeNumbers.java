
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers between 1 and 100:");
		for(int i=1;i<=100;i++)
		{
			int k=0;
			for(int j=2;j<10;j++)
			{
				if(i!=1 && i!=j)
				{
					if(i%j==0)
					{
						k=1;
					    break;
					}
					
				}
			}
			if(i!=1 && k==0)
			{
				System.out.println(i);
			}

	}
	}
}
