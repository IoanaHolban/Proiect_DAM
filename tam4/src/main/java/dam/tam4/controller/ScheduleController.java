package dam.tam4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dam.tam4.domain.Schedule;
import dam.tam4.service.ScheduleService;



@Controller
public class ScheduleController {
		
		private final ScheduleService sService;
		
		public ServiceController(ScheduleService sService) {
			this.sService = sService;
		}

		//definim tipul de request si in interiorul metodei create, chemam metoda din service
		@PostMapping("/schedule/createSchedule") //terminatie URL
		public void createSchedule(Schedule s){
			sService.addSchedule(s);
		}

		@GetMapping("/schedule/getAllSchedules")
		public ModelAndView getAllSchedules() {
			ModelAndView mv = new ModelAndView("schedule");
			List<Schedule> schedules = new ArrayList<>();
			mv.addObject("schedules", schedules);
			return mv;
		}
		@GetMapping("/schedule/getSchedule")
		public ModelAndView getSchedule(@RequestParam(name = "id") Long id){
			return null;
		}
}
