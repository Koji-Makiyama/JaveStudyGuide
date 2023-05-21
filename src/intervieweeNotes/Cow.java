package intervieweeNotes;

public class Cow extends AnimalClass {
    String name = "Cow";
    String sound = "Moo";

    public Cow(){
        super();
    }

    protected void makeNoise(){
        System.out.println(super.name + ": " + super.sound);
    }
}