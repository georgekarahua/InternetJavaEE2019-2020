package gr.hua.dit.controllers;

import java.security.Principal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gr.hua.dit.consumer.ApiConsumer;
import gr.hua.dit.entities.Form;
import gr.hua.dit.entities.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
/** 
 * lstudentInfo
 * updateStudentInfo
 * 
 * lApplicationForm
 * sumbitForm
 * 
 * showRanking
 * */
	/**Functions for listing/updating Student Info*/
	@GetMapping("/lstudentInfo")
	public String showStudentInfo(Model model, Principal principal) {
		System.out.println(principal.getName());
		//Get logged In student info
		Student s = ApiConsumer.getStudentInfo(principal.getName());
		
		model.addAttribute("student", s);
		
		return "finaletoStudentInfo";
	}
	
	@RequestMapping(value = "/updateStudentInfo", method = RequestMethod.POST)
	public String activateStudent(Principal principal, Student stud_in) {
		//Student Info to be send
		System.out.println(stud_in.getPhone());
		System.out.println(stud_in.getLastName());
		System.out.println(stud_in.getFirstName());

		ApiConsumer.updateStudentInfo(principal.getName(), stud_in);
		
		return "redirect:/student/lstudentInfo";
	}
	
	/**Functions for listing/updating Student Info*/
	@GetMapping("/lapplicationForm")
	public String showApplicationForm(Model model, Principal principal) {
		System.out.println(principal.getName());
		//Get logged In student info
//		Student s = ApiConsumer.getStudentInfo(principal.getName());
		
//		model.addAttribute("student", s);
		
		return "finaletoStudentForm";
	}
	
	@RequestMapping(value = "/makeApplicationForm", method = RequestMethod.POST)
	public String sumbitApplicationForm(Principal principal, Form form) {
		System.out.println(principal.getName());
		//Param to be send to Intranet
//		//Student Info to be send
		System.out.println(form.getAnnualIncome());
		System.out.println(form.getResdence());
		System.out.println(form.getSiblingStudents());
		System.out.println(form.isParentalStatus());

		ApiConsumer.sumbitStudentForm(principal.getName(), form);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/showStudentRanking")
	public String showStudentRanking(Model model, Principal principal) {
		System.out.println(principal.getName());
		//Get logged In student info
		Map<String,Integer> s = ApiConsumer.showRanking(principal.getName());
		
		Collection<String> output = s.keySet();
		Collection<Integer> ranking = s.values();
		Iterator<String> i = output.iterator();
		Iterator<Integer> y = ranking.iterator();
//		System.out.println(i.next());
//		System.out.println(y.next());
		
		model.addAttribute("output", i.next());
		model.addAttribute("ranking", y.next());
		return "finaletoStudentResult";
	}
}
