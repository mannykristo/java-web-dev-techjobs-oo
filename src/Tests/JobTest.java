package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {

   Job fakeJob = new Job();
   Job fakeJob1 = new Job();
   Job fakeJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
   Job fakeJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
   Job fakeJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testJobObjects() {
        fakeJob = new Job();
        fakeJob1 = new Job();
        fakeJob2 = new Job();
        fakeJob3 = new Job();
        fakeJob4 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(fakeJob.getId() == fakeJob1.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue("Product tester".equals(fakeJob3.getName()));
        assertTrue(fakeJob3.getEmployer() instanceof Employer);
        assertTrue(fakeJob3.getLocation() instanceof Location);
        assertTrue(fakeJob3.getPositionType() instanceof PositionType);
        assertTrue(fakeJob3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(fakeJob.equals(fakeJob1));
    }

    @Test
    public void testingSpaceBetweenJobElements() {
        String test_string = "\nID: 10\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPositionType: Quality control\nCoreCompetency: Persistence\n";
        String test_string2 = fakeJob4.toString();
        assertEquals(test_string, test_string2);
    }

}
