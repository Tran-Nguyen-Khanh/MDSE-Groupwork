/**
 */
package webApplications;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.Database#getName <em>Name</em>}</li>
 *   <li>{@link webApplications.Database#getType <em>Type</em>}</li>
 *   <li>{@link webApplications.Database#getConnURL <em>Conn URL</em>}</li>
 *   <li>{@link webApplications.Database#getUser <em>User</em>}</li>
 *   <li>{@link webApplications.Database#getProduct <em>Product</em>}</li>
 *   <li>{@link webApplications.Database#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see webApplications.WebApplicationsPackage#getDatabase_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link webApplications.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see webApplications.WebApplicationsPackage#getDatabase_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link webApplications.Database#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Conn URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conn URL</em>' attribute.
	 * @see #setConnURL(String)
	 * @see webApplications.WebApplicationsPackage#getDatabase_ConnURL()
	 * @model
	 * @generated
	 */
	String getConnURL();

	/**
	 * Sets the value of the '{@link webApplications.Database#getConnURL <em>Conn URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conn URL</em>' attribute.
	 * @see #getConnURL()
	 * @generated
	 */
	void setConnURL(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link webApplications.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see webApplications.WebApplicationsPackage#getDatabase_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link webApplications.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see webApplications.WebApplicationsPackage#getDatabase_Product()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link webApplications.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see webApplications.WebApplicationsPackage#getDatabase_Order()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrder();

} // Database
