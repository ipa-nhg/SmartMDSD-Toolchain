/**
 */
package org.ecore.system.targetPlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.TargetPlatformModel#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.TargetPlatformModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getTargetPlatformModel()
 * @model
 * @generated
 */
public interface TargetPlatformModel extends EObject {
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
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getTargetPlatformModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.TargetPlatformModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.targetPlatform.AbstractTPElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getTargetPlatformModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTPElement> getElements();

} // TargetPlatformModel
