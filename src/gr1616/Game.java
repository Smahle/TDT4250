/**
 */
package gr1616;

import no.hal.pgo.osm.GeoLocated;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Game#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link gr1616.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see gr1616.Gr1616Package#getGame_Players()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GeoLocated getNearby(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean playerPickItem(Player player, Item item, boolean onlyCheck);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Player playerVsPlayer(Player p1, Player p2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void playerVsMinion();

} // Game
