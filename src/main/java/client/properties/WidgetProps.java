package client.properties;


import org.openqa.selenium.By;

public enum WidgetProps {


    //Category widgets
    TOOLTIPS(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Tooltip')]")),
    TABS(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Tabs')]")),
    SPINNER(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Spinner')]")),
    SLIDER(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Slider')]")),
    SELECTMENU(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Selectmenu')]")),
    PROGRESSBAR(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Progressbar')]")),
    MENU(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Menu')]")),
    DIALOG(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Dialog')]")),
    DATEPICKER(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Datepicker')]")),
    CONTROLGROUP(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Controlgroup')]")),
    CHECKBOXRADIO(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Checkboxradio')]")),
    BUTTON(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Button')]")),
    AUTOCOMPLETE(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Autocomplete')]")),
    ACCORDION(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Accordion')]")),


    //sortable


    //checkboxradio
    //radio group
    RADIO_1(By.xpath("//div[@class='widget']//label[@for='radio-1']")),
    RADIO_2(By.xpath("//div[@class='widget']//label[@for='radio-2']")),
    RADIO_3(By.xpath("//div[@class='widget']//label[@for='radio-3']")),

    //checkbox
    CHECKBOX_1(By.xpath("//div[@class='widget']//label[@for='checkbox-1']")),
    CHECKBOX_2(By.xpath("//div[@class='widget']//label[@for='checkbox-2']")),
    CHECKBOX_3(By.xpath("//div[@class='widget']//label[@for='checkbox-3']")),
    CHECKBOX_4(By.xpath("//div[@class='widget']//label[@for='checkbox-4']")),

    //checkbox nested in label
    CHECKBOX_NESTED_1(By.xpath("//div[@class='widget']//label[@for='checkbox-nested-1']")),
    CHECKBOX_NESTED_2(By.xpath("//div[@class='widget']//label[@for='checkbox-nested-2']")),
    CHECKBOX_NESTED_3(By.xpath("//div[@class='widget']//label[@for='checkbox-nested-3']")),
    CHECKBOX_NESTED_4(By.xpath("//div[@class='widget']//label[@for='checkbox-nested-4']"));




    private By prop;

    WidgetProps(By by) {
        prop = by;
    }

    public By get() {
        return prop;
    }

    }

