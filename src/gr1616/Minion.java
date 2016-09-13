/**
 */
package gr1616;

import no.hal.pgo.osm.GeoLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Minion#getHp <em>Hp</em>}</li>
 *   <li>{@link gr1616.Minion#getAttack <em>Attack</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getMinion()
 * @model
 * @generated
 */
public interface Minion extends GeoLocation, AbleToHold {
	/**
	 * Returns the value of the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp</em>' attribute.
	 * @see #setHp(int)
	 * @see gr1616.Gr1616Package#getMinion_Hp()
	 * @model unique="false"
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link gr1616.Minion#getHp <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp</em>' attribute.
	 * @see #getHp()
	 * @generated
	 */
	void setHp(int value);

	/**
	 * Returns the value of the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' attribute.
	 * @see #setAttack(int)
	 * @see gr1616.Gr1616Package#getMinion_Attack()
	 * @model unique="false"
	 * @generated
	 */
	int getAttack();

	/**
	 * Sets the value of the '{@link gr1616.Minion#getAttack <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' attribute.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(int value);

} // Minion
