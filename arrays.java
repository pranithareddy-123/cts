class Mat
{

public static void main(String args[])
{
int mat1[][]={{1,2},{3,5}};
int mat2[][]={{2,6},{5,7}};
int i,j,k;
int res[][]=new int[2][2];
for(i=0;i<mat1.length;i++)
{
for(j=0;j<mat2.length;j++)
{
res[i][j]=0;

for(k=0;k<res.length;k++)
{
res[i][j]+=mat1[i][k]*mat2[k][j];
}
}
System.out.print(res[i][j]);
System.out.println();
}
}
}