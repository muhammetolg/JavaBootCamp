public class stringler {
    
	public static void main(String[] args) {
		String mesaj="Bugün çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman s.: "+mesaj.length());
		System.out.println("3.Eleman: "+mesaj.charAt(2));
		System.out.println("Yabaysan!");
		System.out.println(mesaj.startsWith("g"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler=new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('s'));
		System.out.println(mesaj.lastIndexOf('z'));
		

	}

}

