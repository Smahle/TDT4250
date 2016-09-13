/**
 */
package gr1616.impl;

import gr1616.AbleToHold;
import gr1616.Armor;
import gr1616.ArmorClass;
import gr1616.DarkElf;
import gr1616.Dwarf;
import gr1616.Ent;
import gr1616.Game;
import gr1616.Gr1616Factory;
import gr1616.Gr1616Package;
import gr1616.GreatSpider;
import gr1616.Human;
import gr1616.Instance;
import gr1616.InstanceType;
import gr1616.Item;
import gr1616.ItemType;
import gr1616.Key;
import gr1616.KeyClass;
import gr1616.Minion;
import gr1616.Orc;
import gr1616.Person;
import gr1616.Player;
import gr1616.Potion;
import gr1616.PotionClass;
import gr1616.Root;
import gr1616.Warg;
import gr1616.Weapon;
import gr1616.WeaponClass;
import gr1616.Wizzard;

import no.hal.pgo.osm.OsmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gr1616PackageImpl extends EPackageImpl implements Gr1616Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potionClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armorClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaponClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass darkElfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dwarfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greatSpiderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizzardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wargEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ableToHoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weaponEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum armorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum potionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gr1616.Gr1616Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Gr1616PackageImpl() {
		super(eNS_URI, Gr1616Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Gr1616Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Gr1616Package init() {
		if (isInited) return (Gr1616Package)EPackage.Registry.INSTANCE.getEPackage(Gr1616Package.eNS_URI);

		// Obtain or create and register package
		Gr1616PackageImpl theGr1616Package = (Gr1616PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Gr1616PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Gr1616PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGr1616Package.createPackageContents();

		// Initialize created meta-data
		theGr1616Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGr1616Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Gr1616Package.eNS_URI, theGr1616Package);
		return theGr1616Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Game() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Item() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Person() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Minions() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Locations() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Players() {
		return (EReference)gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__GetNearby__Player() {
		return gameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__PlayerPickItem__Player_Item_boolean() {
		return gameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__PlayerVsPlayer__Player_Player() {
		return gameEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGame__PlayerVsMinion() {
		return gameEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Ids() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Owner() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Location() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_ItemType() {
		return (EReference)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotionClass() {
		return potionClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArmorClass() {
		return armorClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeaponClass() {
		return weaponClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeaponClass_Type() {
		return (EAttribute)weaponClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyClass() {
		return keyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_InstanceType() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceType() {
		return instanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceType_Name() {
		return (EAttribute)instanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_Person() {
		return (EReference)playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Nickname() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Xp() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_AttackPoints() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_ActiveWeapon() {
		return (EReference)playerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_ActiveArmor() {
		return (EReference)playerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Gold() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__GetRaceGoodAgainst() {
		return playerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlayer__GetAffraidOf() {
		return playerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDarkElf() {
		return darkElfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrc() {
		return orcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDwarf() {
		return dwarfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinion() {
		return minionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinion_Hp() {
		return (EAttribute)minionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinion_Attack() {
		return (EAttribute)minionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreatSpider() {
		return greatSpiderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizzard() {
		return wizzardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnt() {
		return entEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWarg() {
		return wargEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbleToHold() {
		return ableToHoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbleToHold_Inventory() {
		return (EReference)ableToHoldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeapon() {
		return weaponEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKey() {
		return keyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArmor() {
		return armorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPotion() {
		return potionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gr1616Factory getGr1616Factory() {
		return (Gr1616Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__GAME);
		createEReference(rootEClass, ROOT__ITEM);
		createEReference(rootEClass, ROOT__PERSON);
		createEReference(rootEClass, ROOT__MINIONS);
		createEReference(rootEClass, ROOT__LOCATIONS);

		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__PLAYERS);
		createEOperation(gameEClass, GAME___GET_NEARBY__PLAYER);
		createEOperation(gameEClass, GAME___PLAYER_PICK_ITEM__PLAYER_ITEM_BOOLEAN);
		createEOperation(gameEClass, GAME___PLAYER_VS_PLAYER__PLAYER_PLAYER);
		createEOperation(gameEClass, GAME___PLAYER_VS_MINION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__IDS);
		createEAttribute(personEClass, PERSON__NAME);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__OWNER);
		createEReference(itemEClass, ITEM__LOCATION);
		createEReference(itemEClass, ITEM__ITEM_TYPE);

		itemTypeEClass = createEClass(ITEM_TYPE);

		potionClassEClass = createEClass(POTION_CLASS);

		armorClassEClass = createEClass(ARMOR_CLASS);

		weaponClassEClass = createEClass(WEAPON_CLASS);
		createEAttribute(weaponClassEClass, WEAPON_CLASS__TYPE);

		keyClassEClass = createEClass(KEY_CLASS);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__INSTANCE_TYPE);

		instanceTypeEClass = createEClass(INSTANCE_TYPE);
		createEAttribute(instanceTypeEClass, INSTANCE_TYPE__NAME);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__PERSON);
		createEAttribute(playerEClass, PLAYER__NICKNAME);
		createEAttribute(playerEClass, PLAYER__XP);
		createEAttribute(playerEClass, PLAYER__ATTACK_POINTS);
		createEReference(playerEClass, PLAYER__ACTIVE_WEAPON);
		createEReference(playerEClass, PLAYER__ACTIVE_ARMOR);
		createEAttribute(playerEClass, PLAYER__GOLD);
		createEOperation(playerEClass, PLAYER___GET_RACE_GOOD_AGAINST);
		createEOperation(playerEClass, PLAYER___GET_AFFRAID_OF);

		darkElfEClass = createEClass(DARK_ELF);

		humanEClass = createEClass(HUMAN);

		orcEClass = createEClass(ORC);

		dwarfEClass = createEClass(DWARF);

		minionEClass = createEClass(MINION);
		createEAttribute(minionEClass, MINION__HP);
		createEAttribute(minionEClass, MINION__ATTACK);

		greatSpiderEClass = createEClass(GREAT_SPIDER);

		wizzardEClass = createEClass(WIZZARD);

		entEClass = createEClass(ENT);

		wargEClass = createEClass(WARG);

		ableToHoldEClass = createEClass(ABLE_TO_HOLD);
		createEReference(ableToHoldEClass, ABLE_TO_HOLD__INVENTORY);

		// Create enums
		weaponEEnum = createEEnum(WEAPON);
		keyEEnum = createEEnum(KEY);
		armorEEnum = createEEnum(ARMOR);
		potionEEnum = createEEnum(POTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemEClass.getESuperTypes().add(theOsmPackage.getGeoLocated());
		potionClassEClass.getESuperTypes().add(this.getItemType());
		armorClassEClass.getESuperTypes().add(this.getItemType());
		weaponClassEClass.getESuperTypes().add(this.getItemType());
		keyClassEClass.getESuperTypes().add(this.getItemType());
		instanceEClass.getESuperTypes().add(theOsmPackage.getGeoLocated());
		playerEClass.getESuperTypes().add(theOsmPackage.getGeoLocation());
		playerEClass.getESuperTypes().add(this.getAbleToHold());
		darkElfEClass.getESuperTypes().add(this.getPlayer());
		humanEClass.getESuperTypes().add(this.getPlayer());
		orcEClass.getESuperTypes().add(this.getPlayer());
		dwarfEClass.getESuperTypes().add(this.getPlayer());
		minionEClass.getESuperTypes().add(theOsmPackage.getGeoLocation());
		minionEClass.getESuperTypes().add(this.getAbleToHold());
		greatSpiderEClass.getESuperTypes().add(this.getMinion());
		wizzardEClass.getESuperTypes().add(this.getMinion());
		entEClass.getESuperTypes().add(this.getMinion());
		wargEClass.getESuperTypes().add(this.getMinion());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Game(), this.getGame(), null, "game", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Item(), this.getItemType(), null, "item", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Person(), this.getPerson(), null, "person", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Minions(), this.getMinion(), null, "minions", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Locations(), this.getInstance(), null, "Locations", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Players(), this.getPlayer(), null, "players", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGame__GetNearby__Player(), theOsmPackage.getGeoLocated(), "getNearby", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__PlayerPickItem__Player_Item_boolean(), ecorePackage.getEBoolean(), "playerPickItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlayer(), "player", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "onlyCheck", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGame__PlayerVsPlayer__Player_Player(), this.getPlayer(), "playerVsPlayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlayer(), "p1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlayer(), "p2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGame__PlayerVsMinion(), null, "playerVsMinion", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Owner(), this.getAbleToHold(), null, "owner", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Location(), theOsmPackage.getGeoLocated(), null, "location", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ItemType(), this.getItemType(), null, "itemType", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(potionClassEClass, PotionClass.class, "PotionClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(armorClassEClass, ArmorClass.class, "ArmorClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weaponClassEClass, WeaponClass.class, "WeaponClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeaponClass_Type(), this.getWeapon(), "type", null, 0, 1, WeaponClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyClassEClass, KeyClass.class, "KeyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_InstanceType(), this.getInstanceType(), null, "instanceType", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceTypeEClass, InstanceType.class, "InstanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_Person(), this.getPerson(), null, "person", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Xp(), ecorePackage.getEInt(), "xp", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_AttackPoints(), ecorePackage.getEInt(), "attackPoints", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_ActiveWeapon(), this.getWeaponClass(), null, "activeWeapon", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_ActiveArmor(), this.getArmorClass(), null, "activeArmor", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Gold(), ecorePackage.getEInt(), "gold", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlayer__GetRaceGoodAgainst(), this.getPlayer(), "getRaceGoodAgainst", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlayer__GetAffraidOf(), this.getMinion(), "getAffraidOf", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(darkElfEClass, DarkElf.class, "DarkElf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orcEClass, Orc.class, "Orc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dwarfEClass, Dwarf.class, "Dwarf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minionEClass, Minion.class, "Minion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinion_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Minion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinion_Attack(), ecorePackage.getEInt(), "attack", null, 0, 1, Minion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greatSpiderEClass, GreatSpider.class, "GreatSpider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wizzardEClass, Wizzard.class, "Wizzard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entEClass, Ent.class, "Ent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wargEClass, Warg.class, "Warg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ableToHoldEClass, AbleToHold.class, "AbleToHold", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbleToHold_Inventory(), this.getItem(), null, "inventory", null, 0, -1, AbleToHold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(weaponEEnum, Weapon.class, "Weapon");

		initEEnum(keyEEnum, Key.class, "Key");

		initEEnum(armorEEnum, Armor.class, "Armor");

		initEEnum(potionEEnum, Potion.class, "Potion");

		// Create resource
		createResource(eNS_URI);
	}

} //Gr1616PackageImpl
