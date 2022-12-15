import java.util.Scanner;
class Pronic{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
		int res=0;
        for(int i=1;i<num-1;i++)
        {
            if(i*(i+1)== num)
			{
			    res=1;
				break;
			}
        }
        if(res == 1)
		{
            System.out.println("The given number is pronic number");
        }
        else
		{
            System.out.println("The given number is not pronic number");
        }			
	 }
}