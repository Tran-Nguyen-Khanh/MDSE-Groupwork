/**
 */
package webApplications.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webApplications.Product;
import webApplications.Shoppingcart;
import webApplications.WebApplicationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shoppingcart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webApplications.impl.ShoppingcartImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link webApplications.impl.ShoppingcartImpl#getCartID <em>Cart ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingcartImpl extends MinimalEObjectImpl.Container implements Shoppingcart {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> product;

	/**
	 * The default value of the '{@link #getCartID() <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartID()
	 * @generated
	 * @ordered
	 */
	protected static final int CART_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCartID() <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartID()
	 * @generated
	 * @ordered
	 */
	protected int cartID = CART_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingcartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.SHOPPINGCART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProduct() {
		if (product == null) {
			product = new EObjectResolvingEList<Product>(Product.class, this,
					WebApplicationsPackage.SHOPPINGCART__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCartID() {
		return cartID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartID(int newCartID) {
		int oldCartID = cartID;
		cartID = newCartID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.SHOPPINGCART__CART_ID,
					oldCartID, cartID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void orderProduct(Product product) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void sumUpPries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationsPackage.SHOPPINGCART__PRODUCT:
			return getProduct();
		case WebApplicationsPackage.SHOPPINGCART__CART_ID:
			return getCartID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebApplicationsPackage.SHOPPINGCART__PRODUCT:
			getProduct().clear();
			getProduct().addAll((Collection<? extends Product>) newValue);
			return;
		case WebApplicationsPackage.SHOPPINGCART__CART_ID:
			setCartID((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WebApplicationsPackage.SHOPPINGCART__PRODUCT:
			getProduct().clear();
			return;
		case WebApplicationsPackage.SHOPPINGCART__CART_ID:
			setCartID(CART_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WebApplicationsPackage.SHOPPINGCART__PRODUCT:
			return product != null && !product.isEmpty();
		case WebApplicationsPackage.SHOPPINGCART__CART_ID:
			return cartID != CART_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WebApplicationsPackage.SHOPPINGCART___ORDER_PRODUCT__PRODUCT:
			orderProduct((Product) arguments.get(0));
			return null;
		case WebApplicationsPackage.SHOPPINGCART___SUM_UP_PRIES:
			sumUpPries();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cartID: ");
		result.append(cartID);
		result.append(')');
		return result.toString();
	}

} //ShoppingcartImpl
