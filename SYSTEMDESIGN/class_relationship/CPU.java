public class CPU {
    private String model;
    private int cores;

    public CPU(String model, int cores){
        this.model = model;
        this.cores = cores;
    }

    public void describe(){
        String cupDetails = String.format("Model : %s, CPU cores : %d", model, cores);
        System.out.println(cupDetails);
    }

}
