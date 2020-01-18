package gr.hua.dit.consumer;

import java.util.Map;

import org.springframework.web.client.RestTemplate;

import gr.hua.dit.entities.Form;
import gr.hua.dit.entities.Student;

public class ApiConsumer {
	private static String uri = "http://localhost:8080/IntranetHua/api/student/";
	public static Student getStudentInfo(String username) {
		String url = uri + username;
		System.out.println(url);
		
	    RestTemplate restTemplate = new RestTemplate();
	    Student result = restTemplate.getForObject(url, Student.class);
	    System.out.println(result.isActivated());
	    System.out.println(result.getApplication().getPoints());
	    return result;
	}
	public static void updateStudentInfo(String username, Student s) {
		String url = uri + username;
		System.out.println(url);
		
	    RestTemplate restTemplate = new RestTemplate();
//	    Student result = restTemplate.getForObject(url, Student.class);
	    restTemplate.put(url, s, username);
	}
	
	public static void sumbitStudentForm(String username, Form f) {
		String url = uri + "/application/" + username;
		System.out.println(url);
		
	    RestTemplate restTemplate = new RestTemplate();
//	    Student result = restTemplate.getForObject(url, Student.class);
	    restTemplate.put(url, f, username);
	}
	
	public static Map<String,Integer> showRanking(String username) {
		String url = uri + "/getRanking/" + username;
		System.out.println(url);
		
	    RestTemplate restTemplate = new RestTemplate();
//	    Student result = restTemplate.getForObject(url, Student.class);
	    @SuppressWarnings("unchecked")
		Map<String,Integer> x = restTemplate.getForObject(url, Map.class);
	    return x;
	}
}
