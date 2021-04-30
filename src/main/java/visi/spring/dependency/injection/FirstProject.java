package visi.spring.dependency.injection;

public class FirstProject implements Project {

    public FirstProject(){
        System.out.println("Project object is created");
    }

    public void initiate() {
        System.out.println("project initiated");
    }
}
