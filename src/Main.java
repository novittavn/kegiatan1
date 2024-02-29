import java.util.Scanner;

public class Main {

    private static final String[] usernameSiswa = { "202310370311395", "12345678", "11111", "101104" };
    private static final String usernameAdmin = "nobi";
    private static final String passwordAdmin = "novi123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("=== Library System ===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option(1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Enter your NIM: ");

                    String nim = scanner.next();

                    boolean ditemukan = false;
                    for (int i = 0; i < usernameSiswa.length; i++) {
                        if (usernameSiswa[i].equals(nim)) {
                            ditemukan = true;
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Succesful Login as Student");
                    } else {
                        System.out.println("User not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your Username (admin): ");
                    String username = scanner.next();
                    System.out.print("Enter your Password (admin): ");
                    String password = scanner.next();

                    if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) {
                        System.out.println("Succesful Login as Admin");
                    } else {
                        System.out.println("User not found!!");
                    }
                    break;
                case 3:
                    System.out.println("Adios");
                    loop = false;
                    break;
                default:
                    System.out.println("Option not valid!");
            }
        }
    }
}