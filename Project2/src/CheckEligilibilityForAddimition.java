public class CheckEligilibilityForAddimition{
    public static void main(String[] args){
        int physicsMarks = 65;
        int chemistryMarks = 51;
        int mathsMarks = 72;
        int totalMarksAllSubjects = 188;
        int totalMarksMathsPhysics = 137;


        if (mathsMarks >= 65 && physicsMarks >= 55 && chemistryMarks >= 50) {
            if (totalMarksAllSubjects >= 190 || totalMarksMathsPhysics >= 140) {
                System.out.println("The candidate is eligible for admission.");
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}
