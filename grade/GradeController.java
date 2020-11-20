package grade;

public class GradeController {
	private GradeService gradeService;
	public GradeController(){
		gradeService = new GradeServiceImpl();		
	}
	
	public int sum(GradeDto grade) {
		return gradeService.sum(grade);
		
		
	}
	public float avg(int sum) {
		return gradeService.avg(sum);
		
	}
	public String gradeSort() {
		return gradeService.gradeSort();
		
	}

}
