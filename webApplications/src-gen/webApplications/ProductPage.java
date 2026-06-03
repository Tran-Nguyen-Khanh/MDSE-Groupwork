/**
 */
package webApplications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webApplications.ProductPage#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see webApplications.WebApplicationsPackage#getProductPage()
 * @model
 * @generated
 */
public interface ProductPage extends Page {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link webApplications.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see webApplications.WebApplicationsPackage#getProductPage_Product()
	 * @model
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void customizeProduct(Product product);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToCart(Product product);

} // ProductPage
