import java.util.*;
public class U_c_one{
public void present_or_absent(){
Random r1=new Random();
int attendance=r1.nextInt(2);
if(attendance==1){
System.out.println("Employee is present");
}
else
System.out.println("Employee is absent");
}
public static void main(String[] args)
{
System.out.println("welcome to employee wage computation program");
U_c_one uc1=new U_c_one();
uc1.present_or_absent();
}
}