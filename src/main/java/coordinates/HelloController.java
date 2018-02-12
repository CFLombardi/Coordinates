package coordinates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

@Controller
public class HelloController {

  @GetMapping("/coordinates")
  public String showForm(Model model) {
    model.addAttribute("inputCoords", new Coords());
    return "coords";
  }

  @PostMapping("/coordinates")
  public String submitForm(@ModelAttribute("inputCoords") Coords inputCoords) {
    inputCoords.convertCoords();
    return "result";
  }
}
