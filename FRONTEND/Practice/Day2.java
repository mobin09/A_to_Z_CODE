public class Day2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        double mb = 1024 * 1024;
        System.out.println("Max memory in  MB:" + r.maxMemory() /mb);
        System.out.println("Total memory in MB:" + r.totalMemory()/mb);
        System.out.println("Free Memory in MB:" + r.freeMemory()/mb);
        System.out.println("Consumed Memory in MB:" + (r.totalMemory() - r.freeMemory())/mb);
    }
}
