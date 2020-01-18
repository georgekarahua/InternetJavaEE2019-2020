package gr.hua.dit.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gr.hua.dit.consumer.ApiConsumer;
import gr.hua.dit.entities.Student;
import gr.hua.dit.entities.User;
import gr.hua.dit.security.UserDAO;


@Controller
public class LoginController {
	
	@GetMapping("/")
	@Transactional
	public String index(Model model, Principal principal) {
		Student s = ApiConsumer.getStudentInfo(principal.getName());
		System.out.println("APP_ID " + s.getApplication().getId());
		model.addAttribute("welcomemessage", "Welcome " + s.getFirstName() + " " + s.getLastName());
		model.addAttribute("student", s);
		return "finaletoStudent";
	}

	@GetMapping("/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout=true";
	}
}
