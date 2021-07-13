/**
 */
package de.scheidtbachmann.osgimodel.provider;

import de.scheidtbachmann.osgimodel.util.OsgimodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgimodelItemProviderAdapterFactory extends OsgimodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "// ******************************************************************************\n//\n// Copyright (c) 2018 by\n// Scheidt & Bachmann System Technik GmbH, 24145 Kiel\n//\n// This program and the accompanying materials are made available under the\n// terms of the Eclipse Public License 2.0 which is available at\n// http://www.eclipse.org/legal/epl-2.0.\n// \n// SPDX-License-Identifier: EPL-2.0\n//\n// ******************************************************************************";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgimodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.OsgiProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsgiProjectItemProvider osgiProjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.OsgiProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOsgiProjectAdapter() {
		if (osgiProjectItemProvider == null) {
			osgiProjectItemProvider = new OsgiProjectItemProvider(this);
		}

		return osgiProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.Bundle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleItemProvider bundleItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBundleAdapter() {
		if (bundleItemProvider == null) {
			bundleItemProvider = new BundleItemProvider(this);
		}

		return bundleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.PackageObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageObjectItemProvider packageObjectItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageObjectAdapter() {
		if (packageObjectItemProvider == null) {
			packageObjectItemProvider = new PackageObjectItemProvider(this);
		}

		return packageObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.ServiceComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceComponentItemProvider serviceComponentItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceComponentAdapter() {
		if (serviceComponentItemProvider == null) {
			serviceComponentItemProvider = new ServiceComponentItemProvider(this);
		}

		return serviceComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.ServiceInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceItemProvider serviceInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceInterfaceAdapter() {
		if (serviceInterfaceItemProvider == null) {
			serviceInterfaceItemProvider = new ServiceInterfaceItemProvider(this);
		}

		return serviceInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.BundleCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleCategoryItemProvider bundleCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.BundleCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBundleCategoryAdapter() {
		if (bundleCategoryItemProvider == null) {
			bundleCategoryItemProvider = new BundleCategoryItemProvider(this);
		}

		return bundleCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.EclipseInjection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseInjectionItemProvider eclipseInjectionItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.EclipseInjection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEclipseInjectionAdapter() {
		if (eclipseInjectionItemProvider == null) {
			eclipseInjectionItemProvider = new EclipseInjectionItemProvider(this);
		}

		return eclipseInjectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.AttributeData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDataItemProvider attributeDataItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.AttributeData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDataAdapter() {
		if (attributeDataItemProvider == null) {
			attributeDataItemProvider = new AttributeDataItemProvider(this);
		}

		return attributeDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.scheidtbachmann.osgimodel.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.scheidtbachmann.osgimodel.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (osgiProjectItemProvider != null) osgiProjectItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (featureItemProvider != null) featureItemProvider.dispose();
		if (bundleItemProvider != null) bundleItemProvider.dispose();
		if (packageObjectItemProvider != null) packageObjectItemProvider.dispose();
		if (serviceComponentItemProvider != null) serviceComponentItemProvider.dispose();
		if (serviceInterfaceItemProvider != null) serviceInterfaceItemProvider.dispose();
		if (bundleCategoryItemProvider != null) bundleCategoryItemProvider.dispose();
		if (eclipseInjectionItemProvider != null) eclipseInjectionItemProvider.dispose();
		if (attributeDataItemProvider != null) attributeDataItemProvider.dispose();
		if (referenceItemProvider != null) referenceItemProvider.dispose();
	}

}
