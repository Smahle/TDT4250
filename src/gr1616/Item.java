/**
 */
package gr1616;

import no.hal.pgo.osm.GeoLocated;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Item#getOwner <em>Owner</em>}</li>
 *   <li>{@link gr1616.Item#getLocation <em>Location</em>}</li>
 *   <li>{@link gr1616.Item#getItemType <em>Item Type</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getItem()
 * @model
 * @generated
 */
public interface Item extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(AbleToHold)
	 * @see gr1616.Gr1616Package#getItem_Owner()
	 * @model
	 * @generated
	 */
	AbleToHold getOwner();

	/**
	 * Sets the value of the '{@link gr1616.Item#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(AbleToHold value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GeoLocated)
	 * @see gr1616.Gr1616Package#getItem_Location()
	 * @model
	 * @generated
	 */
	GeoLocated getLocation();

	/**
	 * Sets the value of the '{@link gr1616.Item#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocated value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' reference.
	 * @see #setItemType(ItemType)
	 * @see gr1616.Gr1616Package#getItem_ItemType()
	 * @model
	 * @generated
	 */
	ItemType getItemType();

	/**
	 * Sets the value of the '{@link gr1616.Item#getItemType <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' reference.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(ItemType value);

} // Item
