public class sayilar {
    public static void main(String[] args) {
		int number=5;
		int total=0;
		
		for(int i=1;i<number;i++){
			if(number%i==0) {
				total=total+i;
				
			}
		
		}
		if(total==number) {
			System.out.println("Mükemmeldir");
			
		}else {
			System.out.println("Mükemmel değildir.");
		}
		}
}
