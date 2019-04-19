package utilities;

import base.BasePage;

public class Urls extends BasePage {

    //base urls
    public final String NASABASE = Protocol.HTTPS.get() + "www.nasa.gov";
    public final String DEMOBASE = Protocol.HTTPS.get() + "demoqa.com/";
    public final String PRACTICEURL = Protocol.HTTP.get() + "automationpractice.com/index.php";

    //category
    public final String CAT_INTERACTIONS = DEMOBASE + "category/interactions/";
    public final String CAT_WIDGETS = DEMOBASE + "category/widgets/";

    //interactions
    public final String SORTABLE = DEMOBASE + "sortable/";
    public final String SELECTABLE = DEMOBASE + "selectable";
    public final String RESIZABLE = DEMOBASE + "resizable";
    public final String DROPPABLE = DEMOBASE + "droppable";
    public final String DRAGGABLE = DEMOBASE + "draggable";

    //widget
    public final String TOOLTIP = DEMOBASE + "tooptip/";
    public final String TABS = DEMOBASE + "tab";
    public final String SPINNER = DEMOBASE + "spinner";
    public final String SLIDER = DEMOBASE + "slider";
    public final String SELECT_MENU = DEMOBASE + "selectionmenu";
    public final String PROGRESS_BAR = DEMOBASE + "progressbar";
    public final String MENU = DEMOBASE + "menu";
    public final String DIALOG = DEMOBASE + "dialog";
    public final String DATE_PICKER = DEMOBASE + "datepicker";
    public final String CONTROL_GROUP = DEMOBASE + "controlgroup";
    public final String CHECKBOX_RADIO = DEMOBASE + "checkboxradio";
    public final String BUTTON = DEMOBASE + "button";
    public final String AUTOCOMPLETE = DEMOBASE + "autocomplete";
    public final String ACCORDION = DEMOBASE + "accordion";
}



