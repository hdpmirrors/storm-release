/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class ProfileRequest implements org.apache.thrift.TBase<ProfileRequest, ProfileRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ProfileRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProfileRequest");

  private static final org.apache.thrift.protocol.TField NODE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("time_stamp", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable NodeInfo nodeInfo; // required
  private @org.apache.thrift.annotation.Nullable ProfileAction action; // required
  private long time_stamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_INFO((short)1, "nodeInfo"),
    /**
     * 
     * @see ProfileAction
     */
    ACTION((short)2, "action"),
    TIME_STAMP((short)3, "time_stamp");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NODE_INFO
          return NODE_INFO;
        case 2: // ACTION
          return ACTION;
        case 3: // TIME_STAMP
          return TIME_STAMP;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __TIME_STAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIME_STAMP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_INFO, new org.apache.thrift.meta_data.FieldMetaData("nodeInfo", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeInfo.class)));
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ProfileAction.class)));
    tmpMap.put(_Fields.TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("time_stamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProfileRequest.class, metaDataMap);
  }

  public ProfileRequest() {
  }

  public ProfileRequest(
    NodeInfo nodeInfo,
    ProfileAction action)
  {
    this();
    this.nodeInfo = nodeInfo;
    this.action = action;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProfileRequest(ProfileRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_nodeInfo()) {
      this.nodeInfo = new NodeInfo(other.nodeInfo);
    }
    if (other.is_set_action()) {
      this.action = other.action;
    }
    this.time_stamp = other.time_stamp;
  }

  public ProfileRequest deepCopy() {
    return new ProfileRequest(this);
  }

  @Override
  public void clear() {
    this.nodeInfo = null;
    this.action = null;
    set_time_stamp_isSet(false);
    this.time_stamp = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public NodeInfo get_nodeInfo() {
    return this.nodeInfo;
  }

  public void set_nodeInfo(@org.apache.thrift.annotation.Nullable NodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public void unset_nodeInfo() {
    this.nodeInfo = null;
  }

  /** Returns true if field nodeInfo is set (has been assigned a value) and false otherwise */
  public boolean is_set_nodeInfo() {
    return this.nodeInfo != null;
  }

  public void set_nodeInfo_isSet(boolean value) {
    if (!value) {
      this.nodeInfo = null;
    }
  }

  /**
   * 
   * @see ProfileAction
   */
  @org.apache.thrift.annotation.Nullable
  public ProfileAction get_action() {
    return this.action;
  }

  /**
   * 
   * @see ProfileAction
   */
  public void set_action(@org.apache.thrift.annotation.Nullable ProfileAction action) {
    this.action = action;
  }

  public void unset_action() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean is_set_action() {
    return this.action != null;
  }

  public void set_action_isSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public long get_time_stamp() {
    return this.time_stamp;
  }

  public void set_time_stamp(long time_stamp) {
    this.time_stamp = time_stamp;
    set_time_stamp_isSet(true);
  }

  public void unset_time_stamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIME_STAMP_ISSET_ID);
  }

  /** Returns true if field time_stamp is set (has been assigned a value) and false otherwise */
  public boolean is_set_time_stamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIME_STAMP_ISSET_ID);
  }

  public void set_time_stamp_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIME_STAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NODE_INFO:
      if (value == null) {
        unset_nodeInfo();
      } else {
        set_nodeInfo((NodeInfo)value);
      }
      break;

    case ACTION:
      if (value == null) {
        unset_action();
      } else {
        set_action((ProfileAction)value);
      }
      break;

    case TIME_STAMP:
      if (value == null) {
        unset_time_stamp();
      } else {
        set_time_stamp((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_INFO:
      return get_nodeInfo();

    case ACTION:
      return get_action();

    case TIME_STAMP:
      return get_time_stamp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NODE_INFO:
      return is_set_nodeInfo();
    case ACTION:
      return is_set_action();
    case TIME_STAMP:
      return is_set_time_stamp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProfileRequest)
      return this.equals((ProfileRequest)that);
    return false;
  }

  public boolean equals(ProfileRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nodeInfo = true && this.is_set_nodeInfo();
    boolean that_present_nodeInfo = true && that.is_set_nodeInfo();
    if (this_present_nodeInfo || that_present_nodeInfo) {
      if (!(this_present_nodeInfo && that_present_nodeInfo))
        return false;
      if (!this.nodeInfo.equals(that.nodeInfo))
        return false;
    }

    boolean this_present_action = true && this.is_set_action();
    boolean that_present_action = true && that.is_set_action();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_time_stamp = true && this.is_set_time_stamp();
    boolean that_present_time_stamp = true && that.is_set_time_stamp();
    if (this_present_time_stamp || that_present_time_stamp) {
      if (!(this_present_time_stamp && that_present_time_stamp))
        return false;
      if (this.time_stamp != that.time_stamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_nodeInfo()) ? 131071 : 524287);
    if (is_set_nodeInfo())
      hashCode = hashCode * 8191 + nodeInfo.hashCode();

    hashCode = hashCode * 8191 + ((is_set_action()) ? 131071 : 524287);
    if (is_set_action())
      hashCode = hashCode * 8191 + action.getValue();

    hashCode = hashCode * 8191 + ((is_set_time_stamp()) ? 131071 : 524287);
    if (is_set_time_stamp())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(time_stamp);

    return hashCode;
  }

  @Override
  public int compareTo(ProfileRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_nodeInfo()).compareTo(other.is_set_nodeInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nodeInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeInfo, other.nodeInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_action()).compareTo(other.is_set_action());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_action()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_time_stamp()).compareTo(other.is_set_time_stamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_time_stamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_stamp, other.time_stamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileRequest(");
    boolean first = true;

    sb.append("nodeInfo:");
    if (this.nodeInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (is_set_time_stamp()) {
      if (!first) sb.append(", ");
      sb.append("time_stamp:");
      sb.append(this.time_stamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_nodeInfo()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeInfo' is unset! Struct:" + toString());
    }

    if (!is_set_action()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'action' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (nodeInfo != null) {
      nodeInfo.validate();
    }
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

  private static class ProfileRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileRequestStandardScheme getScheme() {
      return new ProfileRequestStandardScheme();
    }
  }

  private static class ProfileRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProfileRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProfileRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nodeInfo = new NodeInfo();
              struct.nodeInfo.read(iprot);
              struct.set_nodeInfo_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = org.apache.storm.generated.ProfileAction.findByValue(iprot.readI32());
              struct.set_action_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time_stamp = iprot.readI64();
              struct.set_time_stamp_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProfileRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeInfo != null) {
        oprot.writeFieldBegin(NODE_INFO_FIELD_DESC);
        struct.nodeInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeI32(struct.action.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.is_set_time_stamp()) {
        oprot.writeFieldBegin(TIME_STAMP_FIELD_DESC);
        oprot.writeI64(struct.time_stamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileRequestTupleScheme getScheme() {
      return new ProfileRequestTupleScheme();
    }
  }

  private static class ProfileRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProfileRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProfileRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.nodeInfo.write(oprot);
      oprot.writeI32(struct.action.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_time_stamp()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_time_stamp()) {
        oprot.writeI64(struct.time_stamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProfileRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.nodeInfo = new NodeInfo();
      struct.nodeInfo.read(iprot);
      struct.set_nodeInfo_isSet(true);
      struct.action = org.apache.storm.generated.ProfileAction.findByValue(iprot.readI32());
      struct.set_action_isSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.time_stamp = iprot.readI64();
        struct.set_time_stamp_isSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

