package section;

public class section {
	public Subject subj;
	public teacher teacher;
	public Hours hour;
	public Days days;
public section(Subject subj, teacher teacher, Hours hour, Days days){
	this.subj=subj;
	this.teacher=teacher;
	this.hour=hour;
	this.days=days;
	
	
			
	
}

public Subject getSubject(){
	return this.subj;
	
}
public teacher getTeacher(){
	return this.teacher;	
}
public Hours getHours(){
	return this.hour;
	
}
public Days getDays(){
	return this.days;
	
}
/*

private boolean areStudentsMoreThan40(){
	if(studentenrolled>40){
	return false;
	}
	else{
		return true;
	}
	
}

*/
}
