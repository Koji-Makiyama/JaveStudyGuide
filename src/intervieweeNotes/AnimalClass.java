package intervieweeNotes;

public class AnimalClass {
    String name = "Animal";
    String sound = "arghh";

    protected void makeNoise(){
        System.out.println(this.name + ": " + this.sound);
    }
}