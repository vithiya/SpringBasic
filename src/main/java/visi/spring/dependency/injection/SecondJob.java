package visi.spring.dependency.injection;

public class SecondJob {

    private Project project;


    public void setProject(Project project) {
        this.project = project;
    }

    public void initiateProject(){
        project.initiate();
    }
}
