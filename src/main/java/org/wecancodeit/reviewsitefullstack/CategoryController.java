package org.wecancodeit.reviewsitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

	@Resource
	CategoryRepository categoryRepo;

	@GetMapping("/categories/{id}")
	public String getCategory(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(id);
		model.addAttribute("category", categoryRepo.findById(id).get());
		return "category";
	}

}
