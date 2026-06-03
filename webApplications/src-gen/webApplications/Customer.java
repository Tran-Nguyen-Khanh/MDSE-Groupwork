/**
 */
package webApplications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.Customer#getEMail <em>EMail</em>}</li>
 *   <li>{@link webApplications.Customer#getAdress <em>Adress</em>}</li>
 *   <li>{@link webApplications.Customer#getShoppingcart <em>Shoppingcart</em>}</li>
 *   <li>{@link webApplications.Customer#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see webApplications.WebApplicationsPackage#getCustomer_EMail()
	 * @model required="true"
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link webApplications.Customer#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see webApplications.WebApplicationsPackage#getCustomer_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link webApplications.Customer#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Shoppingcart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoppingcart</em>' reference.
	 * @see #setShoppingcart(Shoppingcart)
	 * @see webApplications.WebApplicationsPackage#getCustomer_Shoppingcart()
	 * @model required="true"
	 * @generated
	 */
	Shoppingcart getShoppingcart();

	/**
	 * Sets the value of the '{@link webApplications.Customer#getShoppingcart <em>Shoppingcart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoppingcart</em>' reference.
	 * @see #getShoppingcart()
	 * @generated
	 */
	void setShoppingcart(Shoppingcart value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference list.
	 * The list contents are of type {@link webApplications.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference list.
	 * @see webApplications.WebApplicationsPackage#getCustomer_Order()
	 * @model
	 * @generated
	 */
	EList<Order> getOrder();

} // Customer
