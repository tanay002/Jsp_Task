package com.bytecoder;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomeTagLibPower3 extends TagSupport
{
	private int number;
	private int power;
private static int count;
private static int result=1;


	public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getPower() {
	return power;
}
public void setPower(int power) {
	this.power = power;
}

	public int doStartTag()
	{ 
		
		return EVAL_BODY_INCLUDE;

	}
     public int doAfterBody()
     {
    	 count++;
    	 result=result*number;
     if(count==power)
     return SKIP_BODY;
     else
    	 return EVAL_BODY_AGAIN;   
     }
    	
     
	public int doEndTag()
	{ 
		JspWriter out=pageContext.getOut();
		try
		{
			out.print(result);
		}
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		return EVAL_PAGE;

	}
}
