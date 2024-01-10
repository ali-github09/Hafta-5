import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnCokGecenKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        String[] kelimeler = metin.split("\\s+");


        Map<String, Integer> kelimeSayilari = new HashMap<>();

        for (String kelime : kelimeler) {

            kelimeSayilari.put(kelime, kelimeSayilari.getOrDefault(kelime, 0) + 1);
        }


        String enCokGecenKelime = null;
        int enCokGecenKelimeSayisi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > enCokGecenKelimeSayisi) {
                enCokGecenKelime = entry.getKey();
                enCokGecenKelimeSayisi = entry.getValue();
            }
        }


        if (enCokGecenKelime != null) {
            System.out.println("En çok geçen kelime: " + enCokGecenKelime);
            System.out.println("Bu kelimenin sayısı: " + enCokGecenKelimeSayisi);
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }
    }
}
