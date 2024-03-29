// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobile.proxies;

public class Bank
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bankMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NativeMobile.Bank";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BankName("BankName"),
		Bank_BankAccountDetails("NativeMobile.Bank_BankAccountDetails");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Bank(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NativeMobile.Bank"));
	}

	protected Bank(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bankMendixObject)
	{
		if (bankMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NativeMobile.Bank", bankMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NativeMobile.Bank");

		this.bankMendixObject = bankMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Bank.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static nativemobile.proxies.Bank initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nativemobile.proxies.Bank.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nativemobile.proxies.Bank initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nativemobile.proxies.Bank(context, mendixObject);
	}

	public static nativemobile.proxies.Bank load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nativemobile.proxies.Bank.initialize(context, mendixObject);
	}

	public static java.util.List<nativemobile.proxies.Bank> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nativemobile.proxies.Bank> result = new java.util.ArrayList<nativemobile.proxies.Bank>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NativeMobile.Bank" + xpathConstraint))
			result.add(nativemobile.proxies.Bank.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of BankName
	 */
	public final java.lang.String getBankName()
	{
		return getBankName(getContext());
	}

	/**
	 * @param context
	 * @return value of BankName
	 */
	public final java.lang.String getBankName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BankName.toString());
	}

	/**
	 * Set value of BankName
	 * @param bankname
	 */
	public final void setBankName(java.lang.String bankname)
	{
		setBankName(getContext(), bankname);
	}

	/**
	 * Set value of BankName
	 * @param context
	 * @param bankname
	 */
	public final void setBankName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bankname)
	{
		getMendixObject().setValue(context, MemberNames.BankName.toString(), bankname);
	}

	/**
	 * @return value of Bank_BankAccountDetails
	 */
	public final nativemobile.proxies.BankAccountDetails getBank_BankAccountDetails() throws com.mendix.core.CoreException
	{
		return getBank_BankAccountDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Bank_BankAccountDetails
	 */
	public final nativemobile.proxies.BankAccountDetails getBank_BankAccountDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nativemobile.proxies.BankAccountDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Bank_BankAccountDetails.toString());
		if (identifier != null)
			result = nativemobile.proxies.BankAccountDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Bank_BankAccountDetails
	 * @param bank_bankaccountdetails
	 */
	public final void setBank_BankAccountDetails(nativemobile.proxies.BankAccountDetails bank_bankaccountdetails)
	{
		setBank_BankAccountDetails(getContext(), bank_bankaccountdetails);
	}

	/**
	 * Set value of Bank_BankAccountDetails
	 * @param context
	 * @param bank_bankaccountdetails
	 */
	public final void setBank_BankAccountDetails(com.mendix.systemwideinterfaces.core.IContext context, nativemobile.proxies.BankAccountDetails bank_bankaccountdetails)
	{
		if (bank_bankaccountdetails == null)
			getMendixObject().setValue(context, MemberNames.Bank_BankAccountDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Bank_BankAccountDetails.toString(), bank_bankaccountdetails.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bankMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final nativemobile.proxies.Bank that = (nativemobile.proxies.Bank) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "NativeMobile.Bank";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
