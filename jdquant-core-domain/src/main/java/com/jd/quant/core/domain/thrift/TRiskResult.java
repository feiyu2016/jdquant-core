/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jd.quant.core.domain.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-21")
public class TRiskResult implements org.apache.thrift.TBase<TRiskResult, TRiskResult._Fields>, java.io.Serializable, Cloneable, Comparable<TRiskResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRiskResult");

  private static final org.apache.thrift.protocol.TField MONTH_FIELD_DESC = new org.apache.thrift.protocol.TField("month", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RISK_OF_MONTH_FIELD_DESC = new org.apache.thrift.protocol.TField("riskOfMonth", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRiskResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRiskResultTupleSchemeFactory();

  public String month; // optional
  public java.util.List<TQuantSummary> riskOfMonth; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MONTH((short)1, "month"),
    RISK_OF_MONTH((short)2, "riskOfMonth");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MONTH
          return MONTH;
        case 2: // RISK_OF_MONTH
          return RISK_OF_MONTH;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.MONTH,_Fields.RISK_OF_MONTH};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MONTH, new org.apache.thrift.meta_data.FieldMetaData("month", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RISK_OF_MONTH, new org.apache.thrift.meta_data.FieldMetaData("riskOfMonth", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TQuantSummary.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRiskResult.class, metaDataMap);
  }

  public TRiskResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRiskResult(TRiskResult other) {
    if (other.isSetMonth()) {
      this.month = other.month;
    }
    if (other.isSetRiskOfMonth()) {
      java.util.List<TQuantSummary> __this__riskOfMonth = new java.util.ArrayList<TQuantSummary>(other.riskOfMonth.size());
      for (TQuantSummary other_element : other.riskOfMonth) {
        __this__riskOfMonth.add(new TQuantSummary(other_element));
      }
      this.riskOfMonth = __this__riskOfMonth;
    }
  }

  public TRiskResult deepCopy() {
    return new TRiskResult(this);
  }

  @Override
  public void clear() {
    this.month = null;
    this.riskOfMonth = null;
  }

  public String getMonth() {
    return this.month;
  }

  public TRiskResult setMonth(String month) {
    this.month = month;
    return this;
  }

  public void unsetMonth() {
    this.month = null;
  }

  /** Returns true if field month is set (has been assigned a value) and false otherwise */
  public boolean isSetMonth() {
    return this.month != null;
  }

  public void setMonthIsSet(boolean value) {
    if (!value) {
      this.month = null;
    }
  }

  public int getRiskOfMonthSize() {
    return (this.riskOfMonth == null) ? 0 : this.riskOfMonth.size();
  }

  public java.util.Iterator<TQuantSummary> getRiskOfMonthIterator() {
    return (this.riskOfMonth == null) ? null : this.riskOfMonth.iterator();
  }

  public void addToRiskOfMonth(TQuantSummary elem) {
    if (this.riskOfMonth == null) {
      this.riskOfMonth = new java.util.ArrayList<TQuantSummary>();
    }
    this.riskOfMonth.add(elem);
  }

  public java.util.List<TQuantSummary> getRiskOfMonth() {
    return this.riskOfMonth;
  }

  public TRiskResult setRiskOfMonth(java.util.List<TQuantSummary> riskOfMonth) {
    this.riskOfMonth = riskOfMonth;
    return this;
  }

  public void unsetRiskOfMonth() {
    this.riskOfMonth = null;
  }

  /** Returns true if field riskOfMonth is set (has been assigned a value) and false otherwise */
  public boolean isSetRiskOfMonth() {
    return this.riskOfMonth != null;
  }

  public void setRiskOfMonthIsSet(boolean value) {
    if (!value) {
      this.riskOfMonth = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MONTH:
      if (value == null) {
        unsetMonth();
      } else {
        setMonth((String)value);
      }
      break;

    case RISK_OF_MONTH:
      if (value == null) {
        unsetRiskOfMonth();
      } else {
        setRiskOfMonth((java.util.List<TQuantSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MONTH:
      return getMonth();

    case RISK_OF_MONTH:
      return getRiskOfMonth();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MONTH:
      return isSetMonth();
    case RISK_OF_MONTH:
      return isSetRiskOfMonth();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRiskResult)
      return this.equals((TRiskResult)that);
    return false;
  }

  public boolean equals(TRiskResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_month = true && this.isSetMonth();
    boolean that_present_month = true && that.isSetMonth();
    if (this_present_month || that_present_month) {
      if (!(this_present_month && that_present_month))
        return false;
      if (!this.month.equals(that.month))
        return false;
    }

    boolean this_present_riskOfMonth = true && this.isSetRiskOfMonth();
    boolean that_present_riskOfMonth = true && that.isSetRiskOfMonth();
    if (this_present_riskOfMonth || that_present_riskOfMonth) {
      if (!(this_present_riskOfMonth && that_present_riskOfMonth))
        return false;
      if (!this.riskOfMonth.equals(that.riskOfMonth))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMonth()) ? 131071 : 524287);
    if (isSetMonth())
      hashCode = hashCode * 8191 + month.hashCode();

    hashCode = hashCode * 8191 + ((isSetRiskOfMonth()) ? 131071 : 524287);
    if (isSetRiskOfMonth())
      hashCode = hashCode * 8191 + riskOfMonth.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRiskResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMonth()).compareTo(other.isSetMonth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.month, other.month);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRiskOfMonth()).compareTo(other.isSetRiskOfMonth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRiskOfMonth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.riskOfMonth, other.riskOfMonth);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TRiskResult(");
    boolean first = true;

    if (isSetMonth()) {
      sb.append("month:");
      if (this.month == null) {
        sb.append("null");
      } else {
        sb.append(this.month);
      }
      first = false;
    }
    if (isSetRiskOfMonth()) {
      if (!first) sb.append(", ");
      sb.append("riskOfMonth:");
      if (this.riskOfMonth == null) {
        sb.append("null");
      } else {
        sb.append(this.riskOfMonth);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TRiskResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRiskResultStandardScheme getScheme() {
      return new TRiskResultStandardScheme();
    }
  }

  private static class TRiskResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRiskResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRiskResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MONTH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.month = iprot.readString();
              struct.setMonthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RISK_OF_MONTH
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list18 = iprot.readListBegin();
                struct.riskOfMonth = new java.util.ArrayList<TQuantSummary>(_list18.size);
                TQuantSummary _elem19;
                for (int _i20 = 0; _i20 < _list18.size; ++_i20)
                {
                  _elem19 = new TQuantSummary();
                  _elem19.read(iprot);
                  struct.riskOfMonth.add(_elem19);
                }
                iprot.readListEnd();
              }
              struct.setRiskOfMonthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRiskResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.month != null) {
        if (struct.isSetMonth()) {
          oprot.writeFieldBegin(MONTH_FIELD_DESC);
          oprot.writeString(struct.month);
          oprot.writeFieldEnd();
        }
      }
      if (struct.riskOfMonth != null) {
        if (struct.isSetRiskOfMonth()) {
          oprot.writeFieldBegin(RISK_OF_MONTH_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.riskOfMonth.size()));
            for (TQuantSummary _iter21 : struct.riskOfMonth)
            {
              _iter21.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRiskResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRiskResultTupleScheme getScheme() {
      return new TRiskResultTupleScheme();
    }
  }

  private static class TRiskResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRiskResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRiskResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMonth()) {
        optionals.set(0);
      }
      if (struct.isSetRiskOfMonth()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMonth()) {
        oprot.writeString(struct.month);
      }
      if (struct.isSetRiskOfMonth()) {
        {
          oprot.writeI32(struct.riskOfMonth.size());
          for (TQuantSummary _iter22 : struct.riskOfMonth)
          {
            _iter22.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRiskResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.month = iprot.readString();
        struct.setMonthIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.riskOfMonth = new java.util.ArrayList<TQuantSummary>(_list23.size);
          TQuantSummary _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = new TQuantSummary();
            _elem24.read(iprot);
            struct.riskOfMonth.add(_elem24);
          }
        }
        struct.setRiskOfMonthIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

