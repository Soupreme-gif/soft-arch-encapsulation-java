package edu.wctc.part2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *
 * 1. Not all methods need to be public
 *
 * 2. When methods need to be called in a certain order you can do this
 * by creating a parent method that calls the other, helper methods.
 *
 * 3. There is some duplicate code used that violates the D.R.Y. principle.
 * Eliminate that by encapsulating the duplicate code in a new method
 * and then call that method in place of the duplicate code.
 *
 * 4. All method parameters should be validated (except booleans).
 *
 * Review the tips in the document Encapsulation Checklist if needed.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public Employee(String firstName, String lastName, String ssn)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
    }

    private void performExtraHiringSteps()
    {
         meetWithHrForBenefitAndSalaryInfo();
         meetDepartmentStaff();
         reviewDeptPolicies();
         moveIntoCubicle(cubeId);
    }

    public void moveIntoANewCubicle(String cubeId)
    {

       String  newCubeId = cubeId;

       moveIntoCubicle(newCubeId);

    }



    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalaryInfo() {
        metWithHr = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with HR on "
                + fmtDate);
    }

    // Assume this must be performed second, and assume that an employee
    // would only do this once, upon being hired.
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with dept staff on "
                + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    private void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " reviewed dept policies on "
                + fmtDate);
    }

    // Assume this must be performed fourth. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    private void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.

    public void setFirstName(String firstName)
    {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("first name is required");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if (lastName == null || lastName.isBlank()) {
            System.out.println("last name is required");
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn)
    {
        if (ssn == null || ssn.length() < 9 || ssn.length() > 11) { // Magic numbers!
            System.out.println("ssn is required and must be "
                    + "between 9 and 11 characters (if hyphens are used)");
        }
        this.ssn = ssn;
    }

    public boolean hasMetWithHr() {
        return metWithHr;
    }

    public boolean hasMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean hasReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean hasMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId)
    {
        if (cubeId == null || cubeId.isBlank()) {
            System.out.println("A cube id is required to be entered");
        }
        this.cubeId = cubeId;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        this.orientationDate = orientationDate;
    }
}
