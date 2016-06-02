package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateLocale extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6255069790576192097L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������Ӧ��������
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// ��ȡ�ͻ��˵���������
		Locale locale = request.getLocale();
		String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date());

		String title = "�ض����������õ�����";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + date + "</h1>\n" + "</body></html>");
	}

}
