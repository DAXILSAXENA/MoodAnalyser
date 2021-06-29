package com.bridgelabz.MoodAnalyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void testMoodAnalysis() throws Exception {
		MoodAnalyser moodanalyser = new MoodAnalyser();

		String mood = moodanalyser.analyseMood("This is a sad message");

		Assert.assertThat(mood, CoreMatchers.is("SAD"));

	}

}
