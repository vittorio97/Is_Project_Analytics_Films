package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAuthenticationManager.class, TestFilmManager.class, TestReviewManager.class,
		TestSearchManager.class, TestStatisticsManager.class, TestUserManager.class })
public class AllTests {

}
