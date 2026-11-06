package com.wanted.moneybeetle.domain.member.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/* comment.
*   담당 : SCM (회원·공통)
*   GET    /api/v1/agreements, /auth/check-email, /auth/check-nickname
*   POST   /api/v1/auth/signup, /auth/instructor-signup
*   GET    /api/v1/members/me, /members/{memberId}/profile
*   PATCH  /api/v1/members/me, /members/me/password
*   POST   /api/v1/members/me/profile-image
*   DELETE /api/v1/members/me (탈퇴)
*   화면 : /signup, /instructor/signup, /user/my-page(설정·탈퇴 탭)
*  */
@Controller
public class MemberController {

    @GetMapping("/test")
    public ModelAndView test(ModelAndView mv) {
        System.out.println("dd");
        System.out.println("dd");

        return mv;
    }

}
