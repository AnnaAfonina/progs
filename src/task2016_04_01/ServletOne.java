package task2016_04_01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;

public class ServletOne extends HttpServlet {
    private int i = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedWriter writer = new BufferedWriter(response.getWriter());
        i++;
        writer.write(i);
        writer.flush();
    }
}
