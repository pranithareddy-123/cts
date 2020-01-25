
class CubeRoot{
public static void main(String args[])
{
int i=0,num=0;
String primenumbers="";
String cuberoot="";
for(i=1;i<=100;i++)
     {
int counter=0;
for(num=i;num>=1;num--)
         {
if(i%num==0)
   {
counter=counter+1;
   }
          }
if(counter==2)
  {
primenumbers=primenumbers +i+ " ";
cuberoot=cuberoot+i*i*i+" ";
}
}

System.out.println("primenumbers from 1 t0 100 are");
System.out.println(primenumbers);
System.out.println(cuberoot);
  }
  }






