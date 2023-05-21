package intervieweeNotes;

public class Pig extends AnimalClass {
    static String name = "Pig";
    static String sound = "Oink";

    public Pig(){
        super();
    }

    protected void makeNoise(){
        System.out.println(this.name + ": " + this.sound);
    }
}