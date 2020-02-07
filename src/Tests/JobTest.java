package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

   private static Job fakeJob = new Job();
   private static Job fakeJob1 = new Job();
   private static Job fakeJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
   private static Job fakeJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//   private static Job fakeJob4 = new Job("", new Employer(""), new Location(""),
//           new PositionType(""), new CoreCompetency(""));

   @Test
    public void testSettingJobId() {
        assertFalse(fakeJob.getId() == fakeJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue("Product tester".equals(fakeJob2.getName()));
        assertTrue(fakeJob2.getEmployer() instanceof Employer);
        assertTrue(fakeJob2.getLocation() instanceof Location);
        assertTrue(fakeJob2.getPositionType() instanceof PositionType);
        assertTrue(fakeJob2.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(fakeJob.equals(fakeJob1));
    }

    @Test
    public void testingSpaceBetweenJobElements() {
        String test_string = fakeJob3.toString();
        assertTrue(test_string.startsWith("\n"));
        assertTrue(test_string.endsWith("\n"));
    }

    @Test
    public void testToMakeSureTheCorrectValuesMatchTheFieldsPrinted() {
        String test_string = "\nID: 4\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPositionType: Quality control\nCoreCompetency: Persistence\n";
        String test_string2 = fakeJob3.toString();
        assertEquals(test_string, test_string2);
    }

//    @Test
//    public void testToSeeIfThereIsOnlyAnIDFieldAndNoOthersFieldsPresent() {
//       String test_string = "\nID: 5\nName: Data is not available.\nEmployer: Data is not available.\nLocation: Data is not available.\nPositionType: Data is not available.\nCoreCompetency: Data is not available.\n";
//       String test_string2 = fakeJob4.toString();
//       assertEquals(test_string, test_string2);
//    }



}
