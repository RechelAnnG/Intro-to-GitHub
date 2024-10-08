public class HeartMessage {
    public static void main(String[] args) {
        // Obfuscated message using Caesar Cipher (shift of 3)
        String encodedMessage = "Wr Dufwlf Y L oryh brx'oo";

        // Decoding the message by shifting each character back by 3
        String decodedMessage = decodeMessage(encodedMessage, 3);

        // Printing the heart with the decoded message in the center
        printHeart(decodedMessage);
    }

    // Method to decode the message using Caesar Cipher
    public static String decodeMessage(String encodedMessage, int shift) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encodedMessage.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                decoded.append((char) ((c - 'A' - shift + 26) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                decoded.append((char) ((c - 'a' - shift + 26) % 26 + 'a'));
            } else {
                decoded.append(c); // Keep spaces and special characters the same
            }
        }
        return decoded.toString();
    }

    // Method to print the heart shape using loops
    public static void printHeart(String message) {
        int n = 6; // Control the size of the heart
        // Top part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom part of the heart
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Printing the decoded message at the bottom
        System.out.println("     " + message);
    }
}
