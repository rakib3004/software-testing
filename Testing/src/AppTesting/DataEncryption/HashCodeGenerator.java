package AppTesting.DataEncryption;

public class HashCodeGenerator {

    public int getHashValue(String name, String email, String phoneNo, String regNo) {

        boolean hashableState = checkDataValidity(name, email, phoneNo, regNo);

        if (hashableState) {

            String information = reverseAndCombinedData(name, email, phoneNo, regNo);

            int hashValue = calculateHashValue(information);

            return hashValue;

        } else {
            return -1;
        }

    }

    public boolean checkDataValidity(String name, String email, String phoneNo, String regNo) {

        int nameLength = name.length();
        int emailLength = email.length();
        int phoneNoLength = phoneNo.length();
        int regNoLength = regNo.length();

        if ((nameLength > 5 && nameLength < 30) && (emailLength > 12 && emailLength < 35)
                && (phoneNoLength > 9 && phoneNoLength < 14) && (regNoLength > 6 && regNoLength < 9)) {
            return true;
        } else {
            return false;

        }

    }

    public String reverseAndCombinedData(String name, String email, String phoneNo, String regNo) {

        name = reverseString(name);
        email = reverseString(email);
        phoneNo = reverseString(phoneNo);
        regNo = reverseString(regNo);

        return name + email + phoneNo + regNo;

    }

    public String reverseString(String userData) {
        String reverseData = "";
        char ch;

        for (int i = 0; i < userData.length(); i++) {
            ch = userData.charAt(i);
            reverseData = ch + reverseData;
        }
        return reverseData;
    }

    public int calculateHashValue(String information) {

        // System.out.println("Hashed value is "+information);

        return information.hashCode();

    }

}