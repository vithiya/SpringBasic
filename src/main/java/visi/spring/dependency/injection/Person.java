package visi.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Job job = context.getBean("Job",Job.class);
        Job secondJob = context.getBean("secondJob",Job.class);
        Job thirdJob = context.getBean("thirdJob",Job.class);
        Job fourthJob = context.getBean("fourthJob",Job.class);
        Job fifthJob = context.getBean("fifthJob",Job.class);
        Job sixthJob = context.getBean("sixthJob",Job.class);

        job.displayJobInfo();
        secondJob.displayJobInfo();
        thirdJob.displayJobInfo();
        fourthJob.displayJobInfo();
        sixthJob.displayJobInfo();

        /*Job fifthJob = new Job();
        Project revamp = new Project();
        fifthJob.setProject(revamp);*/
        fifthJob.initiateProject();
        sixthJob.initiateProject();

        SecondJob secJob = context.getBean("secJob", SecondJob.class);
        secJob.initiateProject();
    }
}
