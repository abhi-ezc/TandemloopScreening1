import java.io.*;
public class Program4
{
	public static void main(String[] args) throws IOException {
        System.out.println("Input>");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        str=br.readLine().split(",");
       for(int i=1;i<10;i++)
       {
           int count=0;
           for(int j=0;j<str.length;j++)
           {
            if(Integer.parseInt(str[j])%i==0 && Integer.parseInt(str[j])!=0)
            {
                count++;
            }
        }
        System.out.print(i+":"+count);
        if(i!=9)
        {
            System.out.print(",");
        }
       }
	}
}