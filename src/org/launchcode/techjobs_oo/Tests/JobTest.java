package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import org.junit.Assert;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

public class JobTest {

    Job job_1;
    Job job_2;

    @Before
    public void createJobObjects() {
        job_1 = new Job ();
        job_2 = new Job ();
    }

    //TODO: In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.
    @Test
    public void testSettingJobId(){
        //TODO Use assertEquals, assertTrue, or assertFalse to test that the
        // ID values for the two objects are NOT the same and differ by 1.
        Assert.assertTrue(job_1.getId() != job_2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Declare and initialize a new Job object
       Job job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        //Use assert statements to test that the constructor correctly assigns the class and value of each field.
        String expectedName = "Product tester";

        Assert.assertEquals(expectedName, job_3.getName());

        Assert.assertTrue(job_3.getEmployer() instanceof Employer);
        Assert.assertTrue(job_3.getLocation() instanceof Location);
        Assert.assertTrue(job_3.getPositionType() instanceof PositionType);
        Assert.assertTrue(job_3.getCoreCompetency() instanceof CoreCompetency);

        String expectedEmployerValue = "ACME";
        Assert.assertEquals(expectedEmployerValue, job_3.getEmployer().getValue());

        String expectedLocationValue = "Desert";
        Assert.assertEquals(expectedLocationValue, job_3.getLocation().getValue());

        String expectedPositionTypeValue = "Quality control";
        Assert.assertEquals(expectedPositionTypeValue, job_3.getPositionType().getValue());

        String expectedCoreCompetencyValue = "Persistence";
        Assert.assertEquals(expectedCoreCompetencyValue, job_3.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality() {
        Job job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job_5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(job_4.equals(job_5));
    }

    



}
