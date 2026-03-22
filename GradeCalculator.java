public class GradeCalculator {

   public String getGrade(int marks){
    if(marks<0 || marks>100){
        throw new IllegalArgumentException("Invalid marks");
    }
    if(marks >= 90) return "A";
    else if(marks >= 75) return "B";
    else if(marks >= 50) return "C";
    else return "Fail";
   }
    
}
