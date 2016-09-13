/**
 */
package gr1616;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weapon Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.WeaponClass#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getWeaponClass()
 * @model
 * @generated
 */
public interface WeaponClass extends ItemType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gr1616.Weapon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gr1616.Weapon
	 * @see #setType(Weapon)
	 * @see gr1616.Gr1616Package#getWeaponClass_Type()
	 * @model
	 * @generated
	 */
	Weapon getType();

	/**
	 * Sets the value of the '{@link gr1616.WeaponClass#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gr1616.Weapon
	 * @see #getType()
	 * @generated
	 */
	void setType(Weapon value);

} // WeaponClass
