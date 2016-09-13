/**
 */
package gr1616;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Able To Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.AbleToHold#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getAbleToHold()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbleToHold extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' reference list.
	 * The list contents are of type {@link gr1616.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' reference list.
	 * @see gr1616.Gr1616Package#getAbleToHold_Inventory()
	 * @model
	 * @generated
	 */
	EList<Item> getInventory();

} // AbleToHold
