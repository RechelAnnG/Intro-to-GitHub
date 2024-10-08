public class HeartMessage {
    public static void main(String[] args) {
        String encodedMessage = "Wr Dufwlf Y L oryh brx'oo";

        String decodedMessage = decodeMessage(encodedMessage, 3);

        printHeart(decodedMessage);
    }


    public static String decodeMessage(String encodedMessage, int shift) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encodedMessage.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                decoded.append((char) ((c - 'A' - shift + 26) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                decoded.append((char) ((c - 'a' - shift + 26) % 26 + 'a'));
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

    public static void printHeart(String message) {
        int n = 6; 
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
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("     " + message);
    }
}
