import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Welcome to the Application");
        String message = scanner.nextLine();

            switch (message){
                case "Hello":
                    System.out.println(" Hello How can i help?");
                    break;
                case "How are you":
                    System.out.println("i'm good what about you?");
                    break;
                default:
                    System.out.println("thanks for using the application, have a great Day");
            }
    }
}