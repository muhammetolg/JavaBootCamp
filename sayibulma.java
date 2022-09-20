public class sayibulma {
   
	public static void main(String[] args) {
		  Scanner girdi=new Scanner(System.in);
	int aranacak;
	aranacak = girdi.nextInt();
		int[]sayilar=new int[] {1,2,5,7,9,0,8,6,3,4};
	
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur.");
		}else {
			System.out.println("Sayi mevcut değildir.");
		}
		
	} 
}
