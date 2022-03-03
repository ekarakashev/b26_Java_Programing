package day20_Still_Strings;

public class SmsParts {
    public static void main(String[] args) {
        /*
        [SMS parts]
        Given a String in the following format:
        “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
        Separate these parts and print them separately: Sender: actualSender
        Number: actualNumber Message: actualMessage”
         */
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
         int senderStart = msg.indexOf('<');
         int senderEnd = msg.indexOf('>');

         int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnd = msg.indexOf('}');

        System.out.println("Sender: " + msg.substring(senderStart + 1, senderEnd));



    }
}
