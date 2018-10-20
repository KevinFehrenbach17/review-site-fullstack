package org.wecancodeit.reviewsitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@GetMapping("/reviews/{id}")
	public String getReview(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(id);
		model.addAttribute("review", reviewRepo.findById(id).get());
		return "review";
	}
}
