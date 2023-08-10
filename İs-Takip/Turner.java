public class Turner {
    public  void turner(String[] dizi1 , String [] dizi2){
        for (int i=0;i<dizi1.length;i++)
        {
            if (i ==0) dizi2[0] = dizi1[dizi2.length-1];
            else dizi2[i] = dizi1[i-1];
        }
        for(int i = 0; i<dizi1.length;i++) dizi1[i] = dizi2[i];
    
    }
}
