import java.util.Scanner;
class marks{
      public static void main(String[] args)
	  {  
	     Scanner sc=new Scanner(System.in);
	     int m[][][]=new int[2][2][3];
		 int sum[][]=new int[2][2];
		 for(int i=0;i<m.length;i++)
		 {
			 System.out.println("dept "+(i+1));
			 for(int j=0;j<m[i].length;j++)
			 {
				System.out.println("student "+(j+1));
                for(int k=0;k<m[i][j].length;k++)
                {
                    System.out.println("mark "+(k+1)+":");
                    m[i][j][k]=sc.nextInt();
					sum[i][j]+=m[i][j][k];
				}
				System.out.println();
			 }
			 System.out.println();
		 }
		 System.out.println();
		for(int i=0;i<sum.length;i++)
		{
            System.out.println("dept "+(i+1));
            for	(int j=0;j<sum[i].length;j++)
			{
                System.out.println("student "+(j+1)+"total marks is "+sum[i][j]);
            }
        }			
		 
	  }
}