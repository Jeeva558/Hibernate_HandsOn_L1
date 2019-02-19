package topic3.assignment1;

import java.util.List;

public class Question 
{
private int id;
private String qname;
private List options;
private String answer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public List getOptions() {
	return options;
}
public void setOptions(List options) {
	this.options = options;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

public Question(String qname, List options, String answer) {
	super();
	
	this.qname = qname;
	this.options = options;
	this.answer = answer;
}
}
