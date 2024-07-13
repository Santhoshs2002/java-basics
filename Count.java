public class Count{
public static void main(String[] args){
	int count = 0;
	//declare
	int even =0;
	int odd=0;
for(int i=1;i<=50;i++){
	if (i%2==0){
		
		even++;
	}else{
		odd++;
	}
}
System.out.println("TOTAL COUNT :"+even);
System.out.println("TOTAL COUNT :"+odd);
}
}
