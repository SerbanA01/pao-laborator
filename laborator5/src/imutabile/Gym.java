package imutabile;


public class Gym {
    private int numberOfMembers;
    private Membership membership;

    public Gym(int numberOfMembers, Membership membership) {
        this.numberOfMembers = numberOfMembers;
        this.membership = membership;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}
