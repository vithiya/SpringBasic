package visi.spring.dependency.injection;

public class Job {

    private int id;
    private String companyName;
    private Project project;

    public Job() {
    }

    public Job(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public Job(String companyName) {
        this.companyName = companyName;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayJobInfo(){
        System.out.println("Company Name is : "+ companyName + " Company id is " + id);
    }

    public void initiateProject(){
        project.initiate();
    }
}
