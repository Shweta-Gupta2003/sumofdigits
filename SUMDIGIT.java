import java.util.*;
class SumD
{
int SumofDigits()
{
int i;
char a[]={'0','1','2','3','4','5','6','7','8','1'};
int sum=0;
for(i=0;i<10;i++)
{
int r=a[i]-'0';
System.out.print(r+" ");
sum=sum+r;
}
System.out.println();
return(sum);
}
}

class SUMDIGIT
{
public static void main(String args[])
{
SumD s=new SumD();
System.out.println("Sum of digits are "+s.SumofDigits());
}
}
