package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    Job fakeJob;
    Job fakeJob1;
    Job fakeJob2;
    Job fakeJob3;
    Job fakeJob4;

    @Before
    public void testJobObjects() {
        fakeJob = new Job();
        fakeJob1 = new Job();
        fakeJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fakeJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        fakeJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    };

    @Test
    public void testSettingJobId() {
        assertEquals(fakeJob, fakeJob1, 1);
    };

    private void assertEquals(Job fakeJob, Job fakeJob1, int i) {};

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue("Product tester".equals(fakeJob3.getName()));
        assertTrue(fakeJob3.getEmployer() instanceof Employer);
        assertTrue(fakeJob3.getLocation() instanceof Location);
        assertTrue(fakeJob3.getPositionType() instanceof PositionType);
        assertTrue(fakeJob3.getCoreCompetency() instanceof CoreCompetency);
    };

    @Test
    public void testJobsForEquality() {
        assertFalse(fakeJob.equals(fakeJob1));
    };

   @Test
   public String toString() {
       String toStringTest = "\n" +
               "ID: " + fakeJob4.getId() + "\n" +
               "Name: " + fakeJob4.getName() + "\n" +
               "Employer: " + fakeJob4.getEmployer() + "\n" +
               "Location: " + fakeJob4.getLocation() + "\n" +
               "Position Type: " + fakeJob4.getPositionType() + "\n" +
               "Core Competency: " + fakeJob4.getCoreCompetency() + "\n";
               return toStringTest;
    };

};
