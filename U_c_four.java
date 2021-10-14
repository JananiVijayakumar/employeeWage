import java.util.*;
public class U_c_four{
public void Salary_per_day(){
int wage_per_hour = 20;
int FULL_TIMER_WORKING_HOUR = 8;
int PART_TIMER_WORKING_HOUR = 8;
int PART_TIMER=0;
int FULL_TIMER=1;
int SALARY_PER_DAY=0;
int SALARY_PER_MONTH=0;
Random r2=new Random();
int Salary=r2.nextInt(2);

switch(Salary){
case 1:
System.out.println("Full time employee");
SALARY_PER_DAY=wage_per_hour*FULL_TIMER_WORKING_HOUR;
SALARY_PER_MONTH=SALARY_PER_DAY*20;
System.out.println("Full time employee salary per day : "+SALARY_PER_DAY);
System.out.println("Full time employee salary per month : "+SALARY_PER_MONTH);
break;
case 2:
System.out.println("part time employee");
SALARY_PER_DAY=wage_per_hour*PART_TIMER_WORKING_HOUR;
SALARY_PER_MONTH=SALARY_PER_DAY*20;
System.out.println("part time employee salary per day : "+SALARY_PER_DAY);
System.out.println("part time employee salary per month : "+SALARY_PER_MONTH);
break;
default:
System.out.println("not working");
}
}
public static void main(String[] args)
{
System.out.println("welcome to employee wage computation program");
U_c_four uc4=new U_c_four();
uc4.Salary_per_day();
}
}