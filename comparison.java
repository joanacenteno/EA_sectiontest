package section;

public class comparison {
	public Subject subj;
	public teacher teacher;
	public Hours hour;
	public Days days;
	public Subject subj2;
	public teacher teacher2;
	public Hours hour2;
	public Days days2;
	String res;
	
	public comparison(section s1, section s2){
		this.subj=s1.getSubject();
		this.teacher=s1.getTeacher();
		this.hour=s1.getHours();
		this.days=s1.getDays();
		
		this.subj2=s2.getSubject();
		this.teacher2=s2.getTeacher();
		this.hour2=s2.getHours();
		this.days2=s2.getDays();
		
	}
	
	public void compare(){
		if(hour==hour2&&days==days2){
			//di pede
			res="no";
		}
		else{
			//add na
			res="yes";
		}
		
	}
	
	public String result(){
		return res;
	}
}
