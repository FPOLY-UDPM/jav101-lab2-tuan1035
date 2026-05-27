package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class user extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1. Đặt thông báo chào mừng
        req.setAttribute("message", "Welcome to FPT Polytechnic");

        // 2. Tạo Map chứa thông tin user
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Duong Thanh Tuan");
        map.put("gender", "Male");
        map.put("country", "Việt Nam");

        // 3. Đưa map vào request attribute với tên là "user"
        req.setAttribute("user", map);

        // 4. Chuyển tiếp sang trang page.jsp
        req.getRequestDispatcher("/views/page.jsp").forward(req, resp);
    }
}