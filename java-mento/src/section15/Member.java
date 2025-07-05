package section15;

public class Member {
  private int memberId;
  private String memberName;

  public int getMemberId() {
    return this.memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getMemberName() {
    return this.memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public int hashCode() {
    return this.memberId;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member compare = (Member) obj;

      if (this.memberId == compare.memberId) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }
}
