import java.util.Scanner;
class Temperature{
      public static void main(String[] args)
	  {
	     Scanner sc=new Scanner(System.in);
		 int city_temp[][]=new int[2][6];
		 int sum_temp[]=new int[2];
		 for(int i=0;i<city_temp.length;i++)
		 {
			System.out.println("enter city "+(i+1)+" daily temperature in celcius");
		    for(int j=0;j<city_temp[i].length;j++)
			{
				System.out.println("enter day-"+(j+1)+"temperature");
			    city_temp[i][j]=sc.nextInt();
			}
		 }
		 for(int i=0;i<city_temp.length;i++)
		 {
		    for(int j=0;j<city_temp[i].length;j++)
			{
			    sum_temp[i]+=city_temp[i][j];
			}
		 }
		 for(int i=0;i<sum_temp.length;i++)
		 {
		    System.out.println("weekly temperature of city "+(i+1)+" is "+(sum_temp[i]/6)+" degree celcius");
		 }
		 
	   }
}