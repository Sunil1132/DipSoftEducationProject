package com.educationproject.web.helper;

import javax.servlet.http.HttpServletRequest;

public class WebHelper {
	public static final String IMAGE_ROOT = "images";
	public static final String CSS_ROOT = "css";
	public static final String PATH_SEPERATOR = "/";

	public static String getContextPath(HttpServletRequest request) {
		return request.getContextPath();
	}

	public static String getImageRoot(HttpServletRequest request) {
		return getContextPath(request) + PATH_SEPERATOR + IMAGE_ROOT;
	}

	public static String getCSSRoot(HttpServletRequest request) {
		return getContextPath(request) + PATH_SEPERATOR + CSS_ROOT;
	}

}
