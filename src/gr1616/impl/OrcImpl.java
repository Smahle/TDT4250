/**
 */
package gr1616.impl;

import gr1616.AbleToHold;
import gr1616.ArmorClass;
import gr1616.Gr1616Package;
import gr1616.Item;
import gr1616.Minion;
import gr1616.Orc;
import gr1616.Person;
import gr1616.Player;
import gr1616.WeaponClass;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.hal.pgo.osm.impl.GeoLocationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gr1616.impl.OrcImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getXp <em>Xp</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getAttackPoints <em>Attack Points</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getActiveWeapon <em>Active Weapon</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getActiveArmor <em>Active Armor</em>}</li>
 *   <li>{@link gr1616.impl.OrcImpl#getGold <em>Gold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrcImpl extends GeoLocationImpl implements Orc {
	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> inventory;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected static final int XP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected int xp = XP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackPoints() <em>Attack Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACK_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackPoints() <em>Attack Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackPoints()
	 * @generated
	 * @ordered
	 */
	protected int attackPoints = ATTACK_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveWeapon() <em>Active Weapon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveWeapon()
	 * @generated
	 * @ordered
	 */
	protected WeaponClass activeWeapon;

	/**
	 * The cached value of the '{@link #getActiveArmor() <em>Active Armor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveArmor()
	 * @generated
	 * @ordered
	 */
	protected ArmorClass activeArmor;

	/**
	 * The default value of the '{@link #getGold() <em>Gold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGold()
	 * @generated
	 * @ordered
	 */
	protected static final int GOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGold() <em>Gold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGold()
	 * @generated
	 * @ordered
	 */
	protected int gold = GOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gr1616Package.Literals.ORC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectResolvingEList<Item>(Item.class, this, Gr1616Package.ORC__INVENTORY);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ORC__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXp() {
		return xp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXp(int newXp) {
		int oldXp = xp;
		xp = newXp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__XP, oldXp, xp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackPoints(int newAttackPoints) {
		int oldAttackPoints = attackPoints;
		attackPoints = newAttackPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__ATTACK_POINTS, oldAttackPoints, attackPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponClass getActiveWeapon() {
		if (activeWeapon != null && activeWeapon.eIsProxy()) {
			InternalEObject oldActiveWeapon = (InternalEObject)activeWeapon;
			activeWeapon = (WeaponClass)eResolveProxy(oldActiveWeapon);
			if (activeWeapon != oldActiveWeapon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ORC__ACTIVE_WEAPON, oldActiveWeapon, activeWeapon));
			}
		}
		return activeWeapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponClass basicGetActiveWeapon() {
		return activeWeapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveWeapon(WeaponClass newActiveWeapon) {
		WeaponClass oldActiveWeapon = activeWeapon;
		activeWeapon = newActiveWeapon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__ACTIVE_WEAPON, oldActiveWeapon, activeWeapon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmorClass getActiveArmor() {
		if (activeArmor != null && activeArmor.eIsProxy()) {
			InternalEObject oldActiveArmor = (InternalEObject)activeArmor;
			activeArmor = (ArmorClass)eResolveProxy(oldActiveArmor);
			if (activeArmor != oldActiveArmor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ORC__ACTIVE_ARMOR, oldActiveArmor, activeArmor));
			}
		}
		return activeArmor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmorClass basicGetActiveArmor() {
		return activeArmor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveArmor(ArmorClass newActiveArmor) {
		ArmorClass oldActiveArmor = activeArmor;
		activeArmor = newActiveArmor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__ACTIVE_ARMOR, oldActiveArmor, activeArmor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGold(int newGold) {
		int oldGold = gold;
		gold = newGold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ORC__GOLD, oldGold, gold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getRaceGoodAgainst() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minion getAffraidOf() {
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
			case Gr1616Package.ORC__INVENTORY:
				return getInventory();
			case Gr1616Package.ORC__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case Gr1616Package.ORC__NICKNAME:
				return getNickname();
			case Gr1616Package.ORC__XP:
				return getXp();
			case Gr1616Package.ORC__ATTACK_POINTS:
				return getAttackPoints();
			case Gr1616Package.ORC__ACTIVE_WEAPON:
				if (resolve) return getActiveWeapon();
				return basicGetActiveWeapon();
			case Gr1616Package.ORC__ACTIVE_ARMOR:
				if (resolve) return getActiveArmor();
				return basicGetActiveArmor();
			case Gr1616Package.ORC__GOLD:
				return getGold();
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
			case Gr1616Package.ORC__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
				return;
			case Gr1616Package.ORC__PERSON:
				setPerson((Person)newValue);
				return;
			case Gr1616Package.ORC__NICKNAME:
				setNickname((String)newValue);
				return;
			case Gr1616Package.ORC__XP:
				setXp((Integer)newValue);
				return;
			case Gr1616Package.ORC__ATTACK_POINTS:
				setAttackPoints((Integer)newValue);
				return;
			case Gr1616Package.ORC__ACTIVE_WEAPON:
				setActiveWeapon((WeaponClass)newValue);
				return;
			case Gr1616Package.ORC__ACTIVE_ARMOR:
				setActiveArmor((ArmorClass)newValue);
				return;
			case Gr1616Package.ORC__GOLD:
				setGold((Integer)newValue);
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
			case Gr1616Package.ORC__INVENTORY:
				getInventory().clear();
				return;
			case Gr1616Package.ORC__PERSON:
				setPerson((Person)null);
				return;
			case Gr1616Package.ORC__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case Gr1616Package.ORC__XP:
				setXp(XP_EDEFAULT);
				return;
			case Gr1616Package.ORC__ATTACK_POINTS:
				setAttackPoints(ATTACK_POINTS_EDEFAULT);
				return;
			case Gr1616Package.ORC__ACTIVE_WEAPON:
				setActiveWeapon((WeaponClass)null);
				return;
			case Gr1616Package.ORC__ACTIVE_ARMOR:
				setActiveArmor((ArmorClass)null);
				return;
			case Gr1616Package.ORC__GOLD:
				setGold(GOLD_EDEFAULT);
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
			case Gr1616Package.ORC__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case Gr1616Package.ORC__PERSON:
				return person != null;
			case Gr1616Package.ORC__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case Gr1616Package.ORC__XP:
				return xp != XP_EDEFAULT;
			case Gr1616Package.ORC__ATTACK_POINTS:
				return attackPoints != ATTACK_POINTS_EDEFAULT;
			case Gr1616Package.ORC__ACTIVE_WEAPON:
				return activeWeapon != null;
			case Gr1616Package.ORC__ACTIVE_ARMOR:
				return activeArmor != null;
			case Gr1616Package.ORC__GOLD:
				return gold != GOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbleToHold.class) {
			switch (derivedFeatureID) {
				case Gr1616Package.ORC__INVENTORY: return Gr1616Package.ABLE_TO_HOLD__INVENTORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbleToHold.class) {
			switch (baseFeatureID) {
				case Gr1616Package.ABLE_TO_HOLD__INVENTORY: return Gr1616Package.ORC__INVENTORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Gr1616Package.ORC___GET_RACE_GOOD_AGAINST:
				return getRaceGoodAgainst();
			case Gr1616Package.ORC___GET_AFFRAID_OF:
				return getAffraidOf();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(", xp: ");
		result.append(xp);
		result.append(", attackPoints: ");
		result.append(attackPoints);
		result.append(", gold: ");
		result.append(gold);
		result.append(')');
		return result.toString();
	}

} //OrcImpl
