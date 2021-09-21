// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package nativemobile.proxies;

public class DebitCardDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject debitCardDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "NativeMobile.DebitCardDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		cardNumber("cardNumber"),
		CVV("CVV"),
		ExpDate("ExpDate"),
		BankAccountDetails_DebitCardDetails("NativeMobile.BankAccountDetails_DebitCardDetails");

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

	public DebitCardDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "NativeMobile.DebitCardDetails"));
	}

	protected DebitCardDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject debitCardDetailsMendixObject)
	{
		if (debitCardDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("NativeMobile.DebitCardDetails", debitCardDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a NativeMobile.DebitCardDetails");

		this.debitCardDetailsMendixObject = debitCardDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DebitCardDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static nativemobile.proxies.DebitCardDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return nativemobile.proxies.DebitCardDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static nativemobile.proxies.DebitCardDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new nativemobile.proxies.DebitCardDetails(context, mendixObject);
	}

	public static nativemobile.proxies.DebitCardDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return nativemobile.proxies.DebitCardDetails.initialize(context, mendixObject);
	}

	public static java.util.List<nativemobile.proxies.DebitCardDetails> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<nativemobile.proxies.DebitCardDetails> result = new java.util.ArrayList<nativemobile.proxies.DebitCardDetails>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//NativeMobile.DebitCardDetails" + xpathConstraint))
			result.add(nativemobile.proxies.DebitCardDetails.initialize(context, obj));
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
	 * @return value of cardNumber
	 */
	public final java.lang.Long getcardNumber()
	{
		return getcardNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of cardNumber
	 */
	public final java.lang.Long getcardNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.cardNumber.toString());
	}

	/**
	 * Set value of cardNumber
	 * @param cardnumber
	 */
	public final void setcardNumber(java.lang.Long cardnumber)
	{
		setcardNumber(getContext(), cardnumber);
	}

	/**
	 * Set value of cardNumber
	 * @param context
	 * @param cardnumber
	 */
	public final void setcardNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long cardnumber)
	{
		getMendixObject().setValue(context, MemberNames.cardNumber.toString(), cardnumber);
	}

	/**
	 * @return value of CVV
	 */
	public final java.lang.Long getCVV()
	{
		return getCVV(getContext());
	}

	/**
	 * @param context
	 * @return value of CVV
	 */
	public final java.lang.Long getCVV(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.CVV.toString());
	}

	/**
	 * Set value of CVV
	 * @param cvv
	 */
	public final void setCVV(java.lang.Long cvv)
	{
		setCVV(getContext(), cvv);
	}

	/**
	 * Set value of CVV
	 * @param context
	 * @param cvv
	 */
	public final void setCVV(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long cvv)
	{
		getMendixObject().setValue(context, MemberNames.CVV.toString(), cvv);
	}

	/**
	 * @return value of ExpDate
	 */
	public final java.util.Date getExpDate()
	{
		return getExpDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpDate
	 */
	public final java.util.Date getExpDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ExpDate.toString());
	}

	/**
	 * Set value of ExpDate
	 * @param expdate
	 */
	public final void setExpDate(java.util.Date expdate)
	{
		setExpDate(getContext(), expdate);
	}

	/**
	 * Set value of ExpDate
	 * @param context
	 * @param expdate
	 */
	public final void setExpDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date expdate)
	{
		getMendixObject().setValue(context, MemberNames.ExpDate.toString(), expdate);
	}

	/**
	 * @return value of BankAccountDetails_DebitCardDetails
	 */
	public final nativemobile.proxies.BankAccountDetails getBankAccountDetails_DebitCardDetails() throws com.mendix.core.CoreException
	{
		return getBankAccountDetails_DebitCardDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of BankAccountDetails_DebitCardDetails
	 */
	public final nativemobile.proxies.BankAccountDetails getBankAccountDetails_DebitCardDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nativemobile.proxies.BankAccountDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BankAccountDetails_DebitCardDetails.toString());
		if (identifier != null)
			result = nativemobile.proxies.BankAccountDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BankAccountDetails_DebitCardDetails
	 * @param bankaccountdetails_debitcarddetails
	 */
	public final void setBankAccountDetails_DebitCardDetails(nativemobile.proxies.BankAccountDetails bankaccountdetails_debitcarddetails)
	{
		setBankAccountDetails_DebitCardDetails(getContext(), bankaccountdetails_debitcarddetails);
	}

	/**
	 * Set value of BankAccountDetails_DebitCardDetails
	 * @param context
	 * @param bankaccountdetails_debitcarddetails
	 */
	public final void setBankAccountDetails_DebitCardDetails(com.mendix.systemwideinterfaces.core.IContext context, nativemobile.proxies.BankAccountDetails bankaccountdetails_debitcarddetails)
	{
		if (bankaccountdetails_debitcarddetails == null)
			getMendixObject().setValue(context, MemberNames.BankAccountDetails_DebitCardDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BankAccountDetails_DebitCardDetails.toString(), bankaccountdetails_debitcarddetails.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return debitCardDetailsMendixObject;
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
			final nativemobile.proxies.DebitCardDetails that = (nativemobile.proxies.DebitCardDetails) obj;
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
		return "NativeMobile.DebitCardDetails";
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
