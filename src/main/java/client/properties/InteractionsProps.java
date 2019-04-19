package client.properties;


import org.openqa.selenium.By;

public enum InteractionsProps {

    //Category interactions

    //sortable
    SORTABLE(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Sortable')]")),

    //selectable
    SELECTABLE(By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Selectable')]")),
    ITEM1(By.xpath("//ol/li[@class='ui-widget-content ui-selectee']")),
    ITEM2(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][1]")),
    ITEM3(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][2]")),
    ITEM4(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][3]")),
    ITEM5(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][4]")),
    ITEM6(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][5]")),
    ITEM7(By.xpath("//ol/li[@class='ui-widget-content ui-selectee'][6]")),

    RESIZABLE (By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Resizable')]")),
    DROPPABLE (By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Droppable')]")),
    DRAGGABLE (By.xpath("//div[@class='demo-frame']//a[contains(text(), 'Draggable')]"));



    private By prop;

    InteractionsProps(By by) {
        prop = by;
    }

    public By get() {
        return prop;
    }

    }

