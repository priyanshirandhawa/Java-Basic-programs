import java.lang.scanner;
piblic class electric bill
{
  string name;
  int unit;
  double bill;
public void accept()
{
 scanner sc =new scanner(system.in);
 system.out.println("enter the customer name");
 name= obj.next line();
 system.out.println("enter the consume unit");
 units= sc.next int();
}
public void calculate()
{
 if (units<=100)
{
bill=units*2;
}
else if(units>=100 && units<=300)
{
bill=200 +(unit-100)*3;
}
else if(units>300)
{
bill=100*2/200 +200*3/600 +(units-300)*5;
bill=bill +bill*0.025;
}
public void print()
{
system.out.println("name of customer:"+n);
system.out.println("number of units consumed":+units);
system.out.println("bill amount":+bill);
}
public static void main()
{
electric bill obj= new electric bill();
 obj.accept();
 obj.calculate();
 obj.print();
}
 
