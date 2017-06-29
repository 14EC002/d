import java.io.*;

import java.util.*;

class sum2{
public static void main(String[] args){
int sum=0;

for(int i=1;i<=15;i++)
{
sum=sum+i;
}
System.out.println(sum);

for (int j=15;j<=45;j++)
{
if(j%2==1)
{
System.out.println(j);
}
}
}
}
