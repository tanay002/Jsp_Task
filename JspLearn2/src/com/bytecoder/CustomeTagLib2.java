package com.bytecoder;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomeTagLib2 extends TagSupport
{
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int doStartTag()
	{ 
		int  result=0;
		JspWriter out=pageContext.getOut();
		try
		{
			String[] values= value.split(",");
			for(String val:values)
			{
				int no=Integer.parseInt(val);
				result=result+no;
			}
			out.print("Result of addition is "+result);

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return 0;

	}

	public int doEndTag()
	{ 
		JspWriter out=pageContext.getOut();
		try
		{
			out.print("City: Indore");
		}
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		return 0;

	}
}
