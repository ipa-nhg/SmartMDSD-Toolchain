/**
 */
package org.ecore.behavior.skillRealization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Coordination Action Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getMode <em>Mode</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionEvent()
 * @model
 * @generated
 */
public interface ComponentCoordinationActionEvent extends AbstractComponentCoordinationAction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionEvent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' reference.
	 * @see #setHandler(EventHandler)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionEvent_Handler()
	 * @model required="true"
	 * @generated
	 */
	EventHandler getHandler();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getHandler <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(EventHandler value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.behavior.skillRealization.EventMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.ecore.behavior.skillRealization.EventMode
	 * @see #setMode(EventMode)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionEvent_Mode()
	 * @model required="true"
	 * @generated
	 */
	EventMode getMode();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.ecore.behavior.skillRealization.EventMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(EventMode value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(String)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionEvent_Param()
	 * @model required="true"
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

} // ComponentCoordinationActionEvent
