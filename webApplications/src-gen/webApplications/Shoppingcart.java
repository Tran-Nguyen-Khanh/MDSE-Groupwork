/**
 */
package webApplications;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shoppingcart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.Shoppingcart#getProduct <em>Product</em>}</li>
 *   <li>{@link webApplications.Shoppingcart#getCartID <em>Cart ID</em>}</li>
 *   <li>{@link webApplications.Shoppingcart#getTotalPrice <em>Total Price</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getShoppingcart()
 * @model
 * @generated
 */
public interface Shoppingcart extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link webApplications.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see webApplications.WebApplicationsPackage#getShoppingcart_Product()
	 * @model
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * Returns the value of the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart ID</em>' attribute.
	 * @see #setCartID(int)
	 * @see webApplications.WebApplicationsPackage#getShoppingcart_CartID()
	 * @model
	 * @generated
	 */
	int getCartID();

	/**
	 * Sets the value of the '{@link webApplications.Shoppingcart#getCartID <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart ID</em>' attribute.
	 * @see #getCartID()
	 * @generated
	 */
	void setCartID(int value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @see webApplications.WebApplicationsPackage#getShoppingcart_TotalPrice()
	 * @model
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link webApplications.Shoppingcart#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void orderProduct(Product product);

} // Shoppingcart
