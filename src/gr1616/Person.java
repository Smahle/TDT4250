/**
 */
package gr1616;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gr1616.Person#getIds <em>Ids</em>}</li>
 *   <li>{@link gr1616.Person#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gr1616.Gr1616Package#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute list.
	 * @see gr1616.Gr1616Package#getPerson_Ids()
	 * @model id="true"
	 * @generated
	 */
	EList<Integer> getIds();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gr1616.Gr1616Package#getPerson_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gr1616.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Person
