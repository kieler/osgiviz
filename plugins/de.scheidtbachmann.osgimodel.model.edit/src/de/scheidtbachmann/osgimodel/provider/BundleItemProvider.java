/**
 */
package de.scheidtbachmann.osgimodel.provider;


import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.OsgimodelFactory;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.scheidtbachmann.osgimodel.Bundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleItemProvider extends BasicOsgiObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsExternalPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
			addVendorPropertyDescriptor(object);
			addRequiredBundlesPropertyDescriptor(object);
			addUsedByBundlePropertyDescriptor(object);
			addImportedPackagesPropertyDescriptor(object);
			addBundleCategoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_isExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_isExternal_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__IS_EXTERNAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_features_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__FEATURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vendor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVendorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_vendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_vendor_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__VENDOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required Bundles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredBundlesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_requiredBundles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_requiredBundles_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__REQUIRED_BUNDLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used By Bundle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedByBundlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_usedByBundle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_usedByBundle_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__USED_BY_BUNDLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_importedPackages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_importedPackages_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__IMPORTED_PACKAGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bundle Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBundleCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Bundle_bundleCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bundle_bundleCategory_feature", "_UI_Bundle_type"),
				 OsgimodelPackage.Literals.BUNDLE__BUNDLE_CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OsgimodelPackage.Literals.BUNDLE__SERVICE_COMPONENTS);
			childrenFeatures.add(OsgimodelPackage.Literals.BUNDLE__EXPORTED_PACKAGES);
			childrenFeatures.add(OsgimodelPackage.Literals.BUNDLE__MORE_DATA);
			childrenFeatures.add(OsgimodelPackage.Literals.BUNDLE__ECLIPSE_INJECTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Bundle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bundle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Bundle)object).getUniqueId();
		return label == null || label.length() == 0 ?
			getString("_UI_Bundle_type") :
			getString("_UI_Bundle_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Bundle.class)) {
			case OsgimodelPackage.BUNDLE__IS_EXTERNAL:
			case OsgimodelPackage.BUNDLE__VENDOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
			case OsgimodelPackage.BUNDLE__MORE_DATA:
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.BUNDLE__SERVICE_COMPONENTS,
				 OsgimodelFactory.eINSTANCE.createServiceComponent()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.BUNDLE__EXPORTED_PACKAGES,
				 OsgimodelFactory.eINSTANCE.createPackageObject()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.BUNDLE__MORE_DATA,
				 OsgimodelFactory.eINSTANCE.createAttributeData()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.BUNDLE__ECLIPSE_INJECTIONS,
				 OsgimodelFactory.eINSTANCE.createEclipseInjection()));
	}

}
