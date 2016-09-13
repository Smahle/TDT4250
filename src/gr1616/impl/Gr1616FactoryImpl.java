/**
 */
package gr1616.impl;

import gr1616.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gr1616FactoryImpl extends EFactoryImpl implements Gr1616Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gr1616Factory init() {
		try {
			Gr1616Factory theGr1616Factory = (Gr1616Factory)EPackage.Registry.INSTANCE.getEFactory(Gr1616Package.eNS_URI);
			if (theGr1616Factory != null) {
				return theGr1616Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gr1616FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gr1616FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Gr1616Package.ROOT: return createRoot();
			case Gr1616Package.GAME: return createGame();
			case Gr1616Package.PERSON: return createPerson();
			case Gr1616Package.ITEM: return createItem();
			case Gr1616Package.POTION_CLASS: return createPotionClass();
			case Gr1616Package.ARMOR_CLASS: return createArmorClass();
			case Gr1616Package.WEAPON_CLASS: return createWeaponClass();
			case Gr1616Package.KEY_CLASS: return createKeyClass();
			case Gr1616Package.INSTANCE: return createInstance();
			case Gr1616Package.INSTANCE_TYPE: return createInstanceType();
			case Gr1616Package.DARK_ELF: return createDarkElf();
			case Gr1616Package.HUMAN: return createHuman();
			case Gr1616Package.ORC: return createOrc();
			case Gr1616Package.DWARF: return createDwarf();
			case Gr1616Package.MINION: return createMinion();
			case Gr1616Package.GREAT_SPIDER: return createGreatSpider();
			case Gr1616Package.WIZZARD: return createWizzard();
			case Gr1616Package.ENT: return createEnt();
			case Gr1616Package.WARG: return createWarg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Gr1616Package.WEAPON:
				return createWeaponFromString(eDataType, initialValue);
			case Gr1616Package.KEY:
				return createKeyFromString(eDataType, initialValue);
			case Gr1616Package.ARMOR:
				return createArmorFromString(eDataType, initialValue);
			case Gr1616Package.POTION:
				return createPotionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Gr1616Package.WEAPON:
				return convertWeaponToString(eDataType, instanceValue);
			case Gr1616Package.KEY:
				return convertKeyToString(eDataType, instanceValue);
			case Gr1616Package.ARMOR:
				return convertArmorToString(eDataType, instanceValue);
			case Gr1616Package.POTION:
				return convertPotionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotionClass createPotionClass() {
		PotionClassImpl potionClass = new PotionClassImpl();
		return potionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmorClass createArmorClass() {
		ArmorClassImpl armorClass = new ArmorClassImpl();
		return armorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponClass createWeaponClass() {
		WeaponClassImpl weaponClass = new WeaponClassImpl();
		return weaponClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyClass createKeyClass() {
		KeyClassImpl keyClass = new KeyClassImpl();
		return keyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType createInstanceType() {
		InstanceTypeImpl instanceType = new InstanceTypeImpl();
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DarkElf createDarkElf() {
		DarkElfImpl darkElf = new DarkElfImpl();
		return darkElf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Human createHuman() {
		HumanImpl human = new HumanImpl();
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orc createOrc() {
		OrcImpl orc = new OrcImpl();
		return orc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dwarf createDwarf() {
		DwarfImpl dwarf = new DwarfImpl();
		return dwarf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minion createMinion() {
		MinionImpl minion = new MinionImpl();
		return minion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreatSpider createGreatSpider() {
		GreatSpiderImpl greatSpider = new GreatSpiderImpl();
		return greatSpider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizzard createWizzard() {
		WizzardImpl wizzard = new WizzardImpl();
		return wizzard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ent createEnt() {
		EntImpl ent = new EntImpl();
		return ent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warg createWarg() {
		WargImpl warg = new WargImpl();
		return warg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weapon createWeaponFromString(EDataType eDataType, String initialValue) {
		Weapon result = Weapon.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeaponToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKeyFromString(EDataType eDataType, String initialValue) {
		Key result = Key.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Armor createArmorFromString(EDataType eDataType, String initialValue) {
		Armor result = Armor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArmorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Potion createPotionFromString(EDataType eDataType, String initialValue) {
		Potion result = Potion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPotionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gr1616Package getGr1616Package() {
		return (Gr1616Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gr1616Package getPackage() {
		return Gr1616Package.eINSTANCE;
	}

} //Gr1616FactoryImpl
