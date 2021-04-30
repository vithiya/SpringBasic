package visi.spring.ioc;

public class ArtificialIntelligence implements Course {

    public ArtificialIntelligence(){
        System.out.println("Artificial Intelligence constructor called");
    }

    public void enroll() {
        System.out.println("Successfully enrolled Artificial Intelligence");
    }

    public void results() {
        System.out.println("Successfully Completed Artificial Intelligence");
    }
}
