public class RAM {
    private int size;
    public RAM(int size){
        this.size = size;
    }
    public void describe(){
        String ramDetails = String.format("RAM size :%s", this.size);
        System.out.println(ramDetails);
    }
}
