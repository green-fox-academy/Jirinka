package com.company;

import java.util.Scanner;

public class LukinkoMessaging
{
    public static void main(String[] args) throws InterruptedException {

        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type encode, decode or exit to do a proper operation");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("encode"))
            {
                System.out.println("Please type your message");
                String message = scanner.nextLine().toLowerCase();
                System.out.println("Encoded message: " + messageEncoder(message));

            } else if (input.equals("decode"))
            {
                System.out.println("Please type your message");
                String message = scanner.nextLine().toLowerCase();
                System.out.println("Decoded message: " + messageDecoder(message));

            }else if (input.equals("exit"))
            {
                break;

            }else
            {
                System.out.println("Incorrect input... start over");
            }
            Thread.sleep(3000);
        }
    }

    public static String messageEncoder(String message)
    {
        if(message.length() == 0)
            return "";

        char letter = message.charAt(0);
        letter = (char) (letter + 10);

        return letter + messageEncoder(message.substring(1));
    }

    public static String messageDecoder(String message)
    {
        if(message.length() == 0)
            return "";

        char letter = message.charAt(0);
        letter = (char) (letter - 10);

        return letter + messageDecoder(message.substring(1));
    }
}
