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
        assertFalse(fakeJob.getId() == fakeJob1.getId());
    };


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
    public void testingSpaceBetweenJobElements() {
        assertTrue(fakeJob4.toString().contains("Name: Product tester\n"));
        assertTrue(fakeJob4.toString().contains("Employer: ACME\n"));
        assertTrue(fakeJob4.toString().contains("Location: Desert\n"));
        assertTrue(fakeJob4.toString().contains("PositionType: Quality control\n"));
        assertTrue(fakeJob4.toString().contains("CoreCompetency: Persistence\n"));
    };

};
