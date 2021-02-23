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
    Job job_3;
    Job job_4;
    Job job_5;

    @Before
    public void createJobObjects() {
        job_1 = new Job ();
        job_2 = new Job ();
        job_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(null), new CoreCompetency("Persistence"));

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
        Assert.assertFalse(job_3.equals(job_4));
    }

    //When passed a Job object, it should return a string that contains a blank line before
    // and after the job information.
    @Test
    public void testShouldReturnBlankLineBeforeAndAfterJobInfo() {
        job_3.toString().startsWith("\n");
        job_3.toString().endsWith("\n");
    }

    @Test
    public void testToStringShouldReturnFieldsOnOwnLine() {
        String actual = job_3.toString();
        Assert.assertEquals("\nID: "+ job_3.getId() +"\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", actual);
    }

    @Test
    public void testToStringIfFieldIsEmpty() {
        String actual = job_5.toString();
        Assert.assertEquals("\nID: " +job_5.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Data not available\nCore Competency: Persistence\n", actual);
    }

    @Test
    public void testToStringAllFieldsEmptyExceptId() {
        String actual = job_1.toString();
        Assert.assertEquals("\nOOPS! This job does not seem to exist.\n", actual);
    }


}
