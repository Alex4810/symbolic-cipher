import java.util.Scanner;
public class Main {

    public static void main (String[] args)
    {
        System.out.println("Welcome to the Symbolic Cipher! \n" +
                "This is a general cipher that encrypts and decrypts your messages using symbols.");
        ask();


    }

    public static Scanner scan = new Scanner(System.in);

    public static void ask()
    {
        System.out.println("Do you wish to encrypt or decrypt?");
        String userInput = scan.nextLine();
        userInput = userInput.toLowerCase();
        switch(userInput)
        {
            case "encrypt":
                encrypt();
                break;
            case "decrypt":
                System.out.println("Please enter the encrypted message you wish to decrypt:");
                String encryptedMessage = scan.nextLine();
                decrypt(encryptedMessage);
                break;
            default:
                System.out.println("Please enter 'encrypt' to encrypt and enter 'decrypt' to decrypt.");
                ask();
        }

    }

    public static void encrypt()
    {
        String encryptedMessage = "";
        System.out.println("Please enter your message.\n");
        String message = scan.nextLine().toLowerCase();
        for(int i = 0; i < message.length(); i++)
        {
            encryptedMessage = encryptedMessage + Key.charToSymbol(message.charAt(i));
        }
        System.out.println("Your Encrypted Message: \n" + encryptedMessage);



    }
    public static void decrypt(String encryptedMessage)
    {
        String message = "";
        for(int i = 0; i < encryptedMessage.length(); i++)
        {
            message = message + Key.symbolToChar(encryptedMessage.charAt(i));
        }
        System.out.println("Your decrypted message;\n" + message);
    }
}

