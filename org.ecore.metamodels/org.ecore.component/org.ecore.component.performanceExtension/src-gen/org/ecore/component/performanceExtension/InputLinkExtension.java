/**
 */
package org.ecore.component.performanceExtension;

import org.ecore.component.componentDefinition.InputPortLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Link Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.performanceExtension.InputLinkExtension#isOversamplingOk <em>Oversampling Ok</em>}</li>
 *   <li>{@link org.ecore.component.performanceExtension.InputLinkExtension#isUndersamplingOk <em>Undersampling Ok</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#getInputLinkExtension()
 * @model
 * @generated
 */
public interface InputLinkExtension extends InputPortLink {
	/**
	 * Returns the value of the '<em><b>Oversampling Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversampling Ok</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversampling Ok</em>' attribute.
	 * @see #setOversamplingOk(boolean)
	 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#getInputLinkExtension_OversamplingOk()
	 * @model required="true"
	 * @generated
	 */
	boolean isOversamplingOk();

	/**
	 * Sets the value of the '{@link org.ecore.component.performanceExtension.InputLinkExtension#isOversamplingOk <em>Oversampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversampling Ok</em>' attribute.
	 * @see #isOversamplingOk()
	 * @generated
	 */
	void setOversamplingOk(boolean value);

	/**
	 * Returns the value of the '<em><b>Undersampling Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undersampling Ok</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undersampling Ok</em>' attribute.
	 * @see #setUndersamplingOk(boolean)
	 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#getInputLinkExtension_UndersamplingOk()
	 * @model required="true"
	 * @generated
	 */
	boolean isUndersamplingOk();

	/**
	 * Sets the value of the '{@link org.ecore.component.performanceExtension.InputLinkExtension#isUndersamplingOk <em>Undersampling Ok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undersampling Ok</em>' attribute.
	 * @see #isUndersamplingOk()
	 * @generated
	 */
	void setUndersamplingOk(boolean value);

} // InputLinkExtension
