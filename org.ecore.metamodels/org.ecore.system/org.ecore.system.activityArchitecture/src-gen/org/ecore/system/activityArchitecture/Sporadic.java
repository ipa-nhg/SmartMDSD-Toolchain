/**
 */
package org.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.Sporadic#getMinActFreq <em>Min Act Freq</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.Sporadic#getMaxActFreq <em>Max Act Freq</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getSporadic()
 * @model
 * @generated
 */
public interface Sporadic extends ActivationSource {
	/**
	 * Returns the value of the '<em><b>Min Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Act Freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Act Freq</em>' attribute.
	 * @see #setMinActFreq(double)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getSporadic_MinActFreq()
	 * @model
	 * @generated
	 */
	double getMinActFreq();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.Sporadic#getMinActFreq <em>Min Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Act Freq</em>' attribute.
	 * @see #getMinActFreq()
	 * @generated
	 */
	void setMinActFreq(double value);

	/**
	 * Returns the value of the '<em><b>Max Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Act Freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Act Freq</em>' attribute.
	 * @see #setMaxActFreq(double)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getSporadic_MaxActFreq()
	 * @model
	 * @generated
	 */
	double getMaxActFreq();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.Sporadic#getMaxActFreq <em>Max Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Act Freq</em>' attribute.
	 * @see #getMaxActFreq()
	 * @generated
	 */
	void setMaxActFreq(double value);

} // Sporadic
