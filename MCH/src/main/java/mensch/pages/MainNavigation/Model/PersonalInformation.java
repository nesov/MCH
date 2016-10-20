package mensch.pages.MainNavigation.Model;

import org.jetbrains.annotations.Contract;

/**
 * Created by alexnesov on 10/20/16.
 */
public class PersonalInformation{

    private String FIRST_NAME;
    private String LAST_NAME;
    private String MIDDLE_NAME;
    private String BIRTH_DATE;
    private String SNN;


    private PersonalInformation() {
    }

    /**
     * @return
     */
    @Contract(" -> !null")
    public static PersonalInformation createPersonalInformation() {
        return new PersonalInformation();
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public void setBIRTH_DATE(String BIRTH_DATE) {
        this.BIRTH_DATE = BIRTH_DATE;
    }

    public String getSNN() {
        return SNN;
    }

    public void setSNN(String SNN) {
        this.SNN = SNN;
    }
}
