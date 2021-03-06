/**
 * 
 */
package org.freya.model;


import java.util.List;

/**
 * This element holds list of elements that are grouped where type indicate the
 * relation btw. them (e.g., AND, OR).
 * 
 * @author danica
 * 
 */
public class GroupElement implements OntologyElement {

	boolean isAnswer;

	public boolean isAnswer() {
		return isAnswer;
	}

	public void setAnswer(boolean isAnswer) {
		this.isAnswer = isAnswer;
	}

	/** max min sum */
	String function;

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	/*
	 * this flag indicates whether the element is already in the list of
	 * elements and whether it should be ignored except for the function; this
	 * happens when some existing elements are modified with for example max min
	 * etc
	 */
	boolean alreadyAdded;

	public boolean isAlreadyAdded() {
		return alreadyAdded;
	}

	public void setAlreadyAdded(boolean alreadyAdded) {
		this.alreadyAdded = alreadyAdded;
	}

	String type;
	List data;
	Annotation annotation = new Annotation();

	public Annotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}

	public void setData(List data) {
		this.data = data;
	}

	public List getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = (List) data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer result = new StringBuffer("");
		result.append(this.getClass().toString()).append(annotation.toString())
				.append(" Data: ").append(getData()).append(" Type: ").append(
						this.type).toString();
		// if (this.variable != null)
		// result.append(" \n Variable:").append(this.variable);
		return result.toString();

	}

	public List<String> getResults() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVariable() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isMainSubject() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setMainSubject(boolean value) {
		// TODO Auto-generated method stub

	}

	public void setResults(List<String> results) {
		// TODO Auto-generated method stub

	}

	public void setVariable(String key) {
		// autogenerated...

	}

	Score score;

	public Score getScore() {
		return this.score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	
}
