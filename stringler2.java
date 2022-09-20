public public static void String2Odev15() {
    String mesaj = "Bugun cok guzel.";
    System.out.println(mesaj);

    String mesaj = "Bugün çok güzel.";
    System.out.println(mesaj);

  

    String yeniMesaj = mesaj.replace(' ','_');
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(1,3));

    for (String kelime : mesaj.split(" ")){
        System.out.println(kelime);
    }

    System.out.println(mesaj.toLowerCase());
    System.out.println(mesaj.toUpperCase());
    System.out.println(mesaj.trim());
}
}
} {
    
}
