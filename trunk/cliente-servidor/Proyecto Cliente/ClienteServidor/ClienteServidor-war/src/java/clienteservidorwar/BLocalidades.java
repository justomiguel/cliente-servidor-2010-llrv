/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservidorwar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import entity.Localidades;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.naming.NamingException;
import servers.ServerLocator;
import sessionbeans.LocalidadesFacadeRemote;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version BLocalidades.java
 * @version Created on 14/06/2010, 21:38:09
 * @author justomiguel
 */
public class BLocalidades extends AbstractPageBean {

    @EJB
    private LocalidadesFacadeRemote localidades;
    ServerLocator sl = new ServerLocator();
    private Option[] arrLoc;
    int encontre;

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private SingleSelectOptionsList dropDown1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions() {
        return dropDown1DefaultOptions;
    }

    public void setDropDown1DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions = ssol;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }
    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private DropDown dropDown1 = new DropDown();

    public DropDown getDropDown1() {
        return dropDown1;
    }

    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }
    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private Label errorlabel1 = new Label();

    public Label getErrorlabel1() {
        return errorlabel1;
    }

    public void setErrorlabel1(Label l) {
        this.errorlabel1 = l;
    }
    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public BLocalidades() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("BLocalidades Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here

        errorlabel1.setVisible(false);
        dropDown1.setVisible(false);
        label4.setVisible(false);
        label2.setVisible(false);
        button2.setVisible(false);
        label3.setVisible(false);
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public void dropDown1_processValueChange(ValueChangeEvent event) {
    }

    public void textField1_processValueChange(ValueChangeEvent event) {
    }

    public void textField1_validate(FacesContext context, UIComponent component, Object value) {
    }

    public String button2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        label3.setVisible(false);
        String busqueda = textField1.getText().toString();
        if (busqueda.length() < 1) {

            return null;
        }
        /*try {*/
            // TODO: Process the action. Return value is a navigation
            // case name where null will return to the same page.
          //  localidades = sl.getLocalidadesFacadeRemote();

            List<Localidades> locs = localidades.findAll();
            int size = locs.size();
            arrLoc = new Option[size];
            for (int i = 0; i < size; i++) {
                Localidades k = locs.get(i);
                Option j = new Option(k, k.getNombre());
                arrLoc[i] = j;

            }
            encontre = -1;

            for (int i = 0; i < arrLoc.length; i++) {
                if (arrLoc[i].getLabel().equalsIgnoreCase(busqueda)) {
                    encontre = i;
                    break;
                }

            }
            if (encontre != -1) {
                label4.setVisible(true);
            } else {
                encontre = -1;
                dropDown1DefaultOptions.setOptions(arrLoc);
                dropDown1.setVisible(true);
                label2.setVisible(true);

            }
            /*} catch (NamingException ex) {
            errorlabel1.setVisible(true);
            }*/

        button2.setVisible(true);


        return null;

    }

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        label4.setVisible(false);
        

        String busqueda = textField1.getText().toString();


        List<Localidades> locs = localidades.findAll();
        int size = locs.size();
        arrLoc = new Option[size];
        for (int i = 0; i < size; i++) {
            Localidades k = locs.get(i);
            Option j = new Option(k, k.getNombre());
            arrLoc[i] = j;

        }
        encontre = -1;

        for (int i = 0; i < arrLoc.length; i++) {
            if (arrLoc[i].getLabel().equalsIgnoreCase(busqueda)) {
                localidades.remove((Localidades) arrLoc[i].getValue());
                label3.setVisible(true);
                  return "exito";
            }
        }

        for (int i = 0; i < arrLoc.length; i++) {
            Option option = arrLoc[i];
            if (option.getValue() == dropDown1.getSelected()){
                localidades.remove((Localidades) arrLoc[i].getValue());
                label3.setVisible(true);
                   return "exito";
            }

        }

      
        return "error";
    }
}

