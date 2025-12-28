import java.util.HashSet;
import java.util.Set;

public class Data {
    
	private int id;
	private String value;
    
    public Data(int id, String value){
        this.id=id;
        this.value = value;
    }

	@Override
	public int hashCode(){
		return (int)Math.round(Math.random()*1000);
	}
 
    public static void main(String[] args) {
        Set<Data> dataSet = new HashSet<>();
        Data d  = new Data(1,"One");
       System.out.println(d.hashCode());
        

       dataSet.add(d);
       dataSet.add(d);
       dataSet.add(d);
       dataSet.add(d);
    System.out.println(dataSet.size());
        dataSet.stream().forEach(x -> System.out.println(x.hashCode()));
    }



}


