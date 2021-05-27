// ------------------------------------------------------------
// Assignment: 1
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
Very simple program to display course information.
Note that I leave the original version in comments to demonstrate that I can
come to the same solution just with escape characters like we were taught. I
found this way to be much easier to read. I'm not sure to what extent we must
use the techniques from the lectures as opposed to reading more and experimenting
with other concepts.
*/

public class MessageDisplay {
    public static void main(String[] args) {
        /*
        System.out.println("Welcome to COMP248 Java programming!" + "\n\n"
            + "Here is the evaluation scheme:" + "\n"
            + "- 3 assignments (5% + 6% + 7%)" + "\n" + "- 7 labs (12% - best 6 out of 7)"
            + "\n" + "- term test (25%)" + "\n" + "- final (45%)" + "\n\n"
            + "Please note:" + "\n"
            + "1. In order to pass the course, you must complete all components of the course."
            + "\n" + "2. There is no standard relationship between percentages and letter grades assigned."
            + "\n\n" + "Wish you have a great semester!" + "\n");
        */
        
        System.out.println("""
        Welcome to COMP248 Java programming!
        
        Here is the evaluation scheme:
        - 3 assignments (5% + 6% + 7%)
        - 7 labs (12% - best 6 out of 7)
        - term test (25%)
        - final (45%)
        
        Please note:
        1. In order to pass the course, you must complete all components of the course.
        2. There is no standard relationship between percentages and letter grades assigned.
        
        Wish you have a great semester!
        """);
    }    
}
