package kiemtra;

public class TestIOTextCau1{
  public static void main(String[] args) {
    People people= new People ();
    System.out.println (people.toString () );

    people = new People ( "Nam",18,true ,1.60,50 );
    System.out.println (people );
    System.out.println ( );
    System.out.println ( );


    Teacher teacher = new Teacher (18,11.0,"Cầu lông");
    System.out.println (teacher.toString () );

    System.out.println (teacher);


  }


}
