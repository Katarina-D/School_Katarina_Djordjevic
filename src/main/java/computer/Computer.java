
package computer;


public class Computer {
    
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer() {
        this.operatingSystem = "";
        this.processTact = 0;
        this.memory = 0;
        this.hardDrive = 0;
    }
    
    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
}
