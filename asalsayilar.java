public 	public static void main(String[] args) {
    Scanner girdi=new Scanner(System.in);
	int number;
	number = girdi.nextInt();
    boolean isPrime=true;
    
    if(number==1) {
        System.out.println("asal deðildir!");
        return;
    }
    if(number<1) {
        System.out.println("asal deðildir.");
        return;
        
    }
    for(int i=2;i<number;i++) {
        if(number%i==0) {
            isPrime=false;
        }if (isPrime==true){
            System.out.println("asaldir");
        }else {
            System.out.println("asal değildir");
    }
}
} {
    
}