public class HardDrive {
    private int capacityGB;

    public HardDrive(int capacityGB){
        this.capacityGB = capacityGB;
    }

    public void describe(){
        String hardDrive = String.format("Hard Drive capacity: %s", capacityGB);
        System.out.println(hardDrive);
    }
}
