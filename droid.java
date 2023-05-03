// Droid tutorial by codeCademy

public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    this.name = droidName;
    this.batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + this.name;
  }

  public void performTask(String task){
   System.out.println(name + " is performing taask: " + task);
   batteryLevel -= 10;
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey.name);
    System.out.println(codey.toString());
    codey.performTask("Dancing");
    System.out.println(codey.batteryLevel);
    codey.performTask("Cleaning");
    System.out.println(codey.batteryLevel);
    codey.performTask("Cooking");
    System.out.println(codey.batteryLevel);
    codey.performTask("Reading");
    System.out.println(codey.batteryLevel);
  }
}