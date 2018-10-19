package org.wecancodeit.reviewsitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Category categoryOne = new Category("Pilsner", "Light, cheap beer");
		Category categoryTwo = new Category("IPA", "Hoppy, sweet and bitter.");
		Category categoryThree = new Category("Sour", "Light, fizzy and tart. And, GROSS.");
		Category categoryFour = new Category("Stout", "Dark, heavy and foamy. Very filling.");

		categoryRepo.save(categoryOne);
		categoryRepo.save(categoryTwo);
		categoryRepo.save(categoryThree);
		categoryRepo.save(categoryFour);

		Reviews reviewsOne = new Reviews("Budweiser", "King of Generic Beers", categoryOne);
		Reviews reviewsTwo = new Reviews("Miller Lite", "Watery, fizzy low-cal beer", categoryOne);
		Reviews reviewsThree = new Reviews("Rhinegeist Truth ", "Very popular Cincinnati, Ohio beer", categoryTwo);
		Reviews reviewsFour = new Reviews("Elvis Juice", "Grapefruit IPA. Good but pricey", categoryTwo);
		Reviews reviewsFive = new Reviews("Hi-Wire Gose", "Salty and sour.", categoryThree);
		Reviews reviewsSix = new Reviews("Wicked Weed Serenity",
				"Mimics the flavor of New Zealand Sauvigon Blanc wine.", categoryThree);
		Reviews reviewsSeven = new Reviews("Guiness Stout", "Classic, popluar stout from Ireland", categoryFour);
		Reviews reviewsEight = new Reviews("Left-Hand Milk Stout", "Creamy and very popular.", categoryFour);

		reviewRepo.save(reviewsOne);
		reviewRepo.save(reviewsTwo);
		reviewRepo.save(reviewsThree);
		reviewRepo.save(reviewsFour);
		reviewRepo.save(reviewsFive);
		reviewRepo.save(reviewsSix);
		reviewRepo.save(reviewsSeven);
		reviewRepo.save(reviewsEight);

	}

}
