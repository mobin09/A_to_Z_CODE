public class Computer {
    private String name;
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer(String name , String model, int cores, int size, int capacityGB){
        this.name = name;
        cpu = new CPU(model, cores);
        ram = new RAM(size);
        hardDrive = new HardDrive(capacityGB);

    }
   public void describeSpec(){
       //Computer: 
       System.out.println("Computer: " + this.name);
   }

}
