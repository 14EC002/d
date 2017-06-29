import java.io.*;

import java.util.*;

class gcd{
public static void main(String[] args){
int n1,n2,h=1,n;
Scanner in=new Scanner(System.in);
n1=in.nextInt();
Scanner s=new Scanner(System.in);
n2=s.nextInt();
while(n1!=n2)
{
if(n1>n2)
{
n1=n1-n2;
}
else
{
n2=n2-n1;
}
}
System.out.println(n1);
}
}
