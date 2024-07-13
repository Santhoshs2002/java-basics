public class LeapYear{
public static void main(String[] args){
int year = 2024;
if(year%400==0){
System.out.println("IT IS LEAP YEAR");
}else if(year%4==0 && year%100!=0){
System.out.println("IT IS A LEAP YEAR");
}else{
System.out.println("IT IS NOT A LEAP YEAR");
}
}
}
