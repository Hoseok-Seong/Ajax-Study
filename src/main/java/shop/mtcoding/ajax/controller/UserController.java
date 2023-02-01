package shop.mtcoding.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.ajax.dto.ResponseDto;

@Controller
public class UserController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @GetMapping("/user/usernameSameCheck") // 스프링에서 오류가 안난다면 200만 응답하는 것이 기본 전략
    public @ResponseBody ResponseDto<?> check(String username) {
        if (username == null || username.isEmpty()) {
            return new ResponseDto<>(-1, "username 쿼리 스트링을 전달해주세요", null);
        }

        if (username.equals("ssar")) {
            return new ResponseDto<>(1, "동일한 username이 존재합니다", false);
        } else {
            return new ResponseDto<>(1, "해당 username으로 회원가입이 가능합니다", true);
        }
    }
}
