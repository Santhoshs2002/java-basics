public class Reverse{
public static void main(String[] args){
int number =987654321;
int reverse =0;
if(number!=0){
int reminder = number%10;
//System.out.println("REVERSE IS :"+reminder);
reverse = reverse*10 + reminder;
//System.out.println("REVERSE IS :"+reverse);

number = number/10;
//System.out.println("REVERSE IS :"+number);
}
System.out.println("REVERSE IS :"+reverse);
}
}