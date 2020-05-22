class EstonianID implements PersonalCodeBehaviour {

    private String isikukood;
    private String[] idArray;
    private String aasta;
    private String year;
    private String month;
    private String day;
    private String gender;
    

    EstonianID(String isikukood) {
        this.isikukood = isikukood;
        idArray = isikukood.split("", -1);
        if(idArray[0].equals("1") || idArray[0].equals("2") ){
            aasta = "18";
        } else if(idArray[0].equals("3") || idArray[0].equals("4")){
            aasta = "19";
        } else if(idArray[0].equals("5") || idArray[0].equals("6")){
            aasta = "20";
        }

        }
    

    public String getBirthday() {
        getDay();
        getMonth();
        getYear();
        return (day + "-" + month + "-" + year);
    }

    public String getYear() {
        year = aasta + idArray[1] + idArray[2];
        return year;
    }

    public String getMonth() {
        month = idArray[3] + idArray[4];
        return month;
    }

    public String getDay() {
        day = idArray[5] + idArray[6];
        return day;
    }

    public String getGender() {
        if(idArray[0].equals("1")){
            gender = "Male";
        } else if (idArray[0].equals("2")) {
            gender = "Naine";
        } else if(idArray[0].equals("3")) {
            gender = "Mees";
        } else if(idArray[0].equals("4")) {
            gender = "Naine";
        } else if(idArray[0].equals("5")) {
            gender = "Mees";
        } else if(idArray[0].equals("6")){
            gender = "Naine";
        } else {
            gender = "";
        }
        
        return ("Sugu: " + gender);

    }

    

}


class FinnishID implements PersonalCodeBehaviour {

    private String isikukood;
    private String[] idArray;
    private String aasta;
    private String year;
    private String month;
    private String day;
    private String gender;
    

    FinnishID(String isikukood) {
        this.isikukood = isikukood;
        idArray = isikukood.split("", -1);
        if(idArray[6].equals("+") ){
            aasta = "18";
        } else if(idArray[6].equals("-")){
            aasta = "19";
        } else if(idArray[6].equals("A")){
            aasta = "20";
        }

        }
    

    public String getBirthday() {
        getDay();
        getMonth();
        getYear();
        return (day + "-" + month + "-" + year);
    }

    public String getYear() {
        year = aasta + idArray[4] + idArray[5];
        return year;
    }

    public String getMonth() {
        month = idArray[2] + idArray[3];
        return month;
    }

    public String getDay() {
        day = idArray[0] + idArray[1];
        return day;
    }

    public String getGender() {
        if(Integer.parseInt(idArray[9]) % 2 != 0){
            gender = "Mees";
        } else if (Integer.parseInt(idArray[9]) % 2 == 0) {
            gender = "Naine";
        } else {
            gender = "";
        }
        
        return ("Sugu: " + gender);

    }

    

}