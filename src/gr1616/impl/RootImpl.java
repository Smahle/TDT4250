/**
 */
package gr1616.impl;

import gr1616.Game;
import gr1616.Gr1616Package;
import gr1616.Instance;
import gr1616.ItemType;
import gr1616.Minion;
import gr1616.Person;
import gr1616.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gr1616.impl.RootImpl#getGame <em>Game</em>}</li>
 *   <li>{@link gr1616.impl.RootImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gr1616.impl.RootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gr1616.impl.RootImpl#getMinions <em>Minions</em>}</li>
 *   <li>{@link gr1616.impl.RootImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getGame() <em>Game</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> game;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> item;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The cached value of the '{@link #getMinions() <em>Minions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinions()
	 * @generated
	 * @ordered
	 */
	protected EList<Minion> minions;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected Instance locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gr1616Package.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getGame() {
		if (game == null) {
			game = new EObjectContainmentEList<Game>(Game.class, this, Gr1616Package.ROOT__GAME);
		}
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, Gr1616Package.ROOT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, Gr1616Package.ROOT__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minion> getMinions() {
		if (minions == null) {
			minions = new EObjectResolvingEList<Minion>(Minion.class, this, Gr1616Package.ROOT__MINIONS);
		}
		return minions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getLocations() {
		if (locations != null && locations.eIsProxy()) {
			InternalEObject oldLocations = (InternalEObject)locations;
			locations = (Instance)eResolveProxy(oldLocations);
			if (locations != oldLocations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gr1616Package.ROOT__LOCATIONS, oldLocations, locations));
			}
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance basicGetLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(Instance newLocations) {
		Instance oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gr1616Package.ROOT__LOCATIONS, oldLocations, locations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gr1616Package.ROOT__GAME:
				return ((InternalEList<?>)getGame()).basicRemove(otherEnd, msgs);
			case Gr1616Package.ROOT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case Gr1616Package.ROOT__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
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
			case Gr1616Package.ROOT__GAME:
				return getGame();
			case Gr1616Package.ROOT__ITEM:
				return getItem();
			case Gr1616Package.ROOT__PERSON:
				return getPerson();
			case Gr1616Package.ROOT__MINIONS:
				return getMinions();
			case Gr1616Package.ROOT__LOCATIONS:
				if (resolve) return getLocations();
				return basicGetLocations();
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
			case Gr1616Package.ROOT__GAME:
				getGame().clear();
				getGame().addAll((Collection<? extends Game>)newValue);
				return;
			case Gr1616Package.ROOT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case Gr1616Package.ROOT__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case Gr1616Package.ROOT__MINIONS:
				getMinions().clear();
				getMinions().addAll((Collection<? extends Minion>)newValue);
				return;
			case Gr1616Package.ROOT__LOCATIONS:
				setLocations((Instance)newValue);
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
			case Gr1616Package.ROOT__GAME:
				getGame().clear();
				return;
			case Gr1616Package.ROOT__ITEM:
				getItem().clear();
				return;
			case Gr1616Package.ROOT__PERSON:
				getPerson().clear();
				return;
			case Gr1616Package.ROOT__MINIONS:
				getMinions().clear();
				return;
			case Gr1616Package.ROOT__LOCATIONS:
				setLocations((Instance)null);
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
			case Gr1616Package.ROOT__GAME:
				return game != null && !game.isEmpty();
			case Gr1616Package.ROOT__ITEM:
				return item != null && !item.isEmpty();
			case Gr1616Package.ROOT__PERSON:
				return person != null && !person.isEmpty();
			case Gr1616Package.ROOT__MINIONS:
				return minions != null && !minions.isEmpty();
			case Gr1616Package.ROOT__LOCATIONS:
				return locations != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
