package jsh.servlet.web.frontcontroller.v2.controllerV2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jsh.servlet.web.frontcontroller.MyView;
import jsh.servlet.web.frontcontroller.v2.ControllerV2;

import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
