import java.io.*;
class add
{
public static void main(string args)throwsIOException
{
int a,b,sum;
BufferedReader br=new BufferReader(new InputStreamReader(System.in));
System.out.println("Enter the First Number:");
a=Integer parseInt(br.readLine());
System.out.println("Enter the Second Number:");
b=Integer parseInt(br.readLine());
c=a+b;
system.out.println("Addition="+c);