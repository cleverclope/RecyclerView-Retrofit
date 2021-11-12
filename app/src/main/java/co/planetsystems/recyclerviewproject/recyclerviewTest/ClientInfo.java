package co.planetsystems.recyclerviewproject.recyclerviewTest;



public class ClientInfo {

    private Long clientId;
    private String clientSurname, clientGivenName, clientNin, clientGender;
    private String clientDateOfBirth;
    private String clientVillage, clientParish, clientSCounty, clientCounty, clientDistrict;
    private String clientNationality, clientPhone, clientUsername, clientPassword, clientComfirmPass, clientEmail;

    public ClientInfo() {
    }

    public ClientInfo(String clientSurname, String clientGivenName, String clientNin, String clientGender,
                      String clientVillage, String clientParish, String clientSCounty, String clientCounty,
                      String clientDistrict, String clientDateOfBirth, String clientNationality,
                      String clientPhone, String clientUsername, String clientPassword,
                      String clientComfirmPass, String clientEmail) {
        this.clientSurname = clientSurname;
        this.clientGivenName = clientGivenName;
        this.clientNin = clientNin;
        this.clientGender = clientGender;
        this.clientVillage = clientVillage;
        this.clientParish = clientParish;
        this.clientSCounty = clientSCounty;
        this.clientCounty = clientCounty;
        this.clientDistrict = clientDistrict;
        this.clientDateOfBirth = clientDateOfBirth;
        this.clientNationality = clientNationality;
        this.clientPhone = clientPhone;
        this.clientUsername = clientUsername;
        this.clientPassword = clientPassword;
        this.clientComfirmPass = clientComfirmPass;
        this.clientEmail = clientEmail;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientGivenName() {
        return clientGivenName;
    }

    public void setClientGivenName(String clientGivenName) {
        this.clientGivenName = clientGivenName;
    }

    public String getClientNin() {
        return clientNin;
    }

    public void setClientNin(String clientNin) {
        this.clientNin = clientNin;
    }

    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    public String getClientVillage() {
        return clientVillage;
    }

    public void setClientVillage(String clientVillage) {
        this.clientVillage = clientVillage;
    }

    public String getClientParish() {
        return clientParish;
    }

    public void setClientParish(String clientParish) {
        this.clientParish = clientParish;
    }

    public String getClientSCounty() {
        return clientSCounty;
    }

    public void setClientSCounty(String clientSCounty) {
        this.clientSCounty = clientSCounty;
    }

    public String getClientCounty() {
        return clientCounty;
    }

    public void setClientCounty(String clientCounty) {
        this.clientCounty = clientCounty;
    }

    public String getClientDistrict() {
        return clientDistrict;
    }

    public void setClientDistrict(String clientDistrict) {
        this.clientDistrict = clientDistrict;
    }

    public String getClientDateOfBirth() {
        return clientDateOfBirth;
    }

    public void setClientDateOfBirth(String clientDateOfBirth) {
        this.clientDateOfBirth = clientDateOfBirth;
    }

    public String getClientNationality() {
        return clientNationality;
    }

    public void setClientNationality(String clientNationality) {
        this.clientNationality = clientNationality;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getClientComfirmPass() {
        return clientComfirmPass;
    }

    public void setClientComfirmPass(String clientComfirmPass) {
        this.clientComfirmPass = clientComfirmPass;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "clientId=" + clientId +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientGivenName='" + clientGivenName + '\'' +
                ", clientNin='" + clientNin + '\'' +
                ", clientGender='" + clientGender + '\'' +
                ", clientVillage='" + clientVillage + '\'' +
                ", clientParish='" + clientParish + '\'' +
                ", clientSCounty='" + clientSCounty + '\'' +
                ", clientCounty='" + clientCounty + '\'' +
                ", clientDistrict='" + clientDistrict + '\'' +
                ", clientDateOfBirth=" + clientDateOfBirth +
                ", clientNationality='" + clientNationality + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientUsername='" + clientUsername + '\'' +
                ", clientPassword='" + clientPassword + '\'' +
                ", clientComfirmPass='" + clientComfirmPass + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                '}';
    }
}

