class Sum
{
public static void main(String args[])
{
int sum=0,i,avg=1;
int arr[]={12,13,14,26};
for(i=0;i<=3;i++)
{
sum=sum+arr[i];
}
avg=sum/(arr.length);

System.out.println(sum);
System.out.println(avg);
}
}
