import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Message to Cipher: ");
		String message = scanner.nextLine();
		int offset = 12;
		
		CaesarsCipher caesarsChipher = new CaesarsCipher();
		String cipheredMessage = caesarsChipher.cipher(message, offset);
		
		System.out.println("Orginal message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
