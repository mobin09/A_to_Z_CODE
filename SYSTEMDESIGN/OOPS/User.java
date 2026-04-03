import java.util.ArrayList;
import java.util.List;

class User {
    private List<Group> userGroups  = new ArrayList<>();
}

class Group {
    private List<User> userGroup = new ArrayList<>();
}

