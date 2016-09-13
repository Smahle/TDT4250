/**
 */
package gr1616.util;

import gr1616.*;

import no.hal.pgo.osm.GeoLocated;
import no.hal.pgo.osm.GeoLocation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gr1616.Gr1616Package
 * @generated
 */
public class Gr1616Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gr1616Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gr1616Switch() {
		if (modelPackage == null) {
			modelPackage = Gr1616Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Gr1616Package.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseGeoLocated(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.POTION_CLASS: {
				PotionClass potionClass = (PotionClass)theEObject;
				T result = casePotionClass(potionClass);
				if (result == null) result = caseItemType(potionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ARMOR_CLASS: {
				ArmorClass armorClass = (ArmorClass)theEObject;
				T result = caseArmorClass(armorClass);
				if (result == null) result = caseItemType(armorClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.WEAPON_CLASS: {
				WeaponClass weaponClass = (WeaponClass)theEObject;
				T result = caseWeaponClass(weaponClass);
				if (result == null) result = caseItemType(weaponClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.KEY_CLASS: {
				KeyClass keyClass = (KeyClass)theEObject;
				T result = caseKeyClass(keyClass);
				if (result == null) result = caseItemType(keyClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseGeoLocated(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.INSTANCE_TYPE: {
				InstanceType instanceType = (InstanceType)theEObject;
				T result = caseInstanceType(instanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.PLAYER: {
				Player player = (Player)theEObject;
				T result = casePlayer(player);
				if (result == null) result = caseGeoLocation(player);
				if (result == null) result = caseAbleToHold(player);
				if (result == null) result = caseGeoLocated(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.DARK_ELF: {
				DarkElf darkElf = (DarkElf)theEObject;
				T result = caseDarkElf(darkElf);
				if (result == null) result = casePlayer(darkElf);
				if (result == null) result = caseGeoLocation(darkElf);
				if (result == null) result = caseAbleToHold(darkElf);
				if (result == null) result = caseGeoLocated(darkElf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.HUMAN: {
				Human human = (Human)theEObject;
				T result = caseHuman(human);
				if (result == null) result = casePlayer(human);
				if (result == null) result = caseGeoLocation(human);
				if (result == null) result = caseAbleToHold(human);
				if (result == null) result = caseGeoLocated(human);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ORC: {
				Orc orc = (Orc)theEObject;
				T result = caseOrc(orc);
				if (result == null) result = casePlayer(orc);
				if (result == null) result = caseGeoLocation(orc);
				if (result == null) result = caseAbleToHold(orc);
				if (result == null) result = caseGeoLocated(orc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.DWARF: {
				Dwarf dwarf = (Dwarf)theEObject;
				T result = caseDwarf(dwarf);
				if (result == null) result = casePlayer(dwarf);
				if (result == null) result = caseGeoLocation(dwarf);
				if (result == null) result = caseAbleToHold(dwarf);
				if (result == null) result = caseGeoLocated(dwarf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.MINION: {
				Minion minion = (Minion)theEObject;
				T result = caseMinion(minion);
				if (result == null) result = caseGeoLocation(minion);
				if (result == null) result = caseAbleToHold(minion);
				if (result == null) result = caseGeoLocated(minion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.GREAT_SPIDER: {
				GreatSpider greatSpider = (GreatSpider)theEObject;
				T result = caseGreatSpider(greatSpider);
				if (result == null) result = caseMinion(greatSpider);
				if (result == null) result = caseGeoLocation(greatSpider);
				if (result == null) result = caseAbleToHold(greatSpider);
				if (result == null) result = caseGeoLocated(greatSpider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.WIZZARD: {
				Wizzard wizzard = (Wizzard)theEObject;
				T result = caseWizzard(wizzard);
				if (result == null) result = caseMinion(wizzard);
				if (result == null) result = caseGeoLocation(wizzard);
				if (result == null) result = caseAbleToHold(wizzard);
				if (result == null) result = caseGeoLocated(wizzard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ENT: {
				Ent ent = (Ent)theEObject;
				T result = caseEnt(ent);
				if (result == null) result = caseMinion(ent);
				if (result == null) result = caseGeoLocation(ent);
				if (result == null) result = caseAbleToHold(ent);
				if (result == null) result = caseGeoLocated(ent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.WARG: {
				Warg warg = (Warg)theEObject;
				T result = caseWarg(warg);
				if (result == null) result = caseMinion(warg);
				if (result == null) result = caseGeoLocation(warg);
				if (result == null) result = caseAbleToHold(warg);
				if (result == null) result = caseGeoLocated(warg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gr1616Package.ABLE_TO_HOLD: {
				AbleToHold ableToHold = (AbleToHold)theEObject;
				T result = caseAbleToHold(ableToHold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potion Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potion Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotionClass(PotionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Armor Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Armor Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArmorClass(ArmorClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weapon Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weapon Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeaponClass(WeaponClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyClass(KeyClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceType(InstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dark Elf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dark Elf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDarkElf(DarkElf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuman(Human object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrc(Orc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dwarf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dwarf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDwarf(Dwarf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinion(Minion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Great Spider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Great Spider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreatSpider(GreatSpider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wizzard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wizzard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWizzard(Wizzard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnt(Ent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarg(Warg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Able To Hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Able To Hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbleToHold(AbleToHold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoLocated(GeoLocated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoLocation(GeoLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Gr1616Switch
