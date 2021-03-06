/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.base.genericDatasheet.AbstractLicense;
import org.ecore.base.genericDatasheet.GenericDatasheet;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.TRL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Datasheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getSupplierDescription <em>Supplier Description</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl#getTrl <em>Trl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericDatasheetImpl extends MinimalEObjectImpl.Container implements GenericDatasheet {
	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected AbstractLicense license;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierDescription() <em>Supplier Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierDescription() <em>Supplier Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierDescription()
	 * @generated
	 * @ordered
	 */
	protected String supplierDescription = SUPPLIER_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOMEPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected String homepage = HOMEPAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String baseURI = BASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrl() <em>Trl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrl()
	 * @generated
	 * @ordered
	 */
	protected static final TRL TRL_EDEFAULT = TRL.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTrl() <em>Trl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrl()
	 * @generated
	 * @ordered
	 */
	protected TRL trl = TRL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDatasheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDatasheetPackage.Literals.GENERIC_DATASHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractLicense getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(AbstractLicense newLicense, NotificationChain msgs) {
		AbstractLicense oldLicense = license;
		license = newLicense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE, oldLicense, newLicense);
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
	@Override
	public void setLicense(AbstractLicense newLicense) {
		if (newLicense != license) {
			NotificationChain msgs = null;
			if (license != null)
				msgs = ((InternalEObject) license).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject) newLicense).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE,
					newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRIPTION, oldShortDescription,
					shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierDescription() {
		return supplierDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierDescription(String newSupplierDescription) {
		String oldSupplierDescription = supplierDescription;
		supplierDescription = newSupplierDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION, oldSupplierDescription,
					supplierDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomepage() {
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomepage(String newHomepage) {
		String oldHomepage = homepage;
		homepage = newHomepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE,
					oldHomepage, homepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseURI() {
		return baseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseURI(String newBaseURI) {
		String oldBaseURI = baseURI;
		baseURI = newBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI,
					oldBaseURI, baseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRL getTrl() {
		return trl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrl(TRL newTrl) {
		TRL oldTrl = trl;
		trl = newTrl == null ? TRL_EDEFAULT : newTrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.GENERIC_DATASHEET__TRL,
					oldTrl, trl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE:
			return basicSetLicense(null, msgs);
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
		case GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE:
			return getLicense();
		case GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRIPTION:
			return getShortDescription();
		case GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION:
			return getLongDescription();
		case GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION:
			return getSupplierDescription();
		case GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE:
			return getHomepage();
		case GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI:
			return getBaseURI();
		case GenericDatasheetPackage.GENERIC_DATASHEET__TRL:
			return getTrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE:
			setLicense((AbstractLicense) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRIPTION:
			setShortDescription((String) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION:
			setLongDescription((String) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION:
			setSupplierDescription((String) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE:
			setHomepage((String) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI:
			setBaseURI((String) newValue);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__TRL:
			setTrl((TRL) newValue);
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
		case GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE:
			setLicense((AbstractLicense) null);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRIPTION:
			setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION:
			setLongDescription(LONG_DESCRIPTION_EDEFAULT);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION:
			setSupplierDescription(SUPPLIER_DESCRIPTION_EDEFAULT);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE:
			setHomepage(HOMEPAGE_EDEFAULT);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI:
			setBaseURI(BASE_URI_EDEFAULT);
			return;
		case GenericDatasheetPackage.GENERIC_DATASHEET__TRL:
			setTrl(TRL_EDEFAULT);
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
		case GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE:
			return license != null;
		case GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRIPTION:
			return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null
					: !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
		case GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION:
			return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null
					: !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
		case GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION:
			return SUPPLIER_DESCRIPTION_EDEFAULT == null ? supplierDescription != null
					: !SUPPLIER_DESCRIPTION_EDEFAULT.equals(supplierDescription);
		case GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE:
			return HOMEPAGE_EDEFAULT == null ? homepage != null : !HOMEPAGE_EDEFAULT.equals(homepage);
		case GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI:
			return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
		case GenericDatasheetPackage.GENERIC_DATASHEET__TRL:
			return trl != TRL_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shortDescription: ");
		result.append(shortDescription);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", supplierDescription: ");
		result.append(supplierDescription);
		result.append(", homepage: ");
		result.append(homepage);
		result.append(", baseURI: ");
		result.append(baseURI);
		result.append(", trl: ");
		result.append(trl);
		result.append(')');
		return result.toString();
	}

} //GenericDatasheetImpl
