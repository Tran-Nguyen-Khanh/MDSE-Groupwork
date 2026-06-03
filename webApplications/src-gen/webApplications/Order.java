/**
 */
package webApplications;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.Order#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link webApplications.Order#getProduct <em>Product</em>}</li>
 *   <li>{@link webApplications.Order#getDate <em>Date</em>}</li>
 *   <li>{@link webApplications.Order#getStatus <em>Status</em>}</li>
 *   <li>{@link webApplications.Order#getTotalPrice <em>Total Price</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(int)
	 * @see webApplications.WebApplicationsPackage#getOrder_OrderID()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getOrderID();

	/**
	 * Sets the value of the '{@link webApplications.Order#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link webApplications.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see webApplications.WebApplicationsPackage#getOrder_Product()
	 * @model
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see webApplications.WebApplicationsPackage#getOrder_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link webApplications.Order#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see webApplications.WebApplicationsPackage#getOrder_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link webApplications.Order#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @see webApplications.WebApplicationsPackage#getOrder_TotalPrice()
	 * @model
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link webApplications.Order#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(float value);

} // Order
