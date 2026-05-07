package phoneStates;

public abstract class PhoneBook{

    private int areaCode;
    private int remDigits;
    private String name;
    private String job;

    public PhoneBook(int areaCode, int remDigits, String name, String job){
        setAreaCode(areaCode);
        setRemDigits(remDigits);
        setName(name);
        setJob(job);
    }

    public void setAreaCode(int areaCode){
        validateAreaCode(areaCode);
        this.areaCode = areaCode;
    
    }

    protected void validateAreaCode(int areaCode) {
        if (areaCode < 100 || areaCode > 999) {
            throw new IllegalArgumentException("Area code must be 3 digits");
        }
    }

    public void setRemDigits(int remDigits){
        validateRemDigits(remDigits);
        this.remDigits = remDigits;
    }

    protected void validateRemDigits(int remDigits){
    //1_000_000 smallest 7 digit and 9_999_999 largest 7 digit
        if (remDigits < 1_000_000 || remDigits > 9_999_999) {
        throw new IllegalArgumentException("Remaining digits must be exactly 7 digits");
        }
    }

    public void setName(String name){
        validateName(name);
        this.name = name;
    }

    protected void validateName(String name){
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    public void setJob(String job){
        validateJob(job);
        this.job = job;
    }

    protected void validateJob(String job){
        if(job.isEmpty()){
            throw new IllegalArgumentException("Job must not be empty");
        }
    }

    public int getAreaCode(){
        return areaCode;
    }

    public int getremDigits(){
        return remDigits;
    }

    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
    }

    //formatting for WhereFrom methods
    public String formatPhoneNumber() {
            String digits = String.format("%07d", getremDigits());
            return "(" + getAreaCode() + ") " 
                + digits.substring(0, 3) + "-" 
                + digits.substring(3);
    }

    public abstract void WhereFrom();
}