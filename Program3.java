import java.io.*;
public class Program3
{
	public static void main(String[] args) throws IOException {
		
        System.out.println("Input>");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0 && i==n)
            {
                break;
            }
            System.out.print(count);
            count+=2;
        }
	}
}