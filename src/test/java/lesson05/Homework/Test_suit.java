package lesson05.Homework;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses ({LoginTest.class, SearchTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_suit{}