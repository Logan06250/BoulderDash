package model;

public class ResultOfDAO {

	public int result[];
	
	public ResultOfDAO(int size){
		int result[] = new int[size];
	}

	public int[] getResult() {
		return result;
	}

	public void setResult(int result[]) {
		this.result = result;
	}
	
	public int getResultCase(int i){
		return this.result[i];
	}
	
	public void setResultCase(int i, int value){
		this.result[i] = value;
	}
}
