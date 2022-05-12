package com.githrd.whistle.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.githrd.whistle.controller.BlpInter;

public class JoinForm implements BlpInter {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = "/member/join";
		// 세션 검사를 하고
		if(req.getSession().getAttribute("SID") != null) {
			// 로그인 한 경우
			// 리다이렉트 셋팅
			req.setAttribute("isRedirect", true);
			// 요청주소 반환하고
			return "/whistle/main.blp";
		}
		
		return view;
	}

}
