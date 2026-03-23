class StudentService {

    // Add marks of 3 subjects
    public int addMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Calculate percentage
    public double calculatePercentage(int totalMarks) {
        if (totalMarks < 0) {
            throw new IllegalArgumentException("Marks cannot be negative");
        }
        return totalMarks / 3.0;
    }

    // Calculate grade
    public String calculateGrade(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid percentage");
        }
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "Fail";
    }

    // Check pass/fail
    public boolean isPass(double percentage) {
        return percentage >= 50;
    }

    // Validate marks (0–100 only)
    public boolean validateMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }
}