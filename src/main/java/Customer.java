/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package main.java;
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-04")
public class Customer implements org.apache.thrift.TBase<Customer, Customer._Fields>, java.io.Serializable, Cloneable, Comparable<Customer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Customer");

  private static final org.apache.thrift.protocol.TField VORNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("vorname", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NACHNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nachname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WORTHINESS_FIELD_DESC = new org.apache.thrift.protocol.TField("worthiness", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CustomerStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CustomerTupleSchemeFactory();

  public java.lang.String vorname; // required
  public java.lang.String nachname; // required
  public int worthiness; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VORNAME((short)1, "vorname"),
    NACHNAME((short)2, "nachname"),
    WORTHINESS((short)3, "worthiness");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

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
        case 1: // VORNAME
          return VORNAME;
        case 2: // NACHNAME
          return NACHNAME;
        case 3: // WORTHINESS
          return WORTHINESS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WORTHINESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VORNAME, new org.apache.thrift.meta_data.FieldMetaData("vorname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NACHNAME, new org.apache.thrift.meta_data.FieldMetaData("nachname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORTHINESS, new org.apache.thrift.meta_data.FieldMetaData("worthiness", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Customer.class, metaDataMap);
  }

  public Customer() {
  }

  public Customer(
    java.lang.String vorname,
    java.lang.String nachname,
    int worthiness)
  {
    this();
    this.vorname = vorname;
    this.nachname = nachname;
    this.worthiness = worthiness;
    setWorthinessIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Customer(Customer other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVorname()) {
      this.vorname = other.vorname;
    }
    if (other.isSetNachname()) {
      this.nachname = other.nachname;
    }
    this.worthiness = other.worthiness;
  }

  public Customer deepCopy() {
    return new Customer(this);
  }

  @Override
  public void clear() {
    this.vorname = null;
    this.nachname = null;
    setWorthinessIsSet(false);
    this.worthiness = 0;
  }

  public java.lang.String getVorname() {
    return this.vorname;
  }

  public Customer setVorname(java.lang.String vorname) {
    this.vorname = vorname;
    return this;
  }

  public void unsetVorname() {
    this.vorname = null;
  }

  /** Returns true if field vorname is set (has been assigned a value) and false otherwise */
  public boolean isSetVorname() {
    return this.vorname != null;
  }

  public void setVornameIsSet(boolean value) {
    if (!value) {
      this.vorname = null;
    }
  }

  public java.lang.String getNachname() {
    return this.nachname;
  }

  public Customer setNachname(java.lang.String nachname) {
    this.nachname = nachname;
    return this;
  }

  public void unsetNachname() {
    this.nachname = null;
  }

  /** Returns true if field nachname is set (has been assigned a value) and false otherwise */
  public boolean isSetNachname() {
    return this.nachname != null;
  }

  public void setNachnameIsSet(boolean value) {
    if (!value) {
      this.nachname = null;
    }
  }

  public int getWorthiness() {
    return this.worthiness;
  }

  public Customer setWorthiness(int worthiness) {
    this.worthiness = worthiness;
    setWorthinessIsSet(true);
    return this;
  }

  public void unsetWorthiness() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WORTHINESS_ISSET_ID);
  }

  /** Returns true if field worthiness is set (has been assigned a value) and false otherwise */
  public boolean isSetWorthiness() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WORTHINESS_ISSET_ID);
  }

  public void setWorthinessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WORTHINESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case VORNAME:
      if (value == null) {
        unsetVorname();
      } else {
        setVorname((java.lang.String)value);
      }
      break;

    case NACHNAME:
      if (value == null) {
        unsetNachname();
      } else {
        setNachname((java.lang.String)value);
      }
      break;

    case WORTHINESS:
      if (value == null) {
        unsetWorthiness();
      } else {
        setWorthiness((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VORNAME:
      return getVorname();

    case NACHNAME:
      return getNachname();

    case WORTHINESS:
      return getWorthiness();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VORNAME:
      return isSetVorname();
    case NACHNAME:
      return isSetNachname();
    case WORTHINESS:
      return isSetWorthiness();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Customer)
      return this.equals((Customer)that);
    return false;
  }

  public boolean equals(Customer that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_vorname = true && this.isSetVorname();
    boolean that_present_vorname = true && that.isSetVorname();
    if (this_present_vorname || that_present_vorname) {
      if (!(this_present_vorname && that_present_vorname))
        return false;
      if (!this.vorname.equals(that.vorname))
        return false;
    }

    boolean this_present_nachname = true && this.isSetNachname();
    boolean that_present_nachname = true && that.isSetNachname();
    if (this_present_nachname || that_present_nachname) {
      if (!(this_present_nachname && that_present_nachname))
        return false;
      if (!this.nachname.equals(that.nachname))
        return false;
    }

    boolean this_present_worthiness = true;
    boolean that_present_worthiness = true;
    if (this_present_worthiness || that_present_worthiness) {
      if (!(this_present_worthiness && that_present_worthiness))
        return false;
      if (this.worthiness != that.worthiness)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVorname()) ? 131071 : 524287);
    if (isSetVorname())
      hashCode = hashCode * 8191 + vorname.hashCode();

    hashCode = hashCode * 8191 + ((isSetNachname()) ? 131071 : 524287);
    if (isSetNachname())
      hashCode = hashCode * 8191 + nachname.hashCode();

    hashCode = hashCode * 8191 + worthiness;

    return hashCode;
  }

  @Override
  public int compareTo(Customer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetVorname()).compareTo(other.isSetVorname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVorname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vorname, other.vorname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNachname()).compareTo(other.isSetNachname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNachname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nachname, other.nachname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWorthiness()).compareTo(other.isSetWorthiness());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorthiness()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.worthiness, other.worthiness);
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
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Customer(");
    boolean first = true;

    sb.append("vorname:");
    if (this.vorname == null) {
      sb.append("null");
    } else {
      sb.append(this.vorname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nachname:");
    if (this.nachname == null) {
      sb.append("null");
    } else {
      sb.append(this.nachname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("worthiness:");
    sb.append(this.worthiness);
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CustomerStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CustomerStandardScheme getScheme() {
      return new CustomerStandardScheme();
    }
  }

  private static class CustomerStandardScheme extends org.apache.thrift.scheme.StandardScheme<Customer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Customer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VORNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.vorname = iprot.readString();
              struct.setVornameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NACHNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nachname = iprot.readString();
              struct.setNachnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WORTHINESS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.worthiness = iprot.readI32();
              struct.setWorthinessIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Customer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.vorname != null) {
        oprot.writeFieldBegin(VORNAME_FIELD_DESC);
        oprot.writeString(struct.vorname);
        oprot.writeFieldEnd();
      }
      if (struct.nachname != null) {
        oprot.writeFieldBegin(NACHNAME_FIELD_DESC);
        oprot.writeString(struct.nachname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WORTHINESS_FIELD_DESC);
      oprot.writeI32(struct.worthiness);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CustomerTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CustomerTupleScheme getScheme() {
      return new CustomerTupleScheme();
    }
  }

  private static class CustomerTupleScheme extends org.apache.thrift.scheme.TupleScheme<Customer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Customer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVorname()) {
        optionals.set(0);
      }
      if (struct.isSetNachname()) {
        optionals.set(1);
      }
      if (struct.isSetWorthiness()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVorname()) {
        oprot.writeString(struct.vorname);
      }
      if (struct.isSetNachname()) {
        oprot.writeString(struct.nachname);
      }
      if (struct.isSetWorthiness()) {
        oprot.writeI32(struct.worthiness);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Customer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.vorname = iprot.readString();
        struct.setVornameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nachname = iprot.readString();
        struct.setNachnameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.worthiness = iprot.readI32();
        struct.setWorthinessIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
