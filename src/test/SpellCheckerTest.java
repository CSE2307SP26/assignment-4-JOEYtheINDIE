package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

	@Test
	void testSpellCheckerNumOfWords() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();


		//A spellchecker should be able to tell us how many words it currently knows about

		//2. call method to be tested
		int words = checker.getNumberOfWords();

		//3. Use assertion to validate
		assertEquals(0, words);
	}

	void testAddWord() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//The number of words a spellchecker knows about should go up by one whenever a new word is added
		
		//4. call method to be tested
		checker.addWord("hello");

		//5. use assertion to validate
		assertEquals(1, checker.getNumberOfWords());
	}

	void testAlreadyAddedWord() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//If a word is added that is already contained in the spellchecker, then the number of words contained in the spellchecker should not change
		
		//6. call method to be tested
		checker.addWord("hello");

		//7. use assertion to validate
		assertEquals(1, checker.getNumberOfWords());
	}

	void testCheckSpelling() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//A spellchecker should be able to accept a properly spelled word and return an indication that it is properly spelled
		
		//8. call method to be tested
		checker.checkSpelling("hello");

		//9. use assertion to validate
		assertTrue(checker.checkSpelling("hello"));		
	}

	void testCheckIncorrectSpelling() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//A spellchecker should be able to accept an improperly spelled word and return an indication that it is improperly spelled
		
		//10. call method to be tested
		checker.checkSpelling("helro");

		//11. use assertion to validate
		assertFalse(checker.checkSpelling("helro"));
	}

	void testSpellCheckerCaseInsensitive() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//A spellchecker should ignore case when checking how words are spelled (i.e. "cat" and "CaT" are both properly spelled as long as "cat" (or "Cat" or "caT", etc.) appears in our spellchecker.

		//12. call method to be tested
		checker.checkSpelling("HeLlO");

		//13. use assertion to validate
		assertTrue(checker.checkSpelling("HeLlO"));
	}

	void testInCorrectSpelling() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//A spellchecker should be able to recommend a properly spelled word for any String that it is given. In other words, if I were to input the String "bamk", the spell checker could suggest that the word "bank" is properly spelled, meaning that the word "bank" is the alphabetically closest word in the spellchecker to the given String "bamk"

		//14. call method to be tested
		checker.correctSpelling("helro");

		//15. use assertion to validate
		assertEquals("hello", checker.correctSpelling("helro"));
	}

	void testCorrectSpelling() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//If we ask the spellchecker to suggest a properly spelled word for a String that is already properly spelled, it should simply return the original word.

		//16. call method to be tested
		checker.correctSpelling("hello");

		//17. use assertion to validate
		assertEquals("hello", checker.correctSpelling("hello"));
	}

	void testCheckHyphenatedWord() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//Personal Feature 1

		//18. call method to be tested
		checker.checkhyphenatedWord("spell-checker");

		//19. use assertion to validate
		assertTrue(checker.checkhyphenatedWord("spell-checker"));
	}

	void testCheckPrefix() {
		//1. create object to be tested
		SpellChecker checker = new SpellChecker();

		//Personal Feature 2

		//20. call method to be tested
		checker.checkprefix("unhappy");

		//21. use assertion to validate
		assertTrue(checker.checkprefix("unhappy"));
	}


}
