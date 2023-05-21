package intervieweeNotes;

public class Barn {

    public static void main(String[] args) {
        AnimalClass cow = new Cow();
        Pig pig = new Pig();
        AnimalClass animal = new AnimalClass();

        cow.makeNoise();
        animal.makeNoise();
        pig.makeNoise();
        System.out.println(pig.name); //
        System.out.println(Pig.name); // Pig is not a static class, but it has static variables
        System.out.println(Pig.sound);
    }
}