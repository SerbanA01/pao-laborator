package singleton;

import java.util.ArrayList;
import java.util.List;
public class MembershipManager {
    private static MembershipManager instance;
    private List<String> memberNames = new ArrayList<>();

    private MembershipManager() {}


    public static MembershipManager getInstance() {
        if (instance == null) {
            instance = new MembershipManager();
        }
        return instance;
    }


    public void registerMember(String name) {
        if (!memberNames.contains(name)) {
            memberNames.add(name);
        }
    }

    public List<String> listMembers() {
        return memberNames;
    }
}
