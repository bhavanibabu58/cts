package cts.tm.controller;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cts.tm.pojo.LoginPojo;

import cts.tm.pojo.TouristPojo;
import cts.tm.repository.TouristRepository;
import cts.tm.service.LoginService;
import cts.tm.service.TouristService;


@Controller
public class WelcomeController {

	@Autowired
	private TouristService touristService;

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private TouristRepository repo;

	
	@GetMapping("/")
	String frontPage() {

		return "frontpg";
	}
	
	
	@GetMapping("/login")
	String showLoginForm(ModelMap model) {
		
		model.addAttribute("loginPojo", new LoginPojo());
		return "login";
	}
	
	
	@PostMapping(value = "/loginUser")
	public String loginUser( @ModelAttribute("loginPojo") LoginPojo l) {

		System.out.println(l.getUname());
		loginService.save(l);
		return "redirect:welcome";
	}
	
	
	@GetMapping("/welcome")
	String welcomePage() {

		return "welcome";
	}
		
	@GetMapping("/showCustomerForm")
	String showCustomerForm(ModelMap model)
	{
		model.addAttribute("touristPojo", new TouristPojo());
		return "touristForm";
	}

	@PostMapping(value = "/registerCompany")
	public String registerCompany( @ModelAttribute("touristPojo") TouristPojo c) {

		System.out.println(c.getCname());

		

		touristService.save(c);

		return "redirect:listCompany";
	}

	@GetMapping(value = "/listCompany")
	public String listCompany(ModelMap model) {

		List<TouristPojo> touristPojoList = touristService.list();
		model.addAttribute("touristPojoListObj", touristPojoList);
		model.addAttribute("touristPojo", new TouristPojo());
		return "showTouristList";
	}

	@GetMapping(value = "/showEditForm")
	public String editCustomer(@RequestParam int id, ModelMap model) {

		System.out.println("Value passed com id ..." + id);
		TouristPojo touristPojo = touristService.get(id);
		model.addAttribute("touristPojo", touristPojo);

		return "editCompanyDetails";
	}

	@PostMapping(value = "/editCompanyDetails")
	public String editCustomer(@Valid @ModelAttribute("touristPojo") TouristPojo c,BindingResult br,ModelMap model) {

		if (br.hasErrors()) {
			model.addAttribute("touristPojo", c);
			return "editCompanyDetails";
		}

		touristService.update(c);

		return "redirect:listCompany";
	}

	@GetMapping(value = "/deleteCompany")
	public String deleteCustomer(@RequestParam int id) {

		touristService.deleteTourist(id);

		return "redirect:listCompany";
	}
	
	
	
	@GetMapping("/staymg")
	String staySuccessPage(ModelMap model) {

		List<TouristPojo> touristPojoList = touristService.list();
		model.addAttribute("touristPojoListObj", touristPojoList);
		
		
		return "showStayList";
	}
	
	@GetMapping("/search")
	public ModelAndView search(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("searchpage");
		mv.addObject(touristService.search(id));
		return mv;
	}

	
	@GetMapping("/health")
	String healthPage(ModelMap model) {

		List<TouristPojo> touristPojoList = touristService.list();
		model.addAttribute("touristPojoListObj", touristPojoList);
		
		
		return "health";
	}
	
	// searchBYCompanyName
		@PostMapping(value = "/searchBYCompanyName")
		public String searchBYCompanyName(@Valid @ModelAttribute("touristPojo") TouristPojo c, BindingResult br,
				ModelMap model) {


			List<TouristPojo> touristPojoList = touristService.findByCompName(c.getCname().trim());

			model.addAttribute("touristPojoListObj", touristPojoList);

			return "showTouristList";
		}
	
	
}
