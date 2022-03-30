package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
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

    public Employee(String firstName, String LastName, String ssn)
    {

        this.firstName = firstName;
        this.firstName = firstName;
        this.ssn = ssn;

    }

    public String getFirstName()
    {

        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSsn()
    {
        return ssn;
    }

    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }

    public boolean hasMetWithHr()
    {
        return metWithHr;
    }

    public boolean hasMetDeptStaff()
    {
        return metDeptStaff;
    }

    public boolean hasReviewedDeptPolicies()
    {
        return reviewedDeptPolicies;
    }

    public boolean hasMovedIn()
    {
        return movedIn;
    }

    public String getCubeId()
    {
        return cubeId;
    }

    public void setCubeId(String cubeId)
    {
        this.cubeId = cubeId;
    }

    public LocalDate getOrientationDate()
    {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate)
    {
        this.orientationDate = orientationDate;
    }


}
