import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            System.out.print("Lütfen hangi dizi elemanını seçmek istediğinizi giriniz : ");

            try {
                int a = input.nextInt();
                System.out.println(arr[a]);
            } catch (Exception e) {
                System.out.println("Yanlış bir ifade girdiniz");
            }

            }
        }

