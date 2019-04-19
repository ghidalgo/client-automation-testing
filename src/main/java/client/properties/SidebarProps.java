package client.properties;


import org.openqa.selenium.By;

public enum SidebarProps {

    //interactions
     SORTABLE(By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Sortable')]")),
     SELECTABLE (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Selectable')]")),
     RESIZABLE (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Resizeable')]")),
     DROPPABLE (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Droppable')]")),
     DRAGGABLE (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Draggable')]")),

    //wxpathget
     TOOLTIP (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Tooltip')]")),
     TABS (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Tabs')]")),
     SPINNER (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Spinner')]")),
     SELECT_MENU (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Selectmenu')]")),
     PROGRESS_BAR (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Progressbar')]")),
     MENU (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Menu')]")),
     DIALOG (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Dialog')]")),
     DATE_PICKER (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Datepicker')]")),
     CONTROL_GROUP (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Controlgroup')]")),
     CHECKBOX_RADIO (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Checkboxradio')]")),
     BUTTON (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Button')]")),
     AUTOCOMPLETE (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Autocomplete')]")),
     ACCORDION (By.xpath("//div[@xpath='sxpathebar']//a[contains(text(), 'Accordion')]"));


    private By prop;

    SidebarProps(By by) {
        prop = by;
    }

    public By get() {
        return prop;
    }

}

