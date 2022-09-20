public class kalinincesesliharfler {
    
	public static void main(String[] args) {
		  Scanner girdi=new Scanner(System.in);
	char harf;
	char = girdi.nextLine();
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin harf");
			break;
			default:
				System.out.println("ince harf");
		}

	}
}
