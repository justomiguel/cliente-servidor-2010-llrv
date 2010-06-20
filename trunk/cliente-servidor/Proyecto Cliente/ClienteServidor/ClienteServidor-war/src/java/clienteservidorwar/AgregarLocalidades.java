/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clienteservidorwar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.FacesException;
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
 * @version AgregarLocalidades.java
 * @version Created on 15/06/2010, 14:20:16
 * @author justomiguel
 */

public class AgregarLocalidades extends AbstractPageBean {

      @EJB
    private LocalidadesFacadeRemote localidades;
    ServerLocator sl = new ServerLocator();

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField textField3 = new TextField();

    public TextField getTextField3() {
        return textField3;
    }

    public void setTextField3(TextField tf) {
        this.textField3 = tf;
    }
    private TextField textField4 = new TextField();

    public TextField getTextField4() {
        return textField4;
    }

    public void setTextField4(TextField tf) {
        this.textField4 = tf;
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
    private TextField textField2 = new TextField();

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField tf) {
        this.textField2 = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AgregarLocalidades() {
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
            log("AgregarLocalidades Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String button1_action() {
     /*   try {
            // TODO: Process the action. Return value is a navigation
            // case name where null will return to the same page.
          /  localidades = sl.getLocalidadesFacadeRemote();
            if (localidades.create(Integer.parseInt(textField1.getText().toString()), textField2.getText().toString(), Integer.parseInt(textField3.getText().toString()), Integer.parseInt(textField4.getText().toString()))){
                return "exito";
            }
        } catch (NamingException ex) {
            Logger.getLogger(AgregarLocalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
       */
        return  null;
    }
    
}

