/**
 * Created by DELL on 7/20/2017.
 */
public class Student {
    // object: a bundle of data and behaviors

    //data: instance variables (member variable, fields)
    // these exist outside of methods--hold for
    //entire lifetime of the class
    private String firstName;
    private String lastName;
    private String bootCamp;
     private int id;
    private double grade;

    //behavior/methods
    //as a general rule, public
    //constuctor: public method that creates the instance
    //what's called when the new keyword is used with the class
    //1. visibility modifier: usually public
    //2. never static
    //3. NO RETURN TYPE
    //4. name = name of class (capitalize the same)
    //5. arguments vary
    // might take 1 argument for each instance variable
    // might take no arguments and set everything
    // to default values

    // no arguments constuctor
    public Student (){
        firstName = "";
        lastName = "";
        bootCamp = "";
        id = 42;
        grade = 1.0;
    }

    // all-arguments constuctor
    public Student (String fn, String ln, String bc, int id, double g){
        firstName = fn;
        lastName = ln;
        bootCamp = bc;
        id = i;
        grade = g;

    }


    //getters (accessors) provide public view access to
    //private instance variables
    //1. visibility modifier: public
    //2. never static (STATIC IS THE OPPOSITE OF INSTANCE)
    //3.  type is usually the data type of the instance
    //4. name is usually set + instance var. name
    //5. arguments: one argument, the same data type as
    //the private instance variable


    public String getfirstName() {
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public String getBootCamp(){
        return bootCamp;
    }
     public int getid(){
        return id;
     }
     public double getGrade(){
         return grade;
     }
    // setters (mutators) provide public write access to
    // private instance vaiables

    public void setFirstName(String fn){
         //I need to capture the value from the argument
        //which is going out of the scope soon
        //
        public void setLastname(String lastName){
            // this key word refers to the
        }
    }
}
