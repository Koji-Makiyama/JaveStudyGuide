public class Interviewer {
    public void askAConceptQuestion(String s){
        String plural = "s";
        String lastCharOfInput = String.valueOf(s.charAt(s.length()-1));
        if (lastCharOfInput.equals(plural)) {
            System.out.println("Explain " + s + " and give me an example of one.\n");
        } else if (s.equals("Big-O Notation")) {
            System.out.println("Explain " + s + " in simple words. Then explain " +
                    "each level of complexity starting with the lowest level and covering each subsequent level of \ncomplexity up to the highest.\n");
        } else {
            System.out.println("Explain " + s + " and give me an example of it.\n");
        }
    }

    public void askAboutOperationsOrOperators(String s){
        System.out.println("Tell me what " + s + " are. Then write out each one and show me how they can be used in some code.\n");
    }

    public void askAboutADataStructure(String s){
        System.out.println("Tell me about " + s + ". Tell me what library " +
                "it comes from, how it works, its strengths and weaknesses as opposed to other data structures," +
                "\n and some methods available to its class. Then write out how to declare one, add data to it," +
                "remove data from it, and print the data to the console.\n");
    }

    public void giveACodingChallenge(String s){
        System.out.println("Write an example of a " + s + " on a piece of paper and show it to me. " +
                "Then explain the logic and what it does.\n");
    }

    public void askAllQuestions(){
        Interviewer interviewer = new Interviewer();
        System.out.println("\nWelcome to your interview. Please answer the following questions to the best of your ability.\n");
        interviewer.askAConceptQuestion("Encapsulation");
        interviewer.askAConceptQuestion("Inheritance");
        interviewer.askAConceptQuestion("Abstraction");
        interviewer.askAConceptQuestion("Polymorphism");
        interviewer.giveACodingChallenge("Basic SQL Query");
        interviewer.askAConceptQuestion("Primary Keys");
        interviewer.askAConceptQuestion("Foreign Keys");
        interviewer.askAConceptQuestion("Normalization");
        interviewer.askAboutADataStructure("Arrays");
        interviewer.askAboutADataStructure("ArrayLists");
        interviewer.askAboutADataStructure("LinkedLists");
        interviewer.askAboutADataStructure("HashTables");
        interviewer.askAConceptQuestion("if-statements");
        interviewer.askAConceptQuestion("else-statements");
        interviewer.askAConceptQuestion("for-loops");
        interviewer.askAConceptQuestion("while-loops");
        interviewer.askAboutOperationsOrOperators("Mathematical Operations");
        interviewer.askAboutOperationsOrOperators("Comparison Operations");
        interviewer.askAConceptQuestion("Exception Handling");
        interviewer.askAboutOperationsOrOperators("Increment Operators");
        interviewer.askAConceptQuestion("Big-O Notation");
        interviewer.askAConceptQuestion("Performance vs Scalability");
        interviewer.askAConceptQuestion("Agile vs Waterfall method");
    }

    public Interviewer(){
    }

}
