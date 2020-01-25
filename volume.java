class Volume
{
int l,w,h;
void setVolume(int l,int w,int h)
{
this.l=l;
this.w=w;
this.h=h;
}
void cal()
{
int res;
res=l*w*h;
System.out.println(res);
}
void getVolune()
{
System.out.println("the result is:");
cal();
}
public static void main(String args[])
{
Volume v=new Volume();
v.setVolume(4,3,4);
v.getVolume();
}
}
