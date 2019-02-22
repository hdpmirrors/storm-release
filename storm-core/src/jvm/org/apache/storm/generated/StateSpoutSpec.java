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
public class StateSpoutSpec implements org.apache.thrift.TBase<StateSpoutSpec, StateSpoutSpec._Fields>, java.io.Serializable, Cloneable, Comparable<StateSpoutSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StateSpoutSpec");

  private static final org.apache.thrift.protocol.TField STATE_SPOUT_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("state_spout_object", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMMON_FIELD_DESC = new org.apache.thrift.protocol.TField("common", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StateSpoutSpecStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StateSpoutSpecTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable ComponentObject state_spout_object; // required
  private @org.apache.thrift.annotation.Nullable ComponentCommon common; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATE_SPOUT_OBJECT((short)1, "state_spout_object"),
    COMMON((short)2, "common");

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
        case 1: // STATE_SPOUT_OBJECT
          return STATE_SPOUT_OBJECT;
        case 2: // COMMON
          return COMMON;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE_SPOUT_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("state_spout_object", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentObject.class)));
    tmpMap.put(_Fields.COMMON, new org.apache.thrift.meta_data.FieldMetaData("common", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentCommon.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StateSpoutSpec.class, metaDataMap);
  }

  public StateSpoutSpec() {
  }

  public StateSpoutSpec(
    ComponentObject state_spout_object,
    ComponentCommon common)
  {
    this();
    this.state_spout_object = state_spout_object;
    this.common = common;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StateSpoutSpec(StateSpoutSpec other) {
    if (other.is_set_state_spout_object()) {
      this.state_spout_object = new ComponentObject(other.state_spout_object);
    }
    if (other.is_set_common()) {
      this.common = new ComponentCommon(other.common);
    }
  }

  public StateSpoutSpec deepCopy() {
    return new StateSpoutSpec(this);
  }

  @Override
  public void clear() {
    this.state_spout_object = null;
    this.common = null;
  }

  @org.apache.thrift.annotation.Nullable
  public ComponentObject get_state_spout_object() {
    return this.state_spout_object;
  }

  public void set_state_spout_object(@org.apache.thrift.annotation.Nullable ComponentObject state_spout_object) {
    this.state_spout_object = state_spout_object;
  }

  public void unset_state_spout_object() {
    this.state_spout_object = null;
  }

  /** Returns true if field state_spout_object is set (has been assigned a value) and false otherwise */
  public boolean is_set_state_spout_object() {
    return this.state_spout_object != null;
  }

  public void set_state_spout_object_isSet(boolean value) {
    if (!value) {
      this.state_spout_object = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public ComponentCommon get_common() {
    return this.common;
  }

  public void set_common(@org.apache.thrift.annotation.Nullable ComponentCommon common) {
    this.common = common;
  }

  public void unset_common() {
    this.common = null;
  }

  /** Returns true if field common is set (has been assigned a value) and false otherwise */
  public boolean is_set_common() {
    return this.common != null;
  }

  public void set_common_isSet(boolean value) {
    if (!value) {
      this.common = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATE_SPOUT_OBJECT:
      if (value == null) {
        unset_state_spout_object();
      } else {
        set_state_spout_object((ComponentObject)value);
      }
      break;

    case COMMON:
      if (value == null) {
        unset_common();
      } else {
        set_common((ComponentCommon)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE_SPOUT_OBJECT:
      return get_state_spout_object();

    case COMMON:
      return get_common();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATE_SPOUT_OBJECT:
      return is_set_state_spout_object();
    case COMMON:
      return is_set_common();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StateSpoutSpec)
      return this.equals((StateSpoutSpec)that);
    return false;
  }

  public boolean equals(StateSpoutSpec that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_state_spout_object = true && this.is_set_state_spout_object();
    boolean that_present_state_spout_object = true && that.is_set_state_spout_object();
    if (this_present_state_spout_object || that_present_state_spout_object) {
      if (!(this_present_state_spout_object && that_present_state_spout_object))
        return false;
      if (!this.state_spout_object.equals(that.state_spout_object))
        return false;
    }

    boolean this_present_common = true && this.is_set_common();
    boolean that_present_common = true && that.is_set_common();
    if (this_present_common || that_present_common) {
      if (!(this_present_common && that_present_common))
        return false;
      if (!this.common.equals(that.common))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_state_spout_object()) ? 131071 : 524287);
    if (is_set_state_spout_object())
      hashCode = hashCode * 8191 + state_spout_object.hashCode();

    hashCode = hashCode * 8191 + ((is_set_common()) ? 131071 : 524287);
    if (is_set_common())
      hashCode = hashCode * 8191 + common.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StateSpoutSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_state_spout_object()).compareTo(other.is_set_state_spout_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_state_spout_object()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state_spout_object, other.state_spout_object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_common()).compareTo(other.is_set_common());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_common()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.common, other.common);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StateSpoutSpec(");
    boolean first = true;

    sb.append("state_spout_object:");
    if (this.state_spout_object == null) {
      sb.append("null");
    } else {
      sb.append(this.state_spout_object);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("common:");
    if (this.common == null) {
      sb.append("null");
    } else {
      sb.append(this.common);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_state_spout_object()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state_spout_object' is unset! Struct:" + toString());
    }

    if (!is_set_common()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'common' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (common != null) {
      common.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StateSpoutSpecStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StateSpoutSpecStandardScheme getScheme() {
      return new StateSpoutSpecStandardScheme();
    }
  }

  private static class StateSpoutSpecStandardScheme extends org.apache.thrift.scheme.StandardScheme<StateSpoutSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StateSpoutSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE_SPOUT_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.state_spout_object = new ComponentObject();
              struct.state_spout_object.read(iprot);
              struct.set_state_spout_object_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.common = new ComponentCommon();
              struct.common.read(iprot);
              struct.set_common_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StateSpoutSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state_spout_object != null) {
        oprot.writeFieldBegin(STATE_SPOUT_OBJECT_FIELD_DESC);
        struct.state_spout_object.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.common != null) {
        oprot.writeFieldBegin(COMMON_FIELD_DESC);
        struct.common.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StateSpoutSpecTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StateSpoutSpecTupleScheme getScheme() {
      return new StateSpoutSpecTupleScheme();
    }
  }

  private static class StateSpoutSpecTupleScheme extends org.apache.thrift.scheme.TupleScheme<StateSpoutSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StateSpoutSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.state_spout_object.write(oprot);
      struct.common.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StateSpoutSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.state_spout_object = new ComponentObject();
      struct.state_spout_object.read(iprot);
      struct.set_state_spout_object_isSet(true);
      struct.common = new ComponentCommon();
      struct.common.read(iprot);
      struct.set_common_isSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

