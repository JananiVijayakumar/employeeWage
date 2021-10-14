import java.util.*;
public class Uc_five{
public void calculate_wage(){
int count=0;
int no_of_days=30;
for (int i=0; i<=no_of_days; i++){
Random r3=new Random();
int calculate_wage=r3.nextInt(2);
if(calculate_wage==1){
count++;
}
System.out.println("no of days :"+count);
int total_working_hrs=count*8;
if(count<20 || total_working_hrs<100){
int Salary_per_month=count*500;
System.out.println("no of days employee coming to work :"+count);
System.out.println("Salary per month depending on attendance:"+Salary_per_month);
}
else{
System.out.println("Employee is not attend the work");
}
}
}
public static void main(String[] args)
{
System.out.println("welcome to employee wage computation program");
Uc_five uc5=new Uc_five();
uc5.calculate_wage();
}
}