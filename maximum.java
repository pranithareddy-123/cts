class Max
{
public static void main(String args[])
{
int arr[]={15,36,3,145};
int min=arr[0],max=0;

for( int i=0;i<arr.length;i++)
{
if(min > arr[i])
{
min=arr[i];
}
if(max < arr[i])
{
max=arr[i];
}
}
System.out.println(max);
System.out.println(min);
}

}

