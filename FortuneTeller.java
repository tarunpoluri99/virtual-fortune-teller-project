import java.util.*;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Some crazy fortunes
        String[] fortunes = {
            "You will find a mysterious coin under your pillow tonight.",
            "Beware of squirrels… they know what you did last summer.",
            "Your socks will disappear in the washing machine, but return with secrets.",
            "A cat will stare at you for no reason. Take it seriously.",
            "You will receive good news, but it will be from a pigeon.",
            "Your future self will thank you for eating more chocolate.",
            "In three days, you will meet someone who looks exactly like you… but older.",
            "A package will arrive, but it’s not for you… yet."
        };
        
        System.out.println("🔮 Welcome to the Virtual Fortune Teller 🔮");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Ask me a mystical question: ");
        String question = sc.nextLine();
        
        System.out.println("\nThinking about your future...");
        try {
            Thread.sleep(2000); // pause for suspense
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Random rand = new Random();
        String fortune = fortunes[rand.nextInt(fortunes.length)];
        
        System.out.println("\n" + name + ", you asked: \"" + question + "\"");
        System.out.println("✨ Your fortune: " + fortune + " ✨");
        
        System.out.println("\nThank you for visiting the Fortune Teller! 🌙");
    }
}
