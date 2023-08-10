import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();
        array.add(1);
        Turner turn=new Turner();
        String [] dizi1  = new String[]{"Arda","Buse","Canan","Derya","Elif","Firdevs"};
        String [] dizi2  = new String[dizi1.length];
        String [] gunler = new String[]{"Pazartesi" , "Salı" , "Çarşamba" , "Perşembe", "Cuma"};

        
       
        try
        {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("Datas.txt",true));
            int counter = 1;
            
            for(int j=0;j<dizi1.length;j++)
            {
               
                fileWriter.write("\n\n"+counter+". Hafta Çalışma Programı"+"\n");
                for (int i = 0; i <= dizi1.length-2; i++)
            {      
                    fileWriter.write(dizi1[i]+" : "+gunler[i] +": "+ "\n");
                      
            }
            fileWriter.write("Bu Hafta İziznli Kişi ==>"+dizi1[dizi1.length-1]); 
            turn.turner(dizi1, dizi2);
             counter++;
            }
            fileWriter.write("\n--------------------------------");
            fileWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("Dosyaya veri eklenirken bir hata oluştu: " + e.getMessage());
        }

        

    }
}
