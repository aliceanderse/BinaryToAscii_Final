import java.util.Scanner;
public class BinaryASCIIConverter {
    private static Scanner input = new Scanner(System.in);

    public static void run() {
        System.out.println(
                """
                        1. Text to binary
                        2. Binary to text
                        3. Quit
                        Enter choice:"""

        );

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            textToBinary();
        } else if (choice == 2) {
            binaryToText();
        }
    }


    private static void binaryToText()
    {
        System.out.println("Enter binary: ");
        String binary = input.nextLine();
        int n = 128;
        int num = 0;

        for (int i = 0; i < binary.length(); i ++)
        {
            char bit = binary.charAt(i);

            if (bit == '1')
            {
                num = num + n;

            }

                n = n/2;

            if (bit == ' ')
            {
                n = n * 2;
            }



            if (n == 0)
            {
                char letter = (char) num;
                System.out.print(letter);
                n = 128;
                num = 0;
            }

        }

    }

    private static void textToBinary()
    {
        System.out.println("Enter text: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++)
        {
            int ascii = text.charAt(i);
            String binary = "";
            int n = 128;

            for (int i2 = 0; i2 < 8; i2 ++)
            {
                if ((ascii - n) < 0)
                {
                    binary = binary + "0";
                    n = n/2;
                }
                else
                {
                    binary = binary + "1";
                    ascii = ascii - n;
                    n = n/2;
                }
            }

            System.out.println(binary);

        }

    }

}
