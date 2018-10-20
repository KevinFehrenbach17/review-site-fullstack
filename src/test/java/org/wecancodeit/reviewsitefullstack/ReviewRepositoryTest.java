package org.wecancodeit.reviewsitefullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
//*  CONFIRMTHIS this needs a correct

public class ReviewRepositoryTest {

	private ReviewRepository reviewRepo;

//	@Test
//	public void shouldAcceptReview() {
//		//Arrange
//		Reviews reviewOne = new Reviews("Budweiser", "King of Generic Beers", 1L);
//		//Act
//		int repoSizeBeforeAdding = reviewRepo.size();
//		reviewRepo.add(reviewOne);
//		int repoSizeAfterAdding = reviewRepo.size();
//		//Assert
//		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
//	}
//	
//	@Test
//	public void findOneShouldReturnOneReview() {
//		Reviews reviewOne = new Reviews("Budweiser", "King of Generic Beers", 1L);
//		
//		reviewRepo.add(reviewOne);
//		Category result = reviewRepo.findOne(1L);
//		
//		assertThat(result.getName(), is("Budweiser"));
//	}
//	
//	@Test
//	public void findAllShouldReturnAllReviews() {
//		Reviews reviewOne = new Reviews("Budweiser", "King of Generic Beers", 1L);
//		Reviews reviewTwo = new Reviews("Miller Lite", "Watery, fizzy low-cal beer", 2L);
//			
//		reviewRepo.add(reviewOne);
//		reviewRepo.add(reviewTwo);
//		
//		Iterable<Reviews> result = reviewRepo.findAll();
//		
//		assertThat(result, hasItems(reviewOne, reviewTwo));
//	}
}