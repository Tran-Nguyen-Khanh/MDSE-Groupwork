/**
 */
package webApplications;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link webApplications.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link webApplications.User#isIsAdmin <em>Is Admin</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @see webApplications.WebApplicationsPackage#getUser_UserID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link webApplications.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see webApplications.WebApplicationsPackage#getUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link webApplications.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Is Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Admin</em>' attribute.
	 * @see #setIsAdmin(boolean)
	 * @see webApplications.WebApplicationsPackage#getUser_IsAdmin()
	 * @model
	 * @generated
	 */
	boolean isIsAdmin();

	/**
	 * Sets the value of the '{@link webApplications.User#isIsAdmin <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Admin</em>' attribute.
	 * @see #isIsAdmin()
	 * @generated
	 */
	void setIsAdmin(boolean value);

} // User
