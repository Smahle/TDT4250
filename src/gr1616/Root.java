/**
 */
package gr1616;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Root#getGame <em>Game</em>}</li>
 *   <li>{@link gr1616.Root#getItem <em>Item</em>}</li>
 *   <li>{@link gr1616.Root#getPerson <em>Person</em>}</li>
 *   <li>{@link gr1616.Root#getMinions <em>Minions</em>}</li>
 *   <li>{@link gr1616.Root#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' containment reference list.
	 * The list contents are of type {@link gr1616.Game}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' containment reference list.
	 * @see gr1616.Gr1616Package#getRoot_Game()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGame();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gr1616.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gr1616.Gr1616Package#getRoot_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gr1616.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gr1616.Gr1616Package#getRoot_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Minions</b></em>' reference list.
	 * The list contents are of type {@link gr1616.Minion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minions</em>' reference list.
	 * @see gr1616.Gr1616Package#getRoot_Minions()
	 * @model
	 * @generated
	 */
	EList<Minion> getMinions();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference.
	 * @see #setLocations(Instance)
	 * @see gr1616.Gr1616Package#getRoot_Locations()
	 * @model
	 * @generated
	 */
	Instance getLocations();

	/**
	 * Sets the value of the '{@link gr1616.Root#getLocations <em>Locations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(Instance value);

} // Root
