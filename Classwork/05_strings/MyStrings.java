public class MyStrings
{
    public static void main(String[] args)
    {
        // Remember the first letter of an String starts at position 0 (ZERO)
        
       String msg = "The people who are crazy enough to think they can change the world are the ones who do."; 
       System.out.println("My message:\n" + msg);
        
       System.out.println(msg.length()); // Print the length of msg
       
       String firstSubs = msg.substring(4, 10);
       System.out.println("msg.substring(4, 10): " + firstSubs);
       // What is the outuput? msg.substring(4, 10): people
       // Are characters 4 and 10 included? 4 is included but 10 is not
       System.out.println(firstSubs.length()); // Print the length of firstSubs

       String secondSubs = msg.substring(41);
       System.out.println("msg.substring(41): " + secondSubs);
       // What is the output? msg.substring(41): they can change the world are the ones who do.
       // Is the character 41 included? No, the 41st character is not included
        
       System.out.println(secondSubs.length()); // Print the length of secondSubs
        
       System.out.println(msg.substring(4,10)); // Get and print the word people
       System.out.println(msg.length(firstSubs.length()-3); // Get and print the last three characters of msg
        
       System.out.println("firstSubs: " + firstSubs);
       System.out.println("secondSubs: " + secondSubs);

       System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));
        // What is the result of the comparison? The result is false
        // Create a new String object newStr and assign a value. Requirement: firstSubs.equals(newStr) should be True
        // REMEMBER DO NOT USE == TO COMPARE STRINGS

        System.out.println( "msg.charAt(0) is: " + msg.charAt(0));
        // What is the output?
        // Print the last character of msg using the method charAt()

        // YOU CAN COMPARE CHARACTERS USING ==
        System.out.println("msg.charAt(0) == \'A\': ");
        System.out.println(msg.charAt(0) == 'A'); 

    }
}
