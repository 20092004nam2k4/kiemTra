package kiemtra;

public class Teacher extends People {
 private int lever;
 private double experience;
 private String subject;

 public Teacher(){
   super();
 }

  public Teacher(String name , int age , boolean sex , double height , double weight , int lever , double experience , String subject) {
    super ( name , age , sex , height , weight );
    this.lever = lever;
    this.experience = experience;
    this.subject = subject;
  }

  public Teacher(int lever , double experience , String subject) {
    this.lever = lever;
    this.experience = experience;
    this.subject = subject;
  }

  public int getLever() {
    return lever;
  }

  public void setLever(int lever) {
    this.lever = lever;
  }

  public double getExperience() {
    return experience;
  }

  public void setExperience(double experience) {
    this.experience = experience;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "Teacher{" +
      "lever=" + lever +
      ", experience=" + experience +
      ", subject='" + subject + '\'' +
      "} " + super.toString ( );
  }
}
