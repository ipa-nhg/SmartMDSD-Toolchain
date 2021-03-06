/**
 */
package org.ecore.service.serviceDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Service Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.CommunicationServiceUsage#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.CommunicationServiceUsage#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCommunicationServiceUsage()
 * @model
 * @generated
 */
public interface CommunicationServiceUsage extends EObject {
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
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCommunicationServiceUsage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CommunicationServiceUsage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(CommunicationServiceDefinition)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCommunicationServiceUsage_Uses()
	 * @model required="true"
	 * @generated
	 */
	CommunicationServiceDefinition getUses();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CommunicationServiceUsage#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(CommunicationServiceDefinition value);

} // CommunicationServiceUsage
