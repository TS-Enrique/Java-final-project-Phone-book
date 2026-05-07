package phoneStates;

public class NewYorkPhoneBook extends PhoneBook{
    private static final int[] NY_CODES = {
        212, 315, 332, 347, 516, 
        518, 585, 607, 631, 646, 
        716, 718, 845, 914, 917, 929
    };

    public NewYorkPhoneBook(int areaCode, int remDigits, String name, String job) { 
        super(areaCode, remDigits, name, job); 
    }

    @Override
    protected void validateAreaCode(int areaCode) {
        for (int code : NY_CODES) if (code == areaCode) return;
        throw new IllegalArgumentException("Invalid New York area code");
    }

    @Override
    public void WhereFrom() {
        String info = formatPhoneNumber() + " — " + getName() + " (" + getJob() + ") ";
        switch (getAreaCode()) {
            case 212: case 646: case 332: 
                System.out.println(info + "lives in Manhattan, New York"); break;
            case 718: case 347: case 929: 
                System.out.println(info + "lives in Brooklyn/Queens, New York"); break;
            case 518: 
                System.out.println(info + "lives in Albany, New York"); break;
            default: 
                System.out.println(info + "lives in New York");
        }
    }
}

