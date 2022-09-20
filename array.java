
public class dizilerlebaslama{

    public static void main(String[] args) {
        String ogrenci1="Muhammet";
		String ogrenci2="Demir";
		String ogrenci3="Bugra";
		String ogrenci4="Arslan";
		
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		

		
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Muhammet";
		ogrenciler[1]="Demir";
		ogrenciler[2]="Bugra";
		ogrenciler[3]="Arslan";
		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
		}

		


	}


}