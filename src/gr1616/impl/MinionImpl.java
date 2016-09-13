/**
 */
package gr1616.impl;

import gr1616.AbleToHold;
import gr1616.Gr1616Package;
import gr1616.Item;
import gr1616.Minion;

import java.util.Collection;

import no.hal.pgo.osm.impl.GeoLocationImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gr1616.impl.MinionImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link gr1616.impl.MinionImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link gr1616.impl.MinionImpl#getAttack <em>Attack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinionImpl extends GeoLocationImpl implements Minion {
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
	 * The default value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected int hp = HP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected int attack = ATTACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gr1616Package.Literals.MINION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectResolvingEList<Item>(Item.class, this, Gr1616Package.MINION__INVENTORY);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHp(int newHp) {
		int oldHp = hp;
		hp = newHp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.MINION__HP, oldHp, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(int newAttack) {
		int oldAttack = attack;
		attack = newAttack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.MINION__ATTACK, oldAttack, attack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gr1616Package.MINION__INVENTORY:
				return getInventory();
			case Gr1616Package.MINION__HP:
				return getHp();
			case Gr1616Package.MINION__ATTACK:
				return getAttack();
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
			case Gr1616Package.MINION__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
				return;
			case Gr1616Package.MINION__HP:
				setHp((Integer)newValue);
				return;
			case Gr1616Package.MINION__ATTACK:
				setAttack((Integer)newValue);
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
			case Gr1616Package.MINION__INVENTORY:
				getInventory().clear();
				return;
			case Gr1616Package.MINION__HP:
				setHp(HP_EDEFAULT);
				return;
			case Gr1616Package.MINION__ATTACK:
				setAttack(ATTACK_EDEFAULT);
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
			case Gr1616Package.MINION__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case Gr1616Package.MINION__HP:
				return hp != HP_EDEFAULT;
			case Gr1616Package.MINION__ATTACK:
				return attack != ATTACK_EDEFAULT;
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
				case Gr1616Package.MINION__INVENTORY: return Gr1616Package.ABLE_TO_HOLD__INVENTORY;
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
				case Gr1616Package.ABLE_TO_HOLD__INVENTORY: return Gr1616Package.MINION__INVENTORY;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hp: ");
		result.append(hp);
		result.append(", attack: ");
		result.append(attack);
		result.append(')');
		return result.toString();
	}

} //MinionImpl
