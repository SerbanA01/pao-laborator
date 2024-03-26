package imutabile;


public class Application {
    public static void main(String[] args) {
        Membership membership = new Membership("Serban Andrei", "Standard", 12);

        Gym gym = new Gym(100, membership);
        System.out.println("Gym (mutable): " + gym.getMembership());

        ImmutableGym immutableGym = new ImmutableGym(100, membership);
        membership.setMembershipType("Premium");

        System.out.println("Gym (mutable) after change: " + gym.getMembership());

        System.out.println("ImmutableGym: " + immutableGym.getMembership());
    }
}
