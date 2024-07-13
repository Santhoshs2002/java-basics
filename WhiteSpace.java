public class WhiteSpace{
public static void main(String[] args){
String whiteSpace[] = {"","","","","g"};
int count = 0;
for(int index=0 ; index<whiteSpace.length ; index++){
if(whiteSpace[index]==""){
count++;
}
}
System.out.println("COUNT OF WHITE SPACE :"+count);
}
}