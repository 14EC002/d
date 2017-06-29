import java.io.*;

import java.util.*;

class lcm{
public static void main(String[] args){
int n1,n2,h=1,n,l=0;
Scanner in=new Scanner(System.in);
n1=in.nextInt();
Scanner s=new Scanner(System.in);
n2=s.nextInt();
n=n1*n2;
for (int i=2;i<n;i++)
{
if((n1%i==0)&&(n2%i==0))
{
h=i;
}}
l=n/h;
System.out.println(l);
}
}
