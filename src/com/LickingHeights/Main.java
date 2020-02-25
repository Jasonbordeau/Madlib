package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Phase 1
        //declare variables
        String name;
        String verb;
        String adjective;
        String place;
        String time;
        String doctorsName;
        String bodyPart;
        String disease;
        String liquid;
        String age;
        String celebrity;
        String food;
        String verbEndingInIng;
        String interjection;
        String adjective2;
        String relativeName;
        String animal;
        String pluralNoun;
        String emotion;
        String verb2;
        Scanner user;

        // Phase 2
        //initializing
        //name = "Jamin";
        //verb = "jump";
        //adjective = "juicy";
        //place = "convenience store";
        //time = "3:37 AM";
        //doctorsName = "Dr. Pimple Popper";
        //bodyPart = "Gynecomastia";
        //disease = "Ebola Virus";
        //liquid = "gasoline";
        //age = "89";
        //celebrity = "John Cena";
        //food = "cheesecake";
        //verbEndingInIng = "blinking";
        //interjection = "FRICK";
        //adjective2 = "berserk";
        //relativeName = "mother";
        //pluralNoun = "books";
        //animal = "elephant";
        //emotion = "excited";
        //verb2 = "sit";
        user = new Scanner(System.in);

        System.out.println("Name");
        name = user.nextLine();

        System.out.println("Verb");
        verb = user.nextLine();

        System.out.println("Adjective");
        adjective = user.nextLine();

        System.out.println("Place");
        place = user.nextLine();

        System.out.println("Time");
        time = user.nextLine();

        System.out.println("Doctor's Name");
        doctorsName = user.nextLine();

        System.out.println("Type of Body Part");
        bodyPart = user.nextLine();

        System.out.println("Type of Disease");
        disease = user.nextLine();

        System.out.println("Type of Liquid");
        liquid = user.nextLine();

        System.out.println("Age");
        age = user.nextLine();

        System.out.println("Name of a Celebrity");
        celebrity = user.nextLine();

        System.out.println("Type of Food");
        food = user.nextLine();

        System.out.println("Verb Ending in ING");
        verbEndingInIng = user.nextLine();

        System.out.println("Interjection");
        interjection = user.nextLine();

        System.out.println("Adjective");
        adjective2 = user.nextLine();

        System.out.println("Name of Relative");
        relativeName = user.nextLine();

        System.out.println("Animal");
        animal = user.nextLine();

        System.out.println("Plural Noun");
        pluralNoun = user.nextLine();

        System.out.println("Emotion");
        emotion = user.nextLine();

        System.out.println("Verb");
        verb2 = user.nextLine();

        // Phase 3
        //story
        System.out.print("My name is " + name);
        System.out.println(" and I love to " + verb + ".");
        System.out.print("I am feeling real " + adjective + " ");
        System.out.println("maybe I should go to the " + place + ".");
        System.out.println("The " + place + " is not that busy at " + time + ".");
        System.out.println("A doctor named " + doctorsName + " gave me a checkup.");
        System.out.println("Dr. " + doctorsName + " said that my " + bodyPart + " is broken.");
        System.out.println("The doctor also said that I have " + disease + " and that " + liquid + " is pouring out of my " + bodyPart + ".");
        System.out.println("Dr. " + doctorsName + " said " + age + " is way too young to have " + disease + ".");
        System.out.println("As I was leaving the " + place + " I saw " + celebrity + ". " + "They were choking on " + food + " because they were "
                + verbEndingInIng + " while eating.");
        System.out.println(interjection + " I yelled as I ran to go give " + celebrity + " the heimlich maneuver.");
        System.out.println(celebrity + "'s face was turning real " + adjective2 + ".");
        System.out.println("My " + relativeName + " and pet " + animal + " came into the " + place + " to pick me up as they saw " + celebrity + " choking.");
        System.out.println("My " + relativeName + " threw her " + pluralNoun + " into the air.");
        System.out.println(relativeName + " began crying because " + celebrity + " is her favorite." + " My " + animal + " started " + verb2 + " as I saved " + celebrity);
    }
}