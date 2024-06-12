import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    private static Random randomMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tenRolls.add(randomMachine.nextInt(20) + 1);
        }
        return tenRolls;
    }


    public Character getRandomLetter() {
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
        return alphabet.get(randomMachine.nextInt(26));
    }


    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwords = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }
}