interface Grade
{
void avg(double e,double m,double h,double s,double sc);
}

class Student implements Grade
{
public void avg(double e,double m,double h,double s,double sc)
{
 double sum = e+m+h+s+sc;
 double aver = sum/5;
if(aver>60)
{
if(aver>70)
{
if(aver>80)
{
aver = aver+2;
}
}
else
{
aver = aver+1;
}
}
else
{
aver = aver +0.8;
}
System.out.println("The Percentage is "+aver);
}
public static void main(String ar[])
{
Student s = new Student();
s.avg(81,81,81,81,81);
}
}