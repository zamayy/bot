import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String word1 = sc1.nextLine();
        while (!word1.equalsIgnoreCase("Привет")){
            System.out.println("Не понял.");
            word1 = sc1.nextLine();
        }{
            System.out.println("Привет!");
        }
        String word2 = sc2.nextLine();
        while (!word2.equalsIgnoreCase("Как дела?")){
            System.out.println("Не понял.");
            word2 = sc2.nextLine();
        }{
            System.out.println("Хорошо");
        }
        String word3 = sc3.nextLine();
        while (!word3.equalsIgnoreCase("Пока")){
            System.out.println("Не понял.");
            word3 = sc3.nextLine();
        }{
            System.out.println("До встречи!");
        }
    }
}




