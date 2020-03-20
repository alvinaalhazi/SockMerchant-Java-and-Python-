import java.util.Scanner;
import java.util.Arrays;
public class Program
{
	public static void main(String[] args) {
		int a;
int v,t=0;
Scanner input = new Scanner(System.in);
    a=input.nextInt();
    int b[] = new int[a];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < a; i++)
        {
            b[i] = input.nextInt();
        }
    int f[]=new int[a];
    v=-1;
    for(int i=0;i<a;i++)
    {
        int c=1;
        for(int j=i+1;j<a;j++)
        {
            if(b[i]==b[j])
            {
               c++;
               f[j]=v;
            }
           
        }
            if(f[i]!=v)
            {
                f[i]=c;
            }
    }
    for(int i = 0; i < f.length; i++){  
            if(f[i] != v )  
                t=t+f[i]/2;
}
System.out.print(t);
	}
}