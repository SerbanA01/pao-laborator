package imutabile;


public final class ImmutableGym {
    private final int numberOfMembers;
    private final Membership membership;

    public ImmutableGym(int numberOfMembers, Membership membership) {
        this.numberOfMembers = numberOfMembers;
        this.membership = new Membership(membership);
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public Membership getMembership() {
        return new Membership(membership);
    }
}
