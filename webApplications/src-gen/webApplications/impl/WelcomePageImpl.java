/**
 */
package webApplications.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import webApplications.WebApplicationsPackage;
import webApplications.WelcomePage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Welcome Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WelcomePageImpl extends PageImpl implements WelcomePage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WelcomePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.WELCOME_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void login(String username, String password) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WebApplicationsPackage.WELCOME_PAGE___LOGIN__STRING_STRING:
			login((String) arguments.get(0), (String) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //WelcomePageImpl
