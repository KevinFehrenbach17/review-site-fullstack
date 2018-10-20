package org.wecancodeit.reviewsitefullstack;
//*  CONFIRMTHIS this needs a correct

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

//public class CategoryRepositoryTest {
//
//	private CategoryRepository categoryRepo = new CategoryRepository();
//	
//	@Test
//	public void shouldAcceptCategory() {
//		//Arrange
//		Category categoryOne = new Category("Pilsner", "Light, cheap beer");
//		//Act
//		int repoSizeBeforeAdding = categoryRepo.size();
//		categoryRepo.add(categoryOne);
//		int repoSizeAfterAdding = categoryRepo.size();
//		//Assert
//		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
//	}
//	
//	@Test
//	public void findOneShouldReturnOneCategory() {
//		Category categoryOne = new Category("Pilsner", "Light, cheap beer");
//		
//		categoryRepo.add(categoryOne);
//		Category result = categoryRepo.findOne(1L);
//		
//		assertThat(result.getName(), is("Pilsner"));
//	}
//	
//	@Test
//	public void findAllShouldReturnAllCategories() {
//		Category categoryOne = new Category("Pilsner", "Light, cheap beer");
//		Category categoryTwo = new Category("IPA", "Hoppy, sweet and bitter.");
//			
//		categoryRepo.add(categoryOne);
//		categoryRepo.add(categoryTwo);
//		
//		Iterable<Category> result = categoryRepo.findAll();
//		
//		assertThat(result, hasItems(categoryOne, categoryTwo));
//	}
