package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class JobTest {

    Job fakeJob;
    Job fakeJob2;

    @Before
    public void testJobObjects() {
        fakeJob = new Job();
        fakeJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(fakeJob, fakeJob2, 1);


    }

    private void assertEquals(Job fakeJob, Job fakeJob2, int i) {
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue("Product tester".equals(testJob.getName()));
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {

    }


}
