import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LengthServlet")
public class LengthServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Length length = createLengthFromRequest(request);
        calcLength(length);
        sendCalculations(length, response);
    }

    private Length createLengthFromRequest(HttpServletRequest request) {
        String meters = request.getParameter("meters");
        String centimeters = request.getParameter("centimeters");
        String millimeters = request.getParameter("millimeters");
        Length length = new Length();
        length.setMeters(meters);
        length.setCentimeters(centimeters);
        length.setMillimeters(millimeters);
        return length;
    }


    private void calcLength(Length length) {
        CalcLength calcLength = new CalcLength();
        calcLength.calcMeters(length);
    }

    private void sendCalculations(Length length, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<h1>Podana wartosc w przeliczeniu na:</h1><br>");
        writer.println("<h2>metry: " + length.getMeters() + "</h2><br>");
        writer.println("<h2>centymetry: " + length.getCentimeters() + "</h2><br>");
        writer.println("<h2>milimetry: " + length.getMillimeters() + "</h2><br>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
