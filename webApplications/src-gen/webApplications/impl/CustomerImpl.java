/**
 */
package webApplications.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webApplications.Customer;
import webApplications.Order;
import webApplications.Shoppingcart;
import webApplications.WebApplicationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webApplications.impl.CustomerImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link webApplications.impl.CustomerImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link webApplications.impl.CustomerImpl#getShoppingcart <em>Shoppingcart</em>}</li>
 *   <li>{@link webApplications.impl.CustomerImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected String eMail = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShoppingcart() <em>Shoppingcart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingcart()
	 * @generated
	 * @ordered
	 */
	protected Shoppingcart shoppingcart;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		String oldEMail = eMail;
		eMail = newEMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.CUSTOMER__EMAIL, oldEMail,
					eMail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.CUSTOMER__ADRESS, oldAdress,
					adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shoppingcart getShoppingcart() {
		if (shoppingcart != null && shoppingcart.eIsProxy()) {
			InternalEObject oldShoppingcart = (InternalEObject) shoppingcart;
			shoppingcart = (Shoppingcart) eResolveProxy(oldShoppingcart);
			if (shoppingcart != oldShoppingcart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebApplicationsPackage.CUSTOMER__SHOPPINGCART, oldShoppingcart, shoppingcart));
			}
		}
		return shoppingcart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shoppingcart basicGetShoppingcart() {
		return shoppingcart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingcart(Shoppingcart newShoppingcart) {
		Shoppingcart oldShoppingcart = shoppingcart;
		shoppingcart = newShoppingcart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.CUSTOMER__SHOPPINGCART,
					oldShoppingcart, shoppingcart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrder() {
		if (order == null) {
			order = new EObjectResolvingEList<Order>(Order.class, this, WebApplicationsPackage.CUSTOMER__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationsPackage.CUSTOMER__EMAIL:
			return getEMail();
		case WebApplicationsPackage.CUSTOMER__ADRESS:
			return getAdress();
		case WebApplicationsPackage.CUSTOMER__SHOPPINGCART:
			if (resolve)
				return getShoppingcart();
			return basicGetShoppingcart();
		case WebApplicationsPackage.CUSTOMER__ORDER:
			return getOrder();
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
		case WebApplicationsPackage.CUSTOMER__EMAIL:
			setEMail((String) newValue);
			return;
		case WebApplicationsPackage.CUSTOMER__ADRESS:
			setAdress((String) newValue);
			return;
		case WebApplicationsPackage.CUSTOMER__SHOPPINGCART:
			setShoppingcart((Shoppingcart) newValue);
			return;
		case WebApplicationsPackage.CUSTOMER__ORDER:
			getOrder().clear();
			getOrder().addAll((Collection<? extends Order>) newValue);
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
		case WebApplicationsPackage.CUSTOMER__EMAIL:
			setEMail(EMAIL_EDEFAULT);
			return;
		case WebApplicationsPackage.CUSTOMER__ADRESS:
			setAdress(ADRESS_EDEFAULT);
			return;
		case WebApplicationsPackage.CUSTOMER__SHOPPINGCART:
			setShoppingcart((Shoppingcart) null);
			return;
		case WebApplicationsPackage.CUSTOMER__ORDER:
			getOrder().clear();
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
		case WebApplicationsPackage.CUSTOMER__EMAIL:
			return EMAIL_EDEFAULT == null ? eMail != null : !EMAIL_EDEFAULT.equals(eMail);
		case WebApplicationsPackage.CUSTOMER__ADRESS:
			return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
		case WebApplicationsPackage.CUSTOMER__SHOPPINGCART:
			return shoppingcart != null;
		case WebApplicationsPackage.CUSTOMER__ORDER:
			return order != null && !order.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (eMail: ");
		result.append(eMail);
		result.append(", adress: ");
		result.append(adress);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
