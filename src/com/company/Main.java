package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String inQuestion;
    String answer = "";
    int x;
    String anotherQuestion="y";
    Random rand=new Random();

    while(anotherQuestion.equals("Y")||anotherQuestion.equals("y"))
        {
            x = 1 + rand.nextInt(20);
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your question?");
            inQuestion = scanner.nextLine();

            switch (x) {
                case 1:
                    answer = "It is certain";
                    break;
                case 2:
                    answer = "It is decidedly so";
                    break;
                case 3:
                    answer = "Without a doubt";
                    break;
                case 4:
                    answer = "Yes definitely";
                    break;
                case 5:
                    answer = "You may rely on it";
                    break;
                case 6:
                    answer = "As I see it, yes";
                    break;
                case 7:
                    answer = "Most likely";
                    break;
                case 8:
                    answer = "Outlook good";
                    break;
                case 9:
                    answer = "Yes";
                    break;
                case 10:
                    answer = "Signs point to yes";
                    break;
                case 11:
                    answer = "Reply hazy try again";
                    break;
                case 12:
                    answer = "Ask again later";
                    break;
                case 13:
                    answer = "Better not tell you now";
                    break;
                case 14:
                    answer = "Cannot predict now";
                    break;
                case 15:
                    answer = "Concentrate and ask again";
                    break;
                case 16:
                    answer = "Don't count on it";
                    break;
                case 17:
                    answer = "My reply is no";
                    break;
                case 18:
                    answer = "My sources say no";
                    break;
                case 19:
                    answer = "Outlook not so good";
                    break;
                case 20:
                    answer = "Very doubtful";
                    break;
            }

            System.out.println("YOU ASKED: " + inQuestion+"\n");
            System.out.println("MAGIC 8-BALL SAYS: " + answer+"\n");
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            anotherQuestion = scanner.next();
        }
    }
}
