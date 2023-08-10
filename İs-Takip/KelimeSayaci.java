import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KelimeSayaci {
    public static void main(String[] args) {
        String dosyaYolu = "workCount.txt";
        String aString = "Arda";
        String bString = "Buse";
        String cString = "Canan";
        String dString = "Derya";
        String eString = "Elif";
        String fString = "Firdevs";

        int asayac = 0;
    

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Datas.txt"))) {
        FileWriter fileWriter = new  FileWriter(dosyaYolu,true);
            String satir;
        
            while ((satir = bufferedReader.readLine()) != null) {
                String[] kelimeler = satir.split(" ");
                for (String kelime : kelimeler) {
                    if (kelime.equalsIgnoreCase(aString)||kelime.equalsIgnoreCase(bString)||kelime.equalsIgnoreCase(cString)||kelime.equalsIgnoreCase(dString)||kelime.equalsIgnoreCase(eString)||kelime.equalsIgnoreCase(fString)) {
                        asayac++;
                        
                    }
                }
            }
            System.out.println("Dosyada '" + aString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            System.out.println("Dosyada '" + bString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            System.out.println("Dosyada '" + cString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            System.out.println("Dosyada '" + dString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            System.out.println("Dosyada '" + eString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            System.out.println("Dosyada '" + fString + "' kelimesi " + asayac/6 + " kez kullanıldı.");
            fileWriter.write("\n\n ÇALIŞMA AKIŞ PROGRAMI \n"+aString+": "+asayac/6+"\n"+bString+" : "+asayac/6+"\n"+cString+" : "+asayac/6+"\n"+dString+": "+asayac/6+"\n"+eString+" : "+asayac/6+"\n"+fString+" : "+asayac/6);
            fileWriter.write("\n-----------------------------------");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
