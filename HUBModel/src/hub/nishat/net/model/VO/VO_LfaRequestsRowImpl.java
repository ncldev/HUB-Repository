package hub.nishat.net.model.VO;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 30 10:01:57 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VO_LfaRequestsRowImpl
  extends ViewRowImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    LfaId
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getLfaId();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setLfaId((Number)value);
      }
    }
    ,
    LeaveId
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getLeaveId();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setLeaveId((Number)value);
      }
    }
    ,
    UserId
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getUserId();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setUserId((Number)value);
      }
    }
    ,
    FullNameChild
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getFullNameChild();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setFullNameChild((String)value);
      }
    }
    ,
    FullNameParent
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getFullNameParent();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setFullNameParent((String)value);
      }
    }
    ,
    LineManagerApproved
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getLineManagerApproved();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setLineManagerApproved((String)value);
      }
    }
    ,
    HrApproved
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getHrApproved();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setHrApproved((String)value);
      }
    }
    ,
    StartDate
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getStartDate();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setStartDate((Date)value);
      }
    }
    ,
    EndDate
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getEndDate();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setEndDate((Date)value);
      }
    }
    ,
    EmpCode
    {
      public Object get(VO_LfaRequestsRowImpl obj)
      {
        return obj.getEmpCode();
      }

      public void put(VO_LfaRequestsRowImpl obj, Object value)
      {
        obj.setEmpCode((String)value);
      }
    }
    ;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public abstract Object get(VO_LfaRequestsRowImpl object);

    public abstract void put(VO_LfaRequestsRowImpl object, Object value);

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }
  public static final int LFAID = AttributesEnum.LfaId.index();
  public static final int LEAVEID = AttributesEnum.LeaveId.index();
  public static final int USERID = AttributesEnum.UserId.index();
  public static final int FULLNAMECHILD = AttributesEnum.FullNameChild.index();
  public static final int FULLNAMEPARENT = AttributesEnum.FullNameParent.index();
  public static final int LINEMANAGERAPPROVED = AttributesEnum.LineManagerApproved.index();
  public static final int HRAPPROVED = AttributesEnum.HrApproved.index();
  public static final int STARTDATE = AttributesEnum.StartDate.index();
  public static final int ENDDATE = AttributesEnum.EndDate.index();
  public static final int EMPCODE = AttributesEnum.EmpCode.index();

  /**
   * This is the default constructor (do not remove).
   */
  public VO_LfaRequestsRowImpl()
  {
  }

  /**
   * Gets the attribute value for the calculated attribute LfaId.
   * @return the LfaId
   */
  public Number getLfaId()
  {
    return (Number) getAttributeInternal(LFAID);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute LfaId.
   * @param value value to set the  LfaId
   */
  public void setLfaId(Number value)
  {
    setAttributeInternal(LFAID, value);
  }

  /**
   * Gets the attribute value for the calculated attribute LeaveId.
   * @return the LeaveId
   */
  public Number getLeaveId()
  {
    return (Number) getAttributeInternal(LEAVEID);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute LeaveId.
   * @param value value to set the  LeaveId
   */
  public void setLeaveId(Number value)
  {
    setAttributeInternal(LEAVEID, value);
  }

  /**
   * Gets the attribute value for the calculated attribute UserId.
   * @return the UserId
   */
  public Number getUserId()
  {
    return (Number) getAttributeInternal(USERID);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute UserId.
   * @param value value to set the  UserId
   */
  public void setUserId(Number value)
  {
    setAttributeInternal(USERID, value);
  }

  /**
   * Gets the attribute value for the calculated attribute FullNameChild.
   * @return the FullNameChild
   */
  public String getFullNameChild()
  {
    return (String) getAttributeInternal(FULLNAMECHILD);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute FullNameChild.
   * @param value value to set the  FullNameChild
   */
  public void setFullNameChild(String value)
  {
    setAttributeInternal(FULLNAMECHILD, value);
  }

  /**
   * Gets the attribute value for the calculated attribute FullNameParent.
   * @return the FullNameParent
   */
  public String getFullNameParent()
  {
    return (String) getAttributeInternal(FULLNAMEPARENT);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute FullNameParent.
   * @param value value to set the  FullNameParent
   */
  public void setFullNameParent(String value)
  {
    setAttributeInternal(FULLNAMEPARENT, value);
  }

  /**
   * Gets the attribute value for the calculated attribute LineManagerApproved.
   * @return the LineManagerApproved
   */
  public String getLineManagerApproved()
  {
    String approval = (String) getAttributeInternal(LINEMANAGERAPPROVED);
    if(approval != null)
    {
      return approval.equals("Y")?"Approved":approval.equals("N")?"Disapproved":"";
    }
    else return null;
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute LineManagerApproved.
   * @param value value to set the  LineManagerApproved
   */
  public void setLineManagerApproved(String value)
  {
    setAttributeInternal(LINEMANAGERAPPROVED, value);
  }

  /**
   * Gets the attribute value for the calculated attribute HrApproved.
   * @return the HrApproved
   */
  public String getHrApproved()
  {
    String approval = (String) getAttributeInternal(HRAPPROVED);
    if(approval != null)
    {
      return approval.equals("Y")?"Approved":approval.equals("N")?"Disapproved":"";
    }
    else return null;
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute HrApproved.
   * @param value value to set the  HrApproved
   */
  public void setHrApproved(String value)
  {
    setAttributeInternal(HRAPPROVED, value);
  }

  /**
   * Gets the attribute value for the calculated attribute StartDate.
   * @return the StartDate
   */
  public Date getStartDate()
  {
    return (Date) getAttributeInternal(STARTDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute StartDate.
   * @param value value to set the  StartDate
   */
  public void setStartDate(Date value)
  {
    setAttributeInternal(STARTDATE, value);
  }

  /**
   * Gets the attribute value for the calculated attribute EndDate.
   * @return the EndDate
   */
  public Date getEndDate()
  {
    return (Date) getAttributeInternal(ENDDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute EndDate.
   * @param value value to set the  EndDate
   */
  public void setEndDate(Date value)
  {
    setAttributeInternal(ENDDATE, value);
  }

  /**
   * Gets the attribute value for the calculated attribute EmpCode.
   * @return the EmpCode
   */
  public String getEmpCode()
  {
    return (String) getAttributeInternal(EMPCODE);
  }

  /**
   * Sets <code>value</code> as the attribute value for the calculated attribute EmpCode.
   * @param value value to set the  EmpCode
   */
  public void setEmpCode(String value)
  {
    setAttributeInternal(EMPCODE, value);
  }

  /**
   * getAttrInvokeAccessor: generated method. Do not modify.
   * @param index the index identifying the attribute
   * @param attrDef the attribute

   * @return the attribute value
   * @throws Exception
   */
  protected Object getAttrInvokeAccessor(int index,
                                         AttributeDefImpl attrDef)
    throws Exception
  {
    if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count()))
    {
      return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
    }
    return super.getAttrInvokeAccessor(index, attrDef);
  }

  /**
   * setAttrInvokeAccessor: generated method. Do not modify.
   * @param index the index identifying the attribute
   * @param value the value to assign to the attribute
   * @param attrDef the attribute

   * @throws Exception
   */
  protected void setAttrInvokeAccessor(int index, Object value,
                                       AttributeDefImpl attrDef)
    throws Exception
  {
    if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count()))
    {
      AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
      return;
    }
    super.setAttrInvokeAccessor(index, value, attrDef);
  }
}
