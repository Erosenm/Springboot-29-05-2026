package x1y2z3.a1b2c3.Controllers;
import x1y2z3.a1b2c3.Tools.A1B2C3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Z9Y8X7 {

    @GetMapping("/")
    public String a1() {
        return "Sistema X1Y2Z3 funcionando";
    }

    @GetMapping("/expresion")
    public String b2(
            @RequestParam String p1
    ) {

        String p2 =
                A1B2C3.c1(p1);

        double p3 =
                A1B2C3.c2(p2);

        return "Infix: " + p1 +
                "\nPostfix: " + p2 +
                "\nResultado: " + p3;
    }
}
