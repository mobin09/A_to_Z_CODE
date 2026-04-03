import java.util.ArrayList;
import java.util.List;

public class Developer {
   private  Team team;
    public void setTeam(Team team){
        this.team = team;
    }
}

class Team {
    private List<Developer> devList = new ArrayList<>();
    public void addDeveloper(Developer developer){
        devList.add(developer);
        developer.setTeam(this);
    } 
}