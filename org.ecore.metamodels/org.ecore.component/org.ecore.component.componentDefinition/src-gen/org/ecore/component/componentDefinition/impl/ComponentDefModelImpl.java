/**
 */
package org.ecore.component.componentDefinition.impl;

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

import org.ecore.component.componentDefinition.ComponentDefModel;
import org.ecore.component.componentDefinition.ComponentDefinition;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.componentDefinition.ServiceRepoImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Def Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.impl.ComponentDefModelImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.impl.ComponentDefModelImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefModelImpl extends MinimalEObjectImpl.Container implements ComponentDefModel {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition component;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRepoImport> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.COMPONENT_DEF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ComponentDefinition newComponent, NotificationChain msgs) {
		ComponentDefinition oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT, oldComponent, newComponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentDefinition newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject) component).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRepoImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<ServiceRepoImport>(ServiceRepoImport.class, this,
					ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT:
			return basicSetComponent(null, msgs);
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT:
			return getComponent();
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS:
			return getImports();
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
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT:
			setComponent((ComponentDefinition) newValue);
			return;
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends ServiceRepoImport>) newValue);
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
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT:
			setComponent((ComponentDefinition) null);
			return;
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS:
			getImports().clear();
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
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__COMPONENT:
			return component != null;
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentDefModelImpl
