package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyLocale extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9140888622089868046L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// 获取客户端的区域设置
		Locale locale = request.getLocale();
		NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
		String formattedCurr = nft.format(1000000);

		String title = "特定于区域设置的货币";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">" + formattedCurr + "</h1>\n" + "</body></html>");
	}

}
