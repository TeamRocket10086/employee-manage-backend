package applicationform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Employee());
    }
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("SpringWeb")Employee employee,

                             ModelMap model) {
        model.addAttribute("firstname", employee.getfirstName());
        model.addAttribute("lastname", employee.getLastName());
        model.addAttribute("address", employee.getAddress());

        return "result";
    }
}
