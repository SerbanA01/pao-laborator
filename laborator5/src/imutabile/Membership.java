package imutabile;

public class Membership {
    private String memberName;
    private String membershipType;
    private int durationMonths;

    public Membership(String memberName, String membershipType, int durationMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.durationMonths = durationMonths;
    }


    public Membership(Membership membership) {
        this.memberName = membership.getMemberName();
        this.membershipType = membership.getMembershipType();
        this.durationMonths = membership.getDurationMonths();
    }


    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "memberName='" + memberName + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", durationMonths=" + durationMonths +
                '}';
    }
}
