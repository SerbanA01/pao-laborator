package singleton;

public class Application {
    public static void main(String[] args) {

        MembershipManager membershipManager = MembershipManager.getInstance();
        //MembershipManager membershipManager2 = MembershipManager.getInstance();

        //System.out.println(membershipManager.equals(membershipManager2));
        membershipManager.registerMember("Serban Andrei");
        membershipManager.registerMember("Alex Popescu");

        membershipManager.registerMember("Serban Andrei");

        System.out.println("Registered Gym Members:");
        for (String memberName : membershipManager.listMembers()) {
            System.out.println(memberName);
        }
    }
}
