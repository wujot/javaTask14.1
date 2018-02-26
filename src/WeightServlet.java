import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/WeightServlet")
public class WeightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Weight weight = createWeightFromRequest(request);
        calcWeight(weight);
        sendCalculations(weight, response);

    }

    private Weight createWeightFromRequest(HttpServletRequest request) {
        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String milligrams = request.getParameter("milligrams");
        Weight weight = new Weight();
        weight.setKilograms(kilograms);
        weight.setGrams(grams);
        weight.setMilligrams(milligrams);
        return weight;
    }

    private void calcWeight(Weight weight) {
        CalcWeight calcWeight = new CalcWeight();
        calcWeight.calcKilograms(weight);
    }

    private void sendCalculations(Weight weight, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.print("<h1>Podana wartosc w przeliczeniu na:</h1><br>");
        writer.println("<h2>kilogramy: " + weight.getKilograms() + "</h2><br>");
        writer.println("<h2>gramy: " + weight.getGrams() + "</h2><br>");
        writer.println("<h2>milligramy: " + weight.getMilligrams() + "</h2><br>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
