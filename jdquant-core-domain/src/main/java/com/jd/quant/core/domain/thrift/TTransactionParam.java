/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jd.quant.core.domain.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-15")
public class TTransactionParam implements org.apache.thrift.TBase<TTransactionParam, TTransactionParam._Fields>, java.io.Serializable, Cloneable, Comparable<TTransactionParam> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTransactionParam");

  private static final org.apache.thrift.protocol.TField BENCHMARK_FIELD_DESC = new org.apache.thrift.protocol.TField("benchmark", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SLIPPAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("slippage", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMMISSION_FIELD_DESC = new org.apache.thrift.protocol.TField("commission", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TAX_PERCENT_FIELD_DESC = new org.apache.thrift.protocol.TField("taxPercent", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTransactionParamStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTransactionParamTupleSchemeFactory();

  public String benchmark; // optional
  public String slippage; // optional
  public String commission; // optional
  public String taxPercent; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BENCHMARK((short)1, "benchmark"),
    SLIPPAGE((short)2, "slippage"),
    COMMISSION((short)3, "commission"),
    TAX_PERCENT((short)4, "taxPercent");

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
        case 1: // BENCHMARK
          return BENCHMARK;
        case 2: // SLIPPAGE
          return SLIPPAGE;
        case 3: // COMMISSION
          return COMMISSION;
        case 4: // TAX_PERCENT
          return TAX_PERCENT;
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
  private static final _Fields optionals[] = {_Fields.BENCHMARK,_Fields.SLIPPAGE,_Fields.COMMISSION,_Fields.TAX_PERCENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BENCHMARK, new org.apache.thrift.meta_data.FieldMetaData("benchmark", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLIPPAGE, new org.apache.thrift.meta_data.FieldMetaData("slippage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMMISSION, new org.apache.thrift.meta_data.FieldMetaData("commission", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAX_PERCENT, new org.apache.thrift.meta_data.FieldMetaData("taxPercent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTransactionParam.class, metaDataMap);
  }

  public TTransactionParam() {
    this.benchmark = "399300.SZ";

    this.slippage = "0.002";

    this.commission = "0.00025";

    this.taxPercent = "0.001";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTransactionParam(TTransactionParam other) {
    if (other.isSetBenchmark()) {
      this.benchmark = other.benchmark;
    }
    if (other.isSetSlippage()) {
      this.slippage = other.slippage;
    }
    if (other.isSetCommission()) {
      this.commission = other.commission;
    }
    if (other.isSetTaxPercent()) {
      this.taxPercent = other.taxPercent;
    }
  }

  public TTransactionParam deepCopy() {
    return new TTransactionParam(this);
  }

  @Override
  public void clear() {
    this.benchmark = "399300.SZ";

    this.slippage = "0.002";

    this.commission = "0.00025";

    this.taxPercent = "0.001";

  }

  public String getBenchmark() {
    return this.benchmark;
  }

  public TTransactionParam setBenchmark(String benchmark) {
    this.benchmark = benchmark;
    return this;
  }

  public void unsetBenchmark() {
    this.benchmark = null;
  }

  /** Returns true if field benchmark is set (has been assigned a value) and false otherwise */
  public boolean isSetBenchmark() {
    return this.benchmark != null;
  }

  public void setBenchmarkIsSet(boolean value) {
    if (!value) {
      this.benchmark = null;
    }
  }

  public String getSlippage() {
    return this.slippage;
  }

  public TTransactionParam setSlippage(String slippage) {
    this.slippage = slippage;
    return this;
  }

  public void unsetSlippage() {
    this.slippage = null;
  }

  /** Returns true if field slippage is set (has been assigned a value) and false otherwise */
  public boolean isSetSlippage() {
    return this.slippage != null;
  }

  public void setSlippageIsSet(boolean value) {
    if (!value) {
      this.slippage = null;
    }
  }

  public String getCommission() {
    return this.commission;
  }

  public TTransactionParam setCommission(String commission) {
    this.commission = commission;
    return this;
  }

  public void unsetCommission() {
    this.commission = null;
  }

  /** Returns true if field commission is set (has been assigned a value) and false otherwise */
  public boolean isSetCommission() {
    return this.commission != null;
  }

  public void setCommissionIsSet(boolean value) {
    if (!value) {
      this.commission = null;
    }
  }

  public String getTaxPercent() {
    return this.taxPercent;
  }

  public TTransactionParam setTaxPercent(String taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  public void unsetTaxPercent() {
    this.taxPercent = null;
  }

  /** Returns true if field taxPercent is set (has been assigned a value) and false otherwise */
  public boolean isSetTaxPercent() {
    return this.taxPercent != null;
  }

  public void setTaxPercentIsSet(boolean value) {
    if (!value) {
      this.taxPercent = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BENCHMARK:
      if (value == null) {
        unsetBenchmark();
      } else {
        setBenchmark((String)value);
      }
      break;

    case SLIPPAGE:
      if (value == null) {
        unsetSlippage();
      } else {
        setSlippage((String)value);
      }
      break;

    case COMMISSION:
      if (value == null) {
        unsetCommission();
      } else {
        setCommission((String)value);
      }
      break;

    case TAX_PERCENT:
      if (value == null) {
        unsetTaxPercent();
      } else {
        setTaxPercent((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BENCHMARK:
      return getBenchmark();

    case SLIPPAGE:
      return getSlippage();

    case COMMISSION:
      return getCommission();

    case TAX_PERCENT:
      return getTaxPercent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BENCHMARK:
      return isSetBenchmark();
    case SLIPPAGE:
      return isSetSlippage();
    case COMMISSION:
      return isSetCommission();
    case TAX_PERCENT:
      return isSetTaxPercent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTransactionParam)
      return this.equals((TTransactionParam)that);
    return false;
  }

  public boolean equals(TTransactionParam that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_benchmark = true && this.isSetBenchmark();
    boolean that_present_benchmark = true && that.isSetBenchmark();
    if (this_present_benchmark || that_present_benchmark) {
      if (!(this_present_benchmark && that_present_benchmark))
        return false;
      if (!this.benchmark.equals(that.benchmark))
        return false;
    }

    boolean this_present_slippage = true && this.isSetSlippage();
    boolean that_present_slippage = true && that.isSetSlippage();
    if (this_present_slippage || that_present_slippage) {
      if (!(this_present_slippage && that_present_slippage))
        return false;
      if (!this.slippage.equals(that.slippage))
        return false;
    }

    boolean this_present_commission = true && this.isSetCommission();
    boolean that_present_commission = true && that.isSetCommission();
    if (this_present_commission || that_present_commission) {
      if (!(this_present_commission && that_present_commission))
        return false;
      if (!this.commission.equals(that.commission))
        return false;
    }

    boolean this_present_taxPercent = true && this.isSetTaxPercent();
    boolean that_present_taxPercent = true && that.isSetTaxPercent();
    if (this_present_taxPercent || that_present_taxPercent) {
      if (!(this_present_taxPercent && that_present_taxPercent))
        return false;
      if (!this.taxPercent.equals(that.taxPercent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBenchmark()) ? 131071 : 524287);
    if (isSetBenchmark())
      hashCode = hashCode * 8191 + benchmark.hashCode();

    hashCode = hashCode * 8191 + ((isSetSlippage()) ? 131071 : 524287);
    if (isSetSlippage())
      hashCode = hashCode * 8191 + slippage.hashCode();

    hashCode = hashCode * 8191 + ((isSetCommission()) ? 131071 : 524287);
    if (isSetCommission())
      hashCode = hashCode * 8191 + commission.hashCode();

    hashCode = hashCode * 8191 + ((isSetTaxPercent()) ? 131071 : 524287);
    if (isSetTaxPercent())
      hashCode = hashCode * 8191 + taxPercent.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTransactionParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBenchmark()).compareTo(other.isSetBenchmark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBenchmark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.benchmark, other.benchmark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSlippage()).compareTo(other.isSetSlippage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlippage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slippage, other.slippage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommission()).compareTo(other.isSetCommission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommission()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commission, other.commission);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaxPercent()).compareTo(other.isSetTaxPercent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaxPercent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taxPercent, other.taxPercent);
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
    StringBuilder sb = new StringBuilder("TTransactionParam(");
    boolean first = true;

    if (isSetBenchmark()) {
      sb.append("benchmark:");
      if (this.benchmark == null) {
        sb.append("null");
      } else {
        sb.append(this.benchmark);
      }
      first = false;
    }
    if (isSetSlippage()) {
      if (!first) sb.append(", ");
      sb.append("slippage:");
      if (this.slippage == null) {
        sb.append("null");
      } else {
        sb.append(this.slippage);
      }
      first = false;
    }
    if (isSetCommission()) {
      if (!first) sb.append(", ");
      sb.append("commission:");
      if (this.commission == null) {
        sb.append("null");
      } else {
        sb.append(this.commission);
      }
      first = false;
    }
    if (isSetTaxPercent()) {
      if (!first) sb.append(", ");
      sb.append("taxPercent:");
      if (this.taxPercent == null) {
        sb.append("null");
      } else {
        sb.append(this.taxPercent);
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

  private static class TTransactionParamStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionParamStandardScheme getScheme() {
      return new TTransactionParamStandardScheme();
    }
  }

  private static class TTransactionParamStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTransactionParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTransactionParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BENCHMARK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.benchmark = iprot.readString();
              struct.setBenchmarkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SLIPPAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.slippage = iprot.readString();
              struct.setSlippageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMMISSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.commission = iprot.readString();
              struct.setCommissionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TAX_PERCENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.taxPercent = iprot.readString();
              struct.setTaxPercentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTransactionParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.benchmark != null) {
        if (struct.isSetBenchmark()) {
          oprot.writeFieldBegin(BENCHMARK_FIELD_DESC);
          oprot.writeString(struct.benchmark);
          oprot.writeFieldEnd();
        }
      }
      if (struct.slippage != null) {
        if (struct.isSetSlippage()) {
          oprot.writeFieldBegin(SLIPPAGE_FIELD_DESC);
          oprot.writeString(struct.slippage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.commission != null) {
        if (struct.isSetCommission()) {
          oprot.writeFieldBegin(COMMISSION_FIELD_DESC);
          oprot.writeString(struct.commission);
          oprot.writeFieldEnd();
        }
      }
      if (struct.taxPercent != null) {
        if (struct.isSetTaxPercent()) {
          oprot.writeFieldBegin(TAX_PERCENT_FIELD_DESC);
          oprot.writeString(struct.taxPercent);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTransactionParamTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionParamTupleScheme getScheme() {
      return new TTransactionParamTupleScheme();
    }
  }

  private static class TTransactionParamTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTransactionParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTransactionParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBenchmark()) {
        optionals.set(0);
      }
      if (struct.isSetSlippage()) {
        optionals.set(1);
      }
      if (struct.isSetCommission()) {
        optionals.set(2);
      }
      if (struct.isSetTaxPercent()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBenchmark()) {
        oprot.writeString(struct.benchmark);
      }
      if (struct.isSetSlippage()) {
        oprot.writeString(struct.slippage);
      }
      if (struct.isSetCommission()) {
        oprot.writeString(struct.commission);
      }
      if (struct.isSetTaxPercent()) {
        oprot.writeString(struct.taxPercent);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTransactionParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.benchmark = iprot.readString();
        struct.setBenchmarkIsSet(true);
      }
      if (incoming.get(1)) {
        struct.slippage = iprot.readString();
        struct.setSlippageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.commission = iprot.readString();
        struct.setCommissionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.taxPercent = iprot.readString();
        struct.setTaxPercentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
