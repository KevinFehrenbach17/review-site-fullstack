package org.wecancodeit.reviewsitefullstack;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
//*  CONFIRMTHIS  Is this name correct
import org.wecancodeit.reviewsitefullstack.CategoryController;

@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
public class CategoryControllerTest {

	/*
	 * @Autowired - a Spring annotation that will find you a version of whatever you
	 * specify and inject that dependency.
	 * 
	 */
	@Autowired
	private MockMvc mockMvc;

	/*
	 * Remember we are mocking Springs MVC structure.
	 * 
	 * Which is to say we are using a fake version of Spring MVC so we can isolate
	 * our tests to just the @Controller we're creating
	 * 
	 */

	@Test
	public void shouldBeOkWhenAccessingReviewss() throws Exception {
		// Arrange - Grab mockMvc
		mockMvc
				// Act - Perform the Mock request to localhost:8080/reviews
				.perform(get("/reviews"))
				// Assert - Assert that we got back a 2xx HTTP status
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnReviewsTemplateWhenAccessingReviews() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/reviews"))
				// Assert
				.andExpect(view().name("reviews"));
	}

	@Test
	public void shouldBeOkWhenAccessingReview() throws Exception {
		// Arrange - Grab mockMvc
		mockMvc
				// Act - Perform the Mock request to localhost:8080/reviews
				.perform(get("/reviews/1"))
				// Assert - Assert that we got back a 2xx HTTP status
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnReviewTemplateWhenAccessingReviews() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/reviews/1"))
				// Assert
				.andExpect(view().name("review"));
	}
}