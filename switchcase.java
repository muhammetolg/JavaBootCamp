public public static void main(String[] args) {
  Scanner girdi=new Scanner(System.in);
    char grade;
	grade = girdi.nextLine();
    switch(grade) {
    case 'A':
        System.out.println("Mükemmel:Geçtiniz");
        break;
    case 'B':
        System.out.println("Çok güzel:Geçtiniz");
        break;
    case 'C':
        System.out.println("İyi:Geçtiniz");
        break;
    case 'D':
        System.out.println("Fena:Değil");
        break;
    case 'F':
        System.out.println("Maalesef Kaldınız");
        break;
    default:
        System.out.println("Geçersiz Not girdiniz.");
        
        
        
        
        
    }

} {
    
}
