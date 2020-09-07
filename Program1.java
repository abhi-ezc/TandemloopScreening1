import java.io.*;
public class Program1
{
	public static void main(String[] args) throws IOException {
		double a,b,result=0;
        String c;
        System.out.println("Input>");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        str=br.readLine().split(" ");
        a=Double.parseDouble(str[0]);
        b=Double.parseDouble(str[1]);
        c=str[2];
        
        if(c.equals("+"))
        {
            result=a+b;
        }
        else if(c.equals("-"))
        {
            result=a-b;
        }
        else if(c.equals("*"))
        {
            result=a*b;
        }
        else if(c.equals("/"))
        {
            result=a/b;
        }
        else
        {
        }
        System.out.println(result);

	}
}