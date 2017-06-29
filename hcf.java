import java.io.*;

import java.util.*;

class hcf{
public static void main(String[] args){
int n1,n2,h=1,n;
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
System.out.println(h);
}
}
