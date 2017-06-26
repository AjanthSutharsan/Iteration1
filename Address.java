public class Address implements Comparable<Address>    //public keyword means class is available to other classes in this program
{
    // attributes (variables that each instance is given a set of), private meaning accesible only within the declared class itself
    private String forename;
    private String surname;
    private String addressLine1;
    private String addressLine2;
    private String townCity;
    private String county;
    private String postCode;

    //constructor method 
    public Address(String forename, String surname, String addressLine1, String addressLine2, String townCity, String county, String postCode) 
    {        
        this.forename = forename;
        this.surname = surname;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.townCity = townCity;
        this.county = county;
        this.postCode = postCode;
    }

    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.forename + ", " + this.surname + ", " +this.addressLine1 + ", " +   this.addressLine2 + ", " + this.townCity + ", " + this.county + ", " + this.postCode;
    }

    @Override   
    public int compareTo(Address other) 
    {
        return this.forename.compareTo(other.forename);
    }
    //methods - getters and setters

    public String getForename() {return forename;}
    
    public String getSurname() {return surname;}
    
    public String getaddressLine1() {return addressLine1;}

    public String getaddressLine2() {return addressLine1;}
    
    public String getTownCity() {return townCity;}
    
    public String getCounty() {return county;}
    
    public String getPostCode() {return postCode;}

    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself

    public void setForename(String forename){this.forename = forename;}
    
    public void setSurname(String surname){this.surname = surname;}
    
    public void setAddressLine1(String addressLine1){this.addressLine1 = addressLine1;}

    public void setAddressLine2(String addressLine2){this.addressLine2 = addressLine2;}
    
    public void setTownCity(String townCity){this.townCity = townCity;}
    
    public void setCounty(String county){this.county = county;}
    
    public void setPostCode(String postCode){this.postCode = postCode;}
}