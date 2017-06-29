import java.io.*;

import java.util.*;

class primebetween{
public static void main(String[] args){
int n1,n2;
Scanner sh=new Scanner(System.in);
n1=sh.nextInt();
Scanner in=new Scanner(System.in);
n2=in.nextInt();
for (int i=n1;i<n2;i++)
{
if((i%2==0)||(i%3==0))
{
continue;
}
else
{
System.out.println(i);
}
}
}} 
