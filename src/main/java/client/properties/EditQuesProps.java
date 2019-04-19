package client.properties;

import org.openqa.selenium.By;

public enum EditQuesProps {


    //@CacheLookup
    POPIN_TITLE(By.xpath("//div[@id='appcues-optional-title']//input")),
    QUES_TEXT_FIELD(By.id("main-question-input")),
    CHAT(By.xpath(" //div[@class='cards-container']/div/div[2]/div[2]")),

    //Sample Questions
    SAMPLE_QUESTIONS_BUTTON(By.xpath("//md-select/md-select-value")),
    OPTION_1(By.id("select_option_29")),
    OPTION_2(By.id("select_option_30")),
    OPTION_3(By.id("select_option_31")),
    OPTION_4(By.id("select_option_32")),
    OPTION_5(By.id("select_option_33")),
    OPTION_6(By.id("select_option_34")),
    OPTION_7(By.id("select_option_35")),
    OPTION_8(By.id("select_option_36")),
    OPTION_9(By.id("select_option_37")),
    OPTION_10(By.id("select_option_38")),

    //Question Options
    QUESTION_TYPE_BUTTON(By.id("appcues-survey-qstyle-0")),
    OPEN_ENDED(By.id("select_option_41")),
    YES_NO(By.id("/select_option_42")),
    MULTI_CHOICE(By.id("select_option_43")),
    SCALE(By.id("select_option_44")),
    ADD_MEDIA(By.xpath("//div[@id='appcues-survey-text-0']/div/div[2]/div[2]")),
    ADD_QUESTION(By.xpath("//div[@id='appcues-survey-add-another']/button")),


    //Dates
    POPIN_DATE(By.xpath("//div[@id='appcues-date-button']/div")),

    //Start Dates
    START_DATE(By.className("moment-picker bottom left")),
    START_TIME(By.xpath("//div[@class='moment-picker bottom left'][2]")),

    //End Dates
    END_DATE(By.className("//div[@class='moment-picker bottom right']")),
    END_TIME(By.xpath("//div[@class='moment-picker bottom right']")),

    //Other Options
    REPEAT_BOX(By.id("select_value_label_43")),
    REPEAT_WEEKLY(By.id("select_option_47")),
    REPEAT_MONTHLY_ON_DAY(By.id("select_option_48")),
    REPEAT_MONTHLY_ON_DATE(By.id("select_option_49")),
    REPEAT_ANNUALLY(By.id("select_option_50")),
    REPEAT_CUSTOM(By.id("select_option_51")),
    REPEAT_CUSTOM_EVERY(By.id("input_53")),
    REPEAT_CUSTOM_OPTIONS(By.id("select_value_label_52")),
    REPEAT_CUSTOM_DAY(By.id("select_option_56")),
    REPEAT_CUSTOM_WEEK(By.id("select_option_57")),
    REPEAT_CUSTOM_MONTH(By.id("select_option_58")),
    REPEAT_CUSTOM_YEAR(By.id("select_option_59")),

    DATE_CANCEL_BUTTON(By.xpath("//md-dialog[@id='create-meeting-modal']/md-dialog-content/div[3]/div/button")),
    DATE_SAVE_BUTTON(By.xpath("//md-dialog[@id='create-meeting-modal']/md-dialog-content/div[3]/div/button[2]")),

    //PARTICIPATION //TODO all of these id's change on refresh, use different things.
    UNRESTRICTED_RADIO(By.id("//md-radio-button[@id='5e6c7358-536e-4b2f-868a-ee7c27f5f3bc']")),
    RESTRICTED_RADIO(By.id("//md-radio-button[@id='e21ef8da-8fc6-4b0d-9d36-4b6a191573fa']")),
    PRIVATE_RADIO(By.id("//md-radio-button[@id='b033c562-c0b6-45e6-b480-b0334886e317']")),

    //ANONIMITY
    ANONYMOUS_RADIO(By.xpath("//md-radio-button[@id='c8cb5f7b-5435-4e97-8f31-75e1266e51a1']")),
    NAMED_RADIO(By.id("//md-radio-button[@id='8543dd59-8ae0-4439-b2a2-a2e51f567a43']")),
    CANCEL_BUTTON(By.xpath("//form/div/div/button")),
    SAVE_BUTTON(By.xpath("//button[contains(text(), 'Save')]"));

    private By prop;

    EditQuesProps(By s) {
        prop = s;
    }

    public By get() {
        return prop;
    }

}
