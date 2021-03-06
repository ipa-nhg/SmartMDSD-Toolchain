/**
 */
package org.ecore.service.serviceDefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.service.serviceDefinition.AbstractServiceDefinition;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.ecore.service.serviceDefinition.ServiceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.AbstractServiceDefinitionImpl#getPurposeDescription <em>Purpose Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractServiceDefinitionImpl extends MinimalEObjectImpl.Container
		implements AbstractServiceDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceProperty> properties;

	/**
	 * The default value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected String purposeDescription = PURPOSE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.ABSTRACT_SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ServiceProperty>(ServiceProperty.class, this,
					ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurposeDescription() {
		return purposeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurposeDescription(String newPurposeDescription) {
		String oldPurposeDescription = purposeDescription;
		purposeDescription = newPurposeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PURPOSE_DESCRIPTION, oldPurposeDescription,
					purposeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__NAME:
			return getName();
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES:
			return getProperties();
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PURPOSE_DESCRIPTION:
			return getPurposeDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends ServiceProperty>) newValue);
			return;
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PURPOSE_DESCRIPTION:
			setPurposeDescription((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES:
			getProperties().clear();
			return;
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PURPOSE_DESCRIPTION:
			setPurposeDescription(PURPOSE_DESCRIPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case ServiceDefinitionPackage.ABSTRACT_SERVICE_DEFINITION__PURPOSE_DESCRIPTION:
			return PURPOSE_DESCRIPTION_EDEFAULT == null ? purposeDescription != null
					: !PURPOSE_DESCRIPTION_EDEFAULT.equals(purposeDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", purposeDescription: ");
		result.append(purposeDescription);
		result.append(')');
		return result.toString();
	}

} //AbstractServiceDefinitionImpl
