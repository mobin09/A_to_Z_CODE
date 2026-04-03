import java.util.ArrayList;
import java.util.List;

class Issue {
    private Project project;
    public void setProject(Project project){
        this.project = project;
    }
}


class Project {
    private List<Issue> listIssues = new ArrayList<>();

    public void addIssue(Issue issue){
        listIssues.add(issue);
        issue.setProject(this);
    }
}