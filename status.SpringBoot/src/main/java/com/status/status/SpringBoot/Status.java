package com.status.status.SpringBoot;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Status {

	@GetMapping("/sbb/jbk/{jbk}")
	public List<Empdtls> showEmp( @PathVariable("jbk")String jbk) {

		if (jbk.equalsIgnoreCase("ACTIVE")) {
			Empdtls op = new Empdtls(
			101,"Shubham","1234567891","The Kiran Academy","Active"," 9:45 am","Bhushan","11:45","Rahul");

			return Collections.singletonList(op);
		} else if (jbk.equalsIgnoreCase("INACTIVE")) {
			Empdtls jp = new Empdtls(
			105,"Vaibhav","1654864646","The Kiran Academy","Deactive"," 5:50 am","Rahul","11:45","Swapnil");

			return Collections.singletonList(jp);
		}
		else {
			return Collections.emptyList();
		}

	}
}
