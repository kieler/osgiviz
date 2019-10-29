/**
 */
package de.scheidtbachmann.osgimodel.provider;


import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.OsgimodelFactory;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.scheidtbachmann.osgimodel.OsgiProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgiProjectItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgiProjectItemProvider(AdapterFactory adapterFactory) {
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

			addProjectNamePropertyDescriptor(object);
			addNumberOfJavaFilesPropertyDescriptor(object);
			addServiceComponentsPropertyDescriptor(object);
			addExportedPackagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsgiProject_projectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsgiProject_projectName_feature", "_UI_OsgiProject_type"),
				 OsgimodelPackage.Literals.OSGI_PROJECT__PROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Java Files feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfJavaFilesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsgiProject_numberOfJavaFiles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsgiProject_numberOfJavaFiles_feature", "_UI_OsgiProject_type"),
				 OsgimodelPackage.Literals.OSGI_PROJECT__NUMBER_OF_JAVA_FILES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsgiProject_serviceComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsgiProject_serviceComponents_feature", "_UI_OsgiProject_type"),
				 OsgimodelPackage.Literals.OSGI_PROJECT__SERVICE_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exported Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExportedPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OsgiProject_exportedPackages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OsgiProject_exportedPackages_feature", "_UI_OsgiProject_type"),
				 OsgimodelPackage.Literals.OSGI_PROJECT__EXPORTED_PACKAGES,
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
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__BUNDLES);
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__FEATURES);
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__SERVICE_INTERFACES);
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__PRODUCTS);
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__IMPORTED_PACKAGES);
			childrenFeatures.add(OsgimodelPackage.Literals.OSGI_PROJECT__BUNDLE_CATEGORIES);
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
	 * This returns OsgiProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OsgiProject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OsgiProject)object).getProjectName();
		return label == null || label.length() == 0 ?
			getString("_UI_OsgiProject_type") :
			getString("_UI_OsgiProject_type") + " " + label;
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

		switch (notification.getFeatureID(OsgiProject.class)) {
			case OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME:
			case OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
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
				(OsgimodelPackage.Literals.OSGI_PROJECT__BUNDLES,
				 OsgimodelFactory.eINSTANCE.createBundle()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.OSGI_PROJECT__FEATURES,
				 OsgimodelFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.OSGI_PROJECT__SERVICE_INTERFACES,
				 OsgimodelFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.OSGI_PROJECT__PRODUCTS,
				 OsgimodelFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.OSGI_PROJECT__IMPORTED_PACKAGES,
				 OsgimodelFactory.eINSTANCE.createPackageObject()));

		newChildDescriptors.add
			(createChildParameter
				(OsgimodelPackage.Literals.OSGI_PROJECT__BUNDLE_CATEGORIES,
				 OsgimodelFactory.eINSTANCE.createBundleCategory()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OsgiModelEditPlugin.INSTANCE;
	}

}
