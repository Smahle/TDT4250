/**
 */
package gr1616;

import no.hal.pgo.osm.GeoLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Player#getPerson <em>Person</em>}</li>
 *   <li>{@link gr1616.Player#getNickname <em>Nickname</em>}</li>
 *   <li>{@link gr1616.Player#getXp <em>Xp</em>}</li>
 *   <li>{@link gr1616.Player#getAttackPoints <em>Attack Points</em>}</li>
 *   <li>{@link gr1616.Player#getActiveWeapon <em>Active Weapon</em>}</li>
 *   <li>{@link gr1616.Player#getActiveArmor <em>Active Armor</em>}</li>
 *   <li>{@link gr1616.Player#getGold <em>Gold</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getPlayer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Player extends GeoLocation, AbleToHold {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see gr1616.Gr1616Package#getPlayer_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link gr1616.Player#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see gr1616.Gr1616Package#getPlayer_Nickname()
	 * @model unique="false"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link gr1616.Player#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xp</em>' attribute.
	 * @see #setXp(int)
	 * @see gr1616.Gr1616Package#getPlayer_Xp()
	 * @model unique="false"
	 * @generated
	 */
	int getXp();

	/**
	 * Sets the value of the '{@link gr1616.Player#getXp <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xp</em>' attribute.
	 * @see #getXp()
	 * @generated
	 */
	void setXp(int value);

	/**
	 * Returns the value of the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Points</em>' attribute.
	 * @see #setAttackPoints(int)
	 * @see gr1616.Gr1616Package#getPlayer_AttackPoints()
	 * @model derived="true"
	 * @generated
	 */
	int getAttackPoints();

	/**
	 * Sets the value of the '{@link gr1616.Player#getAttackPoints <em>Attack Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Points</em>' attribute.
	 * @see #getAttackPoints()
	 * @generated
	 */
	void setAttackPoints(int value);

	/**
	 * Returns the value of the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Weapon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Weapon</em>' reference.
	 * @see #setActiveWeapon(WeaponClass)
	 * @see gr1616.Gr1616Package#getPlayer_ActiveWeapon()
	 * @model
	 * @generated
	 */
	WeaponClass getActiveWeapon();

	/**
	 * Sets the value of the '{@link gr1616.Player#getActiveWeapon <em>Active Weapon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Weapon</em>' reference.
	 * @see #getActiveWeapon()
	 * @generated
	 */
	void setActiveWeapon(WeaponClass value);

	/**
	 * Returns the value of the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Armor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Armor</em>' reference.
	 * @see #setActiveArmor(ArmorClass)
	 * @see gr1616.Gr1616Package#getPlayer_ActiveArmor()
	 * @model
	 * @generated
	 */
	ArmorClass getActiveArmor();

	/**
	 * Sets the value of the '{@link gr1616.Player#getActiveArmor <em>Active Armor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Armor</em>' reference.
	 * @see #getActiveArmor()
	 * @generated
	 */
	void setActiveArmor(ArmorClass value);

	/**
	 * Returns the value of the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gold</em>' attribute.
	 * @see #setGold(int)
	 * @see gr1616.Gr1616Package#getPlayer_Gold()
	 * @model
	 * @generated
	 */
	int getGold();

	/**
	 * Sets the value of the '{@link gr1616.Player#getGold <em>Gold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gold</em>' attribute.
	 * @see #getGold()
	 * @generated
	 */
	void setGold(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Player getRaceGoodAgainst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Minion getAffraidOf();

} // Player
