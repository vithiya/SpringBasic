package visi.spring.dependency.injection;

public class SecondProject implements Project {

    public SecondProject(){
        System.out.println("Second project object is created");
    }

    public void initiate() {
        System.out.println("Second project initiated");
    }
}
