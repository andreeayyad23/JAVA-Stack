import java.util.Date;

public class AlfredQuotes {
    
    // Method to generate a basic greeting
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    // Method to generate a personalized greeting
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    // Method to announce the current date and time
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    
    // Method to respond based on conversation content
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }

    // Method to handle a sentence related to food
    public String foodLove(String sentence) {
        return sentence.trim();
    }
}
