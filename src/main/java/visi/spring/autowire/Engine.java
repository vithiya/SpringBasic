package visi.spring.autowire;

public class Engine {

    private String engineName;
    private int fuelInLitre;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public int getFuelInLitre() {
        return fuelInLitre;
    }

    public void setFuelInLitre(int fuelInLitre) {
        this.fuelInLitre = fuelInLitre;
    }

    protected void start(){
        System.out.println("Engine started successfully");
        System.out.println("Happy Journey !");
    }
}
