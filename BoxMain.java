class Box
{
int boxLength;
int boxWidth;
int boxHeight;
public Box()
{
int boxLength=0;
int boxWidth=0;
int boxHeight=0;
}
public Box(int boxLength, int boxWidth,int boxHeight)
{
this.boxLength=boxLength;
this.boxWidth=boxWidth;
this.boxHeight=boxHeight;
}
void setBox(int boxlength,int boxWidth,int boxHeight)
{
this.boxLength=boxLength;
this.boxWidth=boxWidth;
this.boxHeight=boxHeight;
}
void getBox()
{
System.out.println("" +boxLength+""+boxWidth+""+boxHeight);
}
void volume()
{
int volume=(boxLength*boxWidth*boxHeight);
System.out.println(volume);
}
}
class MainBox
{
public static void main(String args[])
{
Box b=new Box(2,4,5);
b.getBox();
b.volume();
}
}
