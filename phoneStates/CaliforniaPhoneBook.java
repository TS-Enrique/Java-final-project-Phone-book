package phoneStates;

public class CaliforniaPhoneBook extends PhoneBook {
    private static final int[] CA_CODES = {
        209, 213, 310, 323, 408, 415, 424, 
        510, 530, 559, 562, 619, 626, 650, 
        661, 707, 714, 747, 760, 805, 818, 
        831, 858, 909, 916, 925, 949, 951
    };

    public CaliforniaPhoneBook(int areaCode, int remDigits, String name, String job){ 
        super(areaCode, remDigits, name, job); 
    }

    @Override
    protected void validateAreaCode(int areaCode) {
        for (int code : CA_CODES) if (code == areaCode){
            return;
        } 
        throw new IllegalArgumentException("Invalid California area code");
    }

    @Override
    public void WhereFrom() {
        String info = formatPhoneNumber() + " — " + getName() + " (" + getJob() + ") ";
        switch (getAreaCode()) {
            case 213: case 310: case 323: 
                System.out.println(info + "lives in Los Angeles, California"); 
                break;
            case 415: case 628: 
                System.out.println(info + "lives in San Francisco, California"); 
                break;
            case 916:
                System.out.println(info + "lives in Sacramento, California"); 
                break;
            default: 
                System.out.println(info + "lives in California");
        }
    }
}