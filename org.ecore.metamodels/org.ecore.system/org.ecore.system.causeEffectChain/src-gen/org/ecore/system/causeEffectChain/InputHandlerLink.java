/**
 */
package org.ecore.system.causeEffectChain;

import org.ecore.system.activityArchitecture.InputHandlerNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Handler Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.causeEffectChain.InputHandlerLink#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.InputHandlerLink#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getInputHandlerLink()
 * @model
 * @generated
 */
public interface InputHandlerLink extends AbstractChainLink {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getInputHandlerLink_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.system.causeEffectChain.InputHandlerLink#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(InputHandlerNode)
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getInputHandlerLink_Ref()
	 * @model required="true"
	 * @generated
	 */
	InputHandlerNode getRef();

	/**
	 * Sets the value of the '{@link org.ecore.system.causeEffectChain.InputHandlerLink#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(InputHandlerNode value);

} // InputHandlerLink
