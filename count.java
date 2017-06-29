import java.io.*;

import java.util.*;

class count{
public static void main(String[] args){
int n[]=new int[5];
int sum=0;
for(int i=0;i<=4;i++)
{
Scanner in=new Scanner(System.in);
n[i]=in.nextInt();
}
for (int j=4;j>=0;j--)
{
sum++;
}
System.out.println(sum);
}
}
