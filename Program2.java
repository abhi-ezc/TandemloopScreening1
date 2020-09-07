import java.io.*;
public class Program2
{
	public static void main(String[] args) throws IOException {
		
        System.out.println("Input>");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=1;
        for(int i=1;i<=n;i++)
        {
          if(count==1)
          {
              System.out.print(count);
          }
          else
          {
            System.out.print(","+count); 
          }
          count=count+2;
        }
	}
}