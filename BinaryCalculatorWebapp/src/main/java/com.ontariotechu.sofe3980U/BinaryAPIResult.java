package com.ontariotechu.sofe3980U;

public class BinaryAPIResult 
{
	private String operand1;
	private String operation;
	private String operand2;
	private String result;

	public BinaryAPIResult(Binary operand1, String operation, Binary operand2, Binary result)
	{
		this.operand1 = operand1.getValue();
		this.operation = operation;
		this.operand2 = operand2.getValue();
		this.result = result.getValue();
	}

	public String getOperand1(){
		return operand1;
	}

	public String getOperation(){
		return operation;
	}

	public String getOperand2(){
		return operand2;
	}

	public String getResult(){
		return result;
	}
}