import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        // Obtain a reference to the console
        Console con = System.console();

        System.out.println("Hello world");

        // List of rotors to map characters. Spaces in the rotor strings should be ignored.
        List<String> rotors = new ArrayList<String>();
        rotors.add("BDFHJLCPRTXVZNYEIWGAKMUSQO");
        rotors.add("AJDKSIRUXBLHWTMCQGZNPYFVOE");
        rotors.add("EKMFLGDQVZNTOWYHXUSPAIBRCJ");

        // ToDO
        // Get a start message, encode it and then decode it

        String startMessage = "Hello world";
        String encryptedMessage = Enigma.encode(startMessage, 4, rotors);
        System.out.println("The encrypted message is: " + encryptedMessage);

        String decryptedMessage = Enigma.decode(encryptedMessage, 4, rotors);

        System.out.println("The decrypted message is: " + decryptedMessage);


        String newFormatInputMessage = "Test message. Working.";
        String formatInputMessage = Enigma.formatInputMessage(newFormatInputMessage);
        System.out.print("\nThe format input message is : " + formatInputMessage);

        String OutputMessage = "TEST?MESSAGE€?WORKING€";
        String formatOutputMessage = Enigma.formatOutputMessage(OutputMessage);
        System.out.print("\nThe format output message is : " + formatOutputMessage);
    }
}
