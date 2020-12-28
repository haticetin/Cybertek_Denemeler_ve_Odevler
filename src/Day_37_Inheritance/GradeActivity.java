package Day_37_Inheritance;

public class GradeActivity {
	
	private double score;
	
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {
		char letterGrade;
		
		if(score>=90 && score<=100) {
			letterGrade = 'A';
		}else if(score>=80 && score<=90) {
			letterGrade = 'B';
		}else if(score>=70 && score<=80) {
			letterGrade = 'C';
		}else if(score>=60 && score<=70) {
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		
		return letterGrade;
	}
	
}
