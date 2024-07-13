public class PrimeNumber{
public static void main(String[] args){
int count=0;
int number = 42;
if(number<2){
	System.out.println("ITS NOT A PRIME NUMBER");
}
for(int i=2; i<=number ; i++){
	if(number%i==0){
		count++;
	}
}
if(count<2){
	System.out.println("ITS A PRIME NUMBER");
}else{
		System.out.println("ITS NOT A PRIME NUMBER");

}

}
}