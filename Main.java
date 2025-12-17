import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    Xor cipher = new Xor();
        boolean go = true;
        System.out.println("Word Encryptor with XOR");
        while (go) {
            System.out.println("\n1-Set Encryption Key 2-Encrypt 3-Decrypt 4-Quit");
            String pick = input.nextLine();
            if (pick.equals("1")) {
                System.out.print("key: ");
                String k = input.nextLine();
                try {
                    cipher.setKey(k);
                    System.out.println("key ok!");
                } catch (Exception e) {
                    System.out.println("error: " + e.getMessage());
                }
            } else if (pick.equals("2")) {
                if (!cipher.hasKey()) { 
                    System.out.println("need key!"); 
                } else {
                    System.out.print("text: ");
                    System.out.println("result: " + cipher.encode(input.nextLine()));
                }
            } else if (pick.equals("3")) {
                if (!cipher.hasKey()) { 
                    System.out.println("need key!"); 
                } else {
                    System.out.print("hex: ");
                    try {
                        System.out.println("result: " + cipher.decode(input.nextLine()));
                    } catch (Exception e) {
                        System.out.println("bad hex!");
                    }
                }
            } else if (pick.equals("4")) {
                go = false;
            } else {
                System.out.println("wrong!");
            }
        }
        input.close();
    }
}
