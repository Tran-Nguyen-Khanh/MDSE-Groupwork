/**
 */
package webApplications.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webApplications.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebApplicationsFactoryImpl extends EFactoryImpl implements WebApplicationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebApplicationsFactory init() {
		try {
			WebApplicationsFactory theWebApplicationsFactory = (WebApplicationsFactory) EPackage.Registry.INSTANCE
					.getEFactory(WebApplicationsPackage.eNS_URI);
			if (theWebApplicationsFactory != null) {
				return theWebApplicationsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebApplicationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApplicationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WebApplicationsPackage.WEB_APPLICATION:
			return createWebApplication();
		case WebApplicationsPackage.PAGE:
			return createPage();
		case WebApplicationsPackage.DATABASE:
			return createDatabase();
		case WebApplicationsPackage.USER:
			return createUser();
		case WebApplicationsPackage.CUSTOMER:
			return createCustomer();
		case WebApplicationsPackage.ADMIN:
			return createAdmin();
		case WebApplicationsPackage.PRODUCT:
			return createProduct();
		case WebApplicationsPackage.ORDER:
			return createOrder();
		case WebApplicationsPackage.SHOPPINGCART:
			return createShoppingcart();
		case WebApplicationsPackage.WELCOME_PAGE:
			return createWelcomePage();
		case WebApplicationsPackage.PRODUCT_PAGE:
			return createProductPage();
		case WebApplicationsPackage.CHECKOUT_PAGE:
			return createCheckoutPage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebApplication createWebApplication() {
		WebApplicationImpl webApplication = new WebApplicationImpl();
		return webApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shoppingcart createShoppingcart() {
		ShoppingcartImpl shoppingcart = new ShoppingcartImpl();
		return shoppingcart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WelcomePage createWelcomePage() {
		WelcomePageImpl welcomePage = new WelcomePageImpl();
		return welcomePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPage createProductPage() {
		ProductPageImpl productPage = new ProductPageImpl();
		return productPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckoutPage createCheckoutPage() {
		CheckoutPageImpl checkoutPage = new CheckoutPageImpl();
		return checkoutPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebApplicationsPackage getWebApplicationsPackage() {
		return (WebApplicationsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebApplicationsPackage getPackage() {
		return WebApplicationsPackage.eINSTANCE;
	}

} //WebApplicationsFactoryImpl
