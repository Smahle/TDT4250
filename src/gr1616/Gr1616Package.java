/**
 */
package gr1616;

import no.hal.pgo.osm.OsmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gr1616.Gr1616Factory
 * @model kind="package"
 * @generated
 */
public interface Gr1616Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gr1616";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.gr16nn.model/model/gr1616.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr1616";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gr1616Package eINSTANCE = gr1616.impl.Gr1616PackageImpl.init();

	/**
	 * The meta object id for the '{@link gr1616.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.RootImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__GAME = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PERSON = 2;

	/**
	 * The feature id for the '<em><b>Minions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MINIONS = 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LOCATIONS = 4;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.GameImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getGame()
	 * @generated
	 */
	int GAME = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Nearby</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_NEARBY__PLAYER = 0;

	/**
	 * The operation id for the '<em>Player Pick Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___PLAYER_PICK_ITEM__PLAYER_ITEM_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Player Vs Player</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___PLAYER_VS_PLAYER__PLAYER_PLAYER = 2;

	/**
	 * The operation id for the '<em>Player Vs Minion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___PLAYER_VS_MINION = 3;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gr1616.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.PersonImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.ItemImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OWNER = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LOCATION = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_TYPE = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_LAT_LONG = OsmPackage.GEO_LOCATED___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = OsmPackage.GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.ItemType <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.ItemType
	 * @see gr1616.impl.Gr1616PackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.PotionClassImpl <em>Potion Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.PotionClassImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getPotionClass()
	 * @generated
	 */
	int POTION_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Potion Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION_CLASS_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Potion Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTION_CLASS_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.ArmorClassImpl <em>Armor Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.ArmorClassImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getArmorClass()
	 * @generated
	 */
	int ARMOR_CLASS = 6;

	/**
	 * The number of structural features of the '<em>Armor Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_CLASS_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Armor Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARMOR_CLASS_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.WeaponClassImpl <em>Weapon Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.WeaponClassImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getWeaponClass()
	 * @generated
	 */
	int WEAPON_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_CLASS__TYPE = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weapon Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_CLASS_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weapon Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_CLASS_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.KeyClassImpl <em>Key Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.KeyClassImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getKeyClass()
	 * @generated
	 */
	int KEY_CLASS = 8;

	/**
	 * The number of structural features of the '<em>Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CLASS_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CLASS_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.InstanceImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__INSTANCE_TYPE = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE___GET_LAT_LONG = OsmPackage.GEO_LOCATED___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = OsmPackage.GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.InstanceTypeImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getInstanceType()
	 * @generated
	 */
	int INSTANCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gr1616.Player <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.Player
	 * @see gr1616.impl.Gr1616PackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 11;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__INVENTORY = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NICKNAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__XP = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ATTACK_POINTS = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ACTIVE_WEAPON = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ACTIVE_ARMOR = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GOLD = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Race Good Against</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_RACE_GOOD_AGAINST = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Affraid Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_AFFRAID_OF = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link gr1616.impl.DarkElfImpl <em>Dark Elf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.DarkElfImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getDarkElf()
	 * @generated
	 */
	int DARK_ELF = 12;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__LATITUDE = PLAYER__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__LONGITUDE = PLAYER__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__INVENTORY = PLAYER__INVENTORY;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__PERSON = PLAYER__PERSON;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__NICKNAME = PLAYER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__XP = PLAYER__XP;

	/**
	 * The feature id for the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__ATTACK_POINTS = PLAYER__ATTACK_POINTS;

	/**
	 * The feature id for the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__ACTIVE_WEAPON = PLAYER__ACTIVE_WEAPON;

	/**
	 * The feature id for the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__ACTIVE_ARMOR = PLAYER__ACTIVE_ARMOR;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF__GOLD = PLAYER__GOLD;

	/**
	 * The number of structural features of the '<em>Dark Elf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF___GET_LAT_LONG = PLAYER___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Race Good Against</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF___GET_RACE_GOOD_AGAINST = PLAYER___GET_RACE_GOOD_AGAINST;

	/**
	 * The operation id for the '<em>Get Affraid Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF___GET_AFFRAID_OF = PLAYER___GET_AFFRAID_OF;

	/**
	 * The number of operations of the '<em>Dark Elf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_ELF_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.HumanImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 13;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__LATITUDE = PLAYER__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__LONGITUDE = PLAYER__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__INVENTORY = PLAYER__INVENTORY;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__PERSON = PLAYER__PERSON;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__NICKNAME = PLAYER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__XP = PLAYER__XP;

	/**
	 * The feature id for the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ATTACK_POINTS = PLAYER__ATTACK_POINTS;

	/**
	 * The feature id for the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ACTIVE_WEAPON = PLAYER__ACTIVE_WEAPON;

	/**
	 * The feature id for the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ACTIVE_ARMOR = PLAYER__ACTIVE_ARMOR;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__GOLD = PLAYER__GOLD;

	/**
	 * The number of structural features of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN___GET_LAT_LONG = PLAYER___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Race Good Against</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN___GET_RACE_GOOD_AGAINST = PLAYER___GET_RACE_GOOD_AGAINST;

	/**
	 * The operation id for the '<em>Get Affraid Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN___GET_AFFRAID_OF = PLAYER___GET_AFFRAID_OF;

	/**
	 * The number of operations of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.OrcImpl <em>Orc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.OrcImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getOrc()
	 * @generated
	 */
	int ORC = 14;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__LATITUDE = PLAYER__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__LONGITUDE = PLAYER__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__INVENTORY = PLAYER__INVENTORY;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__PERSON = PLAYER__PERSON;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__NICKNAME = PLAYER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__XP = PLAYER__XP;

	/**
	 * The feature id for the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__ATTACK_POINTS = PLAYER__ATTACK_POINTS;

	/**
	 * The feature id for the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__ACTIVE_WEAPON = PLAYER__ACTIVE_WEAPON;

	/**
	 * The feature id for the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__ACTIVE_ARMOR = PLAYER__ACTIVE_ARMOR;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC__GOLD = PLAYER__GOLD;

	/**
	 * The number of structural features of the '<em>Orc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC___GET_LAT_LONG = PLAYER___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Race Good Against</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC___GET_RACE_GOOD_AGAINST = PLAYER___GET_RACE_GOOD_AGAINST;

	/**
	 * The operation id for the '<em>Get Affraid Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC___GET_AFFRAID_OF = PLAYER___GET_AFFRAID_OF;

	/**
	 * The number of operations of the '<em>Orc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORC_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.DwarfImpl <em>Dwarf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.DwarfImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getDwarf()
	 * @generated
	 */
	int DWARF = 15;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__LATITUDE = PLAYER__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__LONGITUDE = PLAYER__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__INVENTORY = PLAYER__INVENTORY;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__PERSON = PLAYER__PERSON;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__NICKNAME = PLAYER__NICKNAME;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__XP = PLAYER__XP;

	/**
	 * The feature id for the '<em><b>Attack Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__ATTACK_POINTS = PLAYER__ATTACK_POINTS;

	/**
	 * The feature id for the '<em><b>Active Weapon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__ACTIVE_WEAPON = PLAYER__ACTIVE_WEAPON;

	/**
	 * The feature id for the '<em><b>Active Armor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__ACTIVE_ARMOR = PLAYER__ACTIVE_ARMOR;

	/**
	 * The feature id for the '<em><b>Gold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF__GOLD = PLAYER__GOLD;

	/**
	 * The number of structural features of the '<em>Dwarf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF___GET_LAT_LONG = PLAYER___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Race Good Against</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF___GET_RACE_GOOD_AGAINST = PLAYER___GET_RACE_GOOD_AGAINST;

	/**
	 * The operation id for the '<em>Get Affraid Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF___GET_AFFRAID_OF = PLAYER___GET_AFFRAID_OF;

	/**
	 * The number of operations of the '<em>Dwarf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DWARF_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.MinionImpl <em>Minion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.MinionImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getMinion()
	 * @generated
	 */
	int MINION = 16;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION__INVENTORY = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION__HP = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION__ATTACK = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Minion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Minion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINION_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.GreatSpiderImpl <em>Great Spider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.GreatSpiderImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getGreatSpider()
	 * @generated
	 */
	int GREAT_SPIDER = 17;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER__LATITUDE = MINION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER__LONGITUDE = MINION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER__INVENTORY = MINION__INVENTORY;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER__HP = MINION__HP;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER__ATTACK = MINION__ATTACK;

	/**
	 * The number of structural features of the '<em>Great Spider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER_FEATURE_COUNT = MINION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER___GET_LAT_LONG = MINION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Great Spider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREAT_SPIDER_OPERATION_COUNT = MINION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.WizzardImpl <em>Wizzard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.WizzardImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getWizzard()
	 * @generated
	 */
	int WIZZARD = 18;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD__LATITUDE = MINION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD__LONGITUDE = MINION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD__INVENTORY = MINION__INVENTORY;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD__HP = MINION__HP;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD__ATTACK = MINION__ATTACK;

	/**
	 * The number of structural features of the '<em>Wizzard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD_FEATURE_COUNT = MINION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD___GET_LAT_LONG = MINION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Wizzard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZZARD_OPERATION_COUNT = MINION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.EntImpl <em>Ent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.EntImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getEnt()
	 * @generated
	 */
	int ENT = 19;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT__LATITUDE = MINION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT__LONGITUDE = MINION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT__INVENTORY = MINION__INVENTORY;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT__HP = MINION__HP;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT__ATTACK = MINION__ATTACK;

	/**
	 * The number of structural features of the '<em>Ent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT_FEATURE_COUNT = MINION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT___GET_LAT_LONG = MINION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Ent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENT_OPERATION_COUNT = MINION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.impl.WargImpl <em>Warg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.impl.WargImpl
	 * @see gr1616.impl.Gr1616PackageImpl#getWarg()
	 * @generated
	 */
	int WARG = 20;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG__LATITUDE = MINION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG__LONGITUDE = MINION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG__INVENTORY = MINION__INVENTORY;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG__HP = MINION__HP;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG__ATTACK = MINION__ATTACK;

	/**
	 * The number of structural features of the '<em>Warg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG_FEATURE_COUNT = MINION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG___GET_LAT_LONG = MINION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Warg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARG_OPERATION_COUNT = MINION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gr1616.AbleToHold <em>Able To Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.AbleToHold
	 * @see gr1616.impl.Gr1616PackageImpl#getAbleToHold()
	 * @generated
	 */
	int ABLE_TO_HOLD = 21;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLE_TO_HOLD__INVENTORY = 0;

	/**
	 * The number of structural features of the '<em>Able To Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLE_TO_HOLD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Able To Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLE_TO_HOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gr1616.Weapon <em>Weapon</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.Weapon
	 * @see gr1616.impl.Gr1616PackageImpl#getWeapon()
	 * @generated
	 */
	int WEAPON = 22;

	/**
	 * The meta object id for the '{@link gr1616.Key <em>Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.Key
	 * @see gr1616.impl.Gr1616PackageImpl#getKey()
	 * @generated
	 */
	int KEY = 23;

	/**
	 * The meta object id for the '{@link gr1616.Armor <em>Armor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.Armor
	 * @see gr1616.impl.Gr1616PackageImpl#getArmor()
	 * @generated
	 */
	int ARMOR = 24;

	/**
	 * The meta object id for the '{@link gr1616.Potion <em>Potion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gr1616.Potion
	 * @see gr1616.impl.Gr1616PackageImpl#getPotion()
	 * @generated
	 */
	int POTION = 25;


	/**
	 * Returns the meta object for class '{@link gr1616.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see gr1616.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link gr1616.Root#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game</em>'.
	 * @see gr1616.Root#getGame()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link gr1616.Root#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see gr1616.Root#getItem()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link gr1616.Root#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see gr1616.Root#getPerson()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Person();

	/**
	 * Returns the meta object for the reference list '{@link gr1616.Root#getMinions <em>Minions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minions</em>'.
	 * @see gr1616.Root#getMinions()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Minions();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Root#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locations</em>'.
	 * @see gr1616.Root#getLocations()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Locations();

	/**
	 * Returns the meta object for class '{@link gr1616.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see gr1616.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the reference list '{@link gr1616.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see gr1616.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the '{@link gr1616.Game#getNearby(gr1616.Player) <em>Get Nearby</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nearby</em>' operation.
	 * @see gr1616.Game#getNearby(gr1616.Player)
	 * @generated
	 */
	EOperation getGame__GetNearby__Player();

	/**
	 * Returns the meta object for the '{@link gr1616.Game#playerPickItem(gr1616.Player, gr1616.Item, boolean) <em>Player Pick Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Player Pick Item</em>' operation.
	 * @see gr1616.Game#playerPickItem(gr1616.Player, gr1616.Item, boolean)
	 * @generated
	 */
	EOperation getGame__PlayerPickItem__Player_Item_boolean();

	/**
	 * Returns the meta object for the '{@link gr1616.Game#playerVsPlayer(gr1616.Player, gr1616.Player) <em>Player Vs Player</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Player Vs Player</em>' operation.
	 * @see gr1616.Game#playerVsPlayer(gr1616.Player, gr1616.Player)
	 * @generated
	 */
	EOperation getGame__PlayerVsPlayer__Player_Player();

	/**
	 * Returns the meta object for the '{@link gr1616.Game#playerVsMinion() <em>Player Vs Minion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Player Vs Minion</em>' operation.
	 * @see gr1616.Game#playerVsMinion()
	 * @generated
	 */
	EOperation getGame__PlayerVsMinion();

	/**
	 * Returns the meta object for class '{@link gr1616.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see gr1616.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute list '{@link gr1616.Person#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see gr1616.Person#getIds()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Ids();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gr1616.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link gr1616.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see gr1616.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Item#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see gr1616.Item#getOwner()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Owner();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Item#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see gr1616.Item#getLocation()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Location();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Item#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see gr1616.Item#getItemType()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ItemType();

	/**
	 * Returns the meta object for class '{@link gr1616.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see gr1616.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for class '{@link gr1616.PotionClass <em>Potion Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potion Class</em>'.
	 * @see gr1616.PotionClass
	 * @generated
	 */
	EClass getPotionClass();

	/**
	 * Returns the meta object for class '{@link gr1616.ArmorClass <em>Armor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Armor Class</em>'.
	 * @see gr1616.ArmorClass
	 * @generated
	 */
	EClass getArmorClass();

	/**
	 * Returns the meta object for class '{@link gr1616.WeaponClass <em>Weapon Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weapon Class</em>'.
	 * @see gr1616.WeaponClass
	 * @generated
	 */
	EClass getWeaponClass();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.WeaponClass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gr1616.WeaponClass#getType()
	 * @see #getWeaponClass()
	 * @generated
	 */
	EAttribute getWeaponClass_Type();

	/**
	 * Returns the meta object for class '{@link gr1616.KeyClass <em>Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Class</em>'.
	 * @see gr1616.KeyClass
	 * @generated
	 */
	EClass getKeyClass();

	/**
	 * Returns the meta object for class '{@link gr1616.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see gr1616.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Instance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Type</em>'.
	 * @see gr1616.Instance#getInstanceType()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_InstanceType();

	/**
	 * Returns the meta object for class '{@link gr1616.InstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Type</em>'.
	 * @see gr1616.InstanceType
	 * @generated
	 */
	EClass getInstanceType();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.InstanceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gr1616.InstanceType#getName()
	 * @see #getInstanceType()
	 * @generated
	 */
	EAttribute getInstanceType_Name();

	/**
	 * Returns the meta object for class '{@link gr1616.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see gr1616.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Player#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see gr1616.Player#getPerson()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Person();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Player#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see gr1616.Player#getNickname()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Player#getXp <em>Xp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xp</em>'.
	 * @see gr1616.Player#getXp()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Xp();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Player#getAttackPoints <em>Attack Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Points</em>'.
	 * @see gr1616.Player#getAttackPoints()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_AttackPoints();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Player#getActiveWeapon <em>Active Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Weapon</em>'.
	 * @see gr1616.Player#getActiveWeapon()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_ActiveWeapon();

	/**
	 * Returns the meta object for the reference '{@link gr1616.Player#getActiveArmor <em>Active Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Armor</em>'.
	 * @see gr1616.Player#getActiveArmor()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_ActiveArmor();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Player#getGold <em>Gold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gold</em>'.
	 * @see gr1616.Player#getGold()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Gold();

	/**
	 * Returns the meta object for the '{@link gr1616.Player#getRaceGoodAgainst() <em>Get Race Good Against</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Race Good Against</em>' operation.
	 * @see gr1616.Player#getRaceGoodAgainst()
	 * @generated
	 */
	EOperation getPlayer__GetRaceGoodAgainst();

	/**
	 * Returns the meta object for the '{@link gr1616.Player#getAffraidOf() <em>Get Affraid Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Affraid Of</em>' operation.
	 * @see gr1616.Player#getAffraidOf()
	 * @generated
	 */
	EOperation getPlayer__GetAffraidOf();

	/**
	 * Returns the meta object for class '{@link gr1616.DarkElf <em>Dark Elf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dark Elf</em>'.
	 * @see gr1616.DarkElf
	 * @generated
	 */
	EClass getDarkElf();

	/**
	 * Returns the meta object for class '{@link gr1616.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see gr1616.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for class '{@link gr1616.Orc <em>Orc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orc</em>'.
	 * @see gr1616.Orc
	 * @generated
	 */
	EClass getOrc();

	/**
	 * Returns the meta object for class '{@link gr1616.Dwarf <em>Dwarf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dwarf</em>'.
	 * @see gr1616.Dwarf
	 * @generated
	 */
	EClass getDwarf();

	/**
	 * Returns the meta object for class '{@link gr1616.Minion <em>Minion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minion</em>'.
	 * @see gr1616.Minion
	 * @generated
	 */
	EClass getMinion();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Minion#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see gr1616.Minion#getHp()
	 * @see #getMinion()
	 * @generated
	 */
	EAttribute getMinion_Hp();

	/**
	 * Returns the meta object for the attribute '{@link gr1616.Minion#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see gr1616.Minion#getAttack()
	 * @see #getMinion()
	 * @generated
	 */
	EAttribute getMinion_Attack();

	/**
	 * Returns the meta object for class '{@link gr1616.GreatSpider <em>Great Spider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Great Spider</em>'.
	 * @see gr1616.GreatSpider
	 * @generated
	 */
	EClass getGreatSpider();

	/**
	 * Returns the meta object for class '{@link gr1616.Wizzard <em>Wizzard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizzard</em>'.
	 * @see gr1616.Wizzard
	 * @generated
	 */
	EClass getWizzard();

	/**
	 * Returns the meta object for class '{@link gr1616.Ent <em>Ent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ent</em>'.
	 * @see gr1616.Ent
	 * @generated
	 */
	EClass getEnt();

	/**
	 * Returns the meta object for class '{@link gr1616.Warg <em>Warg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warg</em>'.
	 * @see gr1616.Warg
	 * @generated
	 */
	EClass getWarg();

	/**
	 * Returns the meta object for class '{@link gr1616.AbleToHold <em>Able To Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Able To Hold</em>'.
	 * @see gr1616.AbleToHold
	 * @generated
	 */
	EClass getAbleToHold();

	/**
	 * Returns the meta object for the reference list '{@link gr1616.AbleToHold#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inventory</em>'.
	 * @see gr1616.AbleToHold#getInventory()
	 * @see #getAbleToHold()
	 * @generated
	 */
	EReference getAbleToHold_Inventory();

	/**
	 * Returns the meta object for enum '{@link gr1616.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weapon</em>'.
	 * @see gr1616.Weapon
	 * @generated
	 */
	EEnum getWeapon();

	/**
	 * Returns the meta object for enum '{@link gr1616.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key</em>'.
	 * @see gr1616.Key
	 * @generated
	 */
	EEnum getKey();

	/**
	 * Returns the meta object for enum '{@link gr1616.Armor <em>Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Armor</em>'.
	 * @see gr1616.Armor
	 * @generated
	 */
	EEnum getArmor();

	/**
	 * Returns the meta object for enum '{@link gr1616.Potion <em>Potion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Potion</em>'.
	 * @see gr1616.Potion
	 * @generated
	 */
	EEnum getPotion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gr1616Factory getGr1616Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gr1616.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.RootImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__GAME = eINSTANCE.getRoot_Game();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ITEM = eINSTANCE.getRoot_Item();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PERSON = eINSTANCE.getRoot_Person();

		/**
		 * The meta object literal for the '<em><b>Minions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MINIONS = eINSTANCE.getRoot_Minions();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__LOCATIONS = eINSTANCE.getRoot_Locations();

		/**
		 * The meta object literal for the '{@link gr1616.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.GameImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Get Nearby</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___GET_NEARBY__PLAYER = eINSTANCE.getGame__GetNearby__Player();

		/**
		 * The meta object literal for the '<em><b>Player Pick Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___PLAYER_PICK_ITEM__PLAYER_ITEM_BOOLEAN = eINSTANCE.getGame__PlayerPickItem__Player_Item_boolean();

		/**
		 * The meta object literal for the '<em><b>Player Vs Player</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___PLAYER_VS_PLAYER__PLAYER_PLAYER = eINSTANCE.getGame__PlayerVsPlayer__Player_Player();

		/**
		 * The meta object literal for the '<em><b>Player Vs Minion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___PLAYER_VS_MINION = eINSTANCE.getGame__PlayerVsMinion();

		/**
		 * The meta object literal for the '{@link gr1616.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.PersonImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IDS = eINSTANCE.getPerson_Ids();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link gr1616.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.ItemImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OWNER = eINSTANCE.getItem_Owner();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__LOCATION = eINSTANCE.getItem_Location();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEM_TYPE = eINSTANCE.getItem_ItemType();

		/**
		 * The meta object literal for the '{@link gr1616.ItemType <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.ItemType
		 * @see gr1616.impl.Gr1616PackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '{@link gr1616.impl.PotionClassImpl <em>Potion Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.PotionClassImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getPotionClass()
		 * @generated
		 */
		EClass POTION_CLASS = eINSTANCE.getPotionClass();

		/**
		 * The meta object literal for the '{@link gr1616.impl.ArmorClassImpl <em>Armor Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.ArmorClassImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getArmorClass()
		 * @generated
		 */
		EClass ARMOR_CLASS = eINSTANCE.getArmorClass();

		/**
		 * The meta object literal for the '{@link gr1616.impl.WeaponClassImpl <em>Weapon Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.WeaponClassImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getWeaponClass()
		 * @generated
		 */
		EClass WEAPON_CLASS = eINSTANCE.getWeaponClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON_CLASS__TYPE = eINSTANCE.getWeaponClass_Type();

		/**
		 * The meta object literal for the '{@link gr1616.impl.KeyClassImpl <em>Key Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.KeyClassImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getKeyClass()
		 * @generated
		 */
		EClass KEY_CLASS = eINSTANCE.getKeyClass();

		/**
		 * The meta object literal for the '{@link gr1616.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.InstanceImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__INSTANCE_TYPE = eINSTANCE.getInstance_InstanceType();

		/**
		 * The meta object literal for the '{@link gr1616.impl.InstanceTypeImpl <em>Instance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.InstanceTypeImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getInstanceType()
		 * @generated
		 */
		EClass INSTANCE_TYPE = eINSTANCE.getInstanceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_TYPE__NAME = eINSTANCE.getInstanceType_Name();

		/**
		 * The meta object literal for the '{@link gr1616.Player <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.Player
		 * @see gr1616.impl.Gr1616PackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NICKNAME = eINSTANCE.getPlayer_Nickname();

		/**
		 * The meta object literal for the '<em><b>Xp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__XP = eINSTANCE.getPlayer_Xp();

		/**
		 * The meta object literal for the '<em><b>Attack Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ATTACK_POINTS = eINSTANCE.getPlayer_AttackPoints();

		/**
		 * The meta object literal for the '<em><b>Active Weapon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ACTIVE_WEAPON = eINSTANCE.getPlayer_ActiveWeapon();

		/**
		 * The meta object literal for the '<em><b>Active Armor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ACTIVE_ARMOR = eINSTANCE.getPlayer_ActiveArmor();

		/**
		 * The meta object literal for the '<em><b>Gold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__GOLD = eINSTANCE.getPlayer_Gold();

		/**
		 * The meta object literal for the '<em><b>Get Race Good Against</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___GET_RACE_GOOD_AGAINST = eINSTANCE.getPlayer__GetRaceGoodAgainst();

		/**
		 * The meta object literal for the '<em><b>Get Affraid Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___GET_AFFRAID_OF = eINSTANCE.getPlayer__GetAffraidOf();

		/**
		 * The meta object literal for the '{@link gr1616.impl.DarkElfImpl <em>Dark Elf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.DarkElfImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getDarkElf()
		 * @generated
		 */
		EClass DARK_ELF = eINSTANCE.getDarkElf();

		/**
		 * The meta object literal for the '{@link gr1616.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.HumanImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '{@link gr1616.impl.OrcImpl <em>Orc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.OrcImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getOrc()
		 * @generated
		 */
		EClass ORC = eINSTANCE.getOrc();

		/**
		 * The meta object literal for the '{@link gr1616.impl.DwarfImpl <em>Dwarf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.DwarfImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getDwarf()
		 * @generated
		 */
		EClass DWARF = eINSTANCE.getDwarf();

		/**
		 * The meta object literal for the '{@link gr1616.impl.MinionImpl <em>Minion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.MinionImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getMinion()
		 * @generated
		 */
		EClass MINION = eINSTANCE.getMinion();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINION__HP = eINSTANCE.getMinion_Hp();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINION__ATTACK = eINSTANCE.getMinion_Attack();

		/**
		 * The meta object literal for the '{@link gr1616.impl.GreatSpiderImpl <em>Great Spider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.GreatSpiderImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getGreatSpider()
		 * @generated
		 */
		EClass GREAT_SPIDER = eINSTANCE.getGreatSpider();

		/**
		 * The meta object literal for the '{@link gr1616.impl.WizzardImpl <em>Wizzard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.WizzardImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getWizzard()
		 * @generated
		 */
		EClass WIZZARD = eINSTANCE.getWizzard();

		/**
		 * The meta object literal for the '{@link gr1616.impl.EntImpl <em>Ent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.EntImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getEnt()
		 * @generated
		 */
		EClass ENT = eINSTANCE.getEnt();

		/**
		 * The meta object literal for the '{@link gr1616.impl.WargImpl <em>Warg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.impl.WargImpl
		 * @see gr1616.impl.Gr1616PackageImpl#getWarg()
		 * @generated
		 */
		EClass WARG = eINSTANCE.getWarg();

		/**
		 * The meta object literal for the '{@link gr1616.AbleToHold <em>Able To Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.AbleToHold
		 * @see gr1616.impl.Gr1616PackageImpl#getAbleToHold()
		 * @generated
		 */
		EClass ABLE_TO_HOLD = eINSTANCE.getAbleToHold();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLE_TO_HOLD__INVENTORY = eINSTANCE.getAbleToHold_Inventory();

		/**
		 * The meta object literal for the '{@link gr1616.Weapon <em>Weapon</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.Weapon
		 * @see gr1616.impl.Gr1616PackageImpl#getWeapon()
		 * @generated
		 */
		EEnum WEAPON = eINSTANCE.getWeapon();

		/**
		 * The meta object literal for the '{@link gr1616.Key <em>Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.Key
		 * @see gr1616.impl.Gr1616PackageImpl#getKey()
		 * @generated
		 */
		EEnum KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '{@link gr1616.Armor <em>Armor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.Armor
		 * @see gr1616.impl.Gr1616PackageImpl#getArmor()
		 * @generated
		 */
		EEnum ARMOR = eINSTANCE.getArmor();

		/**
		 * The meta object literal for the '{@link gr1616.Potion <em>Potion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gr1616.Potion
		 * @see gr1616.impl.Gr1616PackageImpl#getPotion()
		 * @generated
		 */
		EEnum POTION = eINSTANCE.getPotion();

	}

} //Gr1616Package
