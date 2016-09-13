/**
 */
package gr1616.impl;

import gr1616.AbleToHold;
import gr1616.Gr1616Package;
import gr1616.Item;
import gr1616.ItemType;

import java.lang.reflect.InvocationTargetException;

import no.hal.pgo.osm.GeoLocated;

import no.hal.pgo.osm.geoutil.LatLong;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gr1616.impl.ItemImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link gr1616.impl.ItemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gr1616.impl.ItemImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected AbleToHold owner;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected GeoLocated location;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gr1616Package.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbleToHold getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (AbleToHold)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ITEM__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbleToHold basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AbleToHold newOwner) {
		AbleToHold oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ITEM__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocated getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (GeoLocated)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ITEM__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocated basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GeoLocated newLocation) {
		GeoLocated oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ITEM__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemType() {
		if (itemType != null && itemType.eIsProxy()) {
			InternalEObject oldItemType = (InternalEObject)itemType;
			itemType = (ItemType)eResolveProxy(oldItemType);
			if (itemType != oldItemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ITEM__ITEM_TYPE, oldItemType, itemType));
			}
		}
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(ItemType newItemType) {
		ItemType oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ITEM__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLong getLatLong() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gr1616Package.ITEM__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case Gr1616Package.ITEM__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case Gr1616Package.ITEM__ITEM_TYPE:
				if (resolve) return getItemType();
				return basicGetItemType();
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
			case Gr1616Package.ITEM__OWNER:
				setOwner((AbleToHold)newValue);
				return;
			case Gr1616Package.ITEM__LOCATION:
				setLocation((GeoLocated)newValue);
				return;
			case Gr1616Package.ITEM__ITEM_TYPE:
				setItemType((ItemType)newValue);
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
			case Gr1616Package.ITEM__OWNER:
				setOwner((AbleToHold)null);
				return;
			case Gr1616Package.ITEM__LOCATION:
				setLocation((GeoLocated)null);
				return;
			case Gr1616Package.ITEM__ITEM_TYPE:
				setItemType((ItemType)null);
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
			case Gr1616Package.ITEM__OWNER:
				return owner != null;
			case Gr1616Package.ITEM__LOCATION:
				return location != null;
			case Gr1616Package.ITEM__ITEM_TYPE:
				return itemType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Gr1616Package.ITEM___GET_LAT_LONG:
				return getLatLong();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemImpl
