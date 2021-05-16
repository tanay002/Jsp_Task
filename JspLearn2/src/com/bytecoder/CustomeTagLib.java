package com.bytecoder;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomeTagLib extends TagSupport
{
	public int doStartTag()
	{ 
		JspWriter out=pageContext.getOut();
		try
		{

			out.print("Name: Tanay");
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
