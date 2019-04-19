package client.properties;


import org.openqa.selenium.By;

public enum HomepageProps {

    //headers
    HOME(By.id("/sortable/")),
    INTERACTIONS (By.id("/selectable")),
    WIDGETS (By.id("/resizable")),



    EMAIL_FIELD(By.id("login-email")),
    PASSWORD_FIELD(By.id("login-password")),
    SUBMIT_BUTTON(By.xpath("//form/button[contains(text(), 'Submit')]")),
    SIGN_IN_BUTTON(By.xpath("//form/button[contains(text(), 'Sign in')]")),
    DISABLED_GO_BUTTON(By.xpath("//button[contains(@disabled,'disabled')]")),
    EMAIL_NOT_RECOG(By.xpath("//p[contains(text(),'Email not recognized')]")),
    INVALID_PASSWORD(By.xpath("//p[contains(text(),'Incorrect Email and/or Password')]")),
    TOS_LINK(By.xpath("//p[@class='body-small']/a")),
    LEARN_MORE_LINK(By.xpath("//div[@class='login-form ng-scope']/p[2]/a")),
    NEED_HELP_LINK(By.xpath("//div[@class='login-form']/a")),
    INTERCOM_ICON(By.xpath("//div[@id='intercom-container']")),
    FORGOT_PASS_BUTTON(By.xpath("//button[contains(text(), 'Forgot Password?')]")),
    //TODO pass reset sent prop needs updating...actually that entire flow needs updating.
    PASS_RESET_SENT(By.xpath("//button[contains(text(), 'Password Reset Email Sent!')]")),
    RESEND_EMAIL(By.xpath("//a[contains(@ng-click, 'resend(user.email)')]")),
    CHANGE_EMAIL(By.xpath("//a[contains(@ng-click, 'resetForm();')]")),
    SENT_EMAIL_PARA(By.xpath("//span[contains(text(),\"We've sent a message to\")]")),
    SET_PASSWORD(By.id("input_0")),
    CONFIRM_PASSWORD(By.id("input_1"));

    private By prop;

    HomepageProps(By by) {
        prop = by;
    }

    public By get() {
        return prop;
    }

}

