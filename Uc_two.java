import java.util.*;
public class Uc_two{
public void Salary_per_day(){
int wage_per_hour = 20;
int full_day_working_hour = 8;
int part_timer_working_hour = 8;
int part_timer=0;
int full_timer=1;
int Salary_per_day=0;
int Salary_per_month=0;
Random r2=new Random();
int Salary=r2.nextInt(2);

switch(Salary){
case 1:
System.out.println("Full time employee");
Salary_per_day=wage_per_hour*full_day_working_hour;
Salary_per_month=Salary_per_day*20;
System.out.println("Full time employee salary per day : "+Salary_per_day);
System.out.println("Full time employee salary per month : "+Salary_per_month);
break;
case 2:
System.out.println("part time employee");
Salary_per_day=wage_per_hour*part_timer_working_hour;
Salary_per_month=Salary_per_day*20;
System.out.println("part time employee salary per day : "+Salary_per_day);
System.out.println("part time employee salary per month : "+Salary_per_month);
break;
default:
System.out.println("not working");
}
}

public static void main(String[] args)
{
Uc_two uc2=new Uc_two();
uc2.Salary_per_day();

}
}