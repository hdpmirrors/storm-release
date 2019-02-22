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
public class SpoutStats implements org.apache.thrift.TBase<SpoutStats, SpoutStats._Fields>, java.io.Serializable, Cloneable, Comparable<SpoutStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SpoutStats");

  private static final org.apache.thrift.protocol.TField ACKED_FIELD_DESC = new org.apache.thrift.protocol.TField("acked", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField FAILED_FIELD_DESC = new org.apache.thrift.protocol.TField("failed", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField COMPLETE_MS_AVG_FIELD_DESC = new org.apache.thrift.protocol.TField("complete_ms_avg", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SpoutStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SpoutStatsTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> acked; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> failed; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>> complete_ms_avg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACKED((short)1, "acked"),
    FAILED((short)2, "failed"),
    COMPLETE_MS_AVG((short)3, "complete_ms_avg");

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
        case 1: // ACKED
          return ACKED;
        case 2: // FAILED
          return FAILED;
        case 3: // COMPLETE_MS_AVG
          return COMPLETE_MS_AVG;
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
    tmpMap.put(_Fields.ACKED, new org.apache.thrift.meta_data.FieldMetaData("acked", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)))));
    tmpMap.put(_Fields.FAILED, new org.apache.thrift.meta_data.FieldMetaData("failed", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)))));
    tmpMap.put(_Fields.COMPLETE_MS_AVG, new org.apache.thrift.meta_data.FieldMetaData("complete_ms_avg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SpoutStats.class, metaDataMap);
  }

  public SpoutStats() {
  }

  public SpoutStats(
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> acked,
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> failed,
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>> complete_ms_avg)
  {
    this();
    this.acked = acked;
    this.failed = failed;
    this.complete_ms_avg = complete_ms_avg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpoutStats(SpoutStats other) {
    if (other.is_set_acked()) {
      java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> __this__acked = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(other.acked.size());
      for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> other_element : other.acked.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.Map<java.lang.String,java.lang.Long> other_element_value = other_element.getValue();

        java.lang.String __this__acked_copy_key = other_element_key;

        java.util.Map<java.lang.String,java.lang.Long> __this__acked_copy_value = new java.util.HashMap<java.lang.String,java.lang.Long>(other_element_value);

        __this__acked.put(__this__acked_copy_key, __this__acked_copy_value);
      }
      this.acked = __this__acked;
    }
    if (other.is_set_failed()) {
      java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> __this__failed = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(other.failed.size());
      for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> other_element : other.failed.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.Map<java.lang.String,java.lang.Long> other_element_value = other_element.getValue();

        java.lang.String __this__failed_copy_key = other_element_key;

        java.util.Map<java.lang.String,java.lang.Long> __this__failed_copy_value = new java.util.HashMap<java.lang.String,java.lang.Long>(other_element_value);

        __this__failed.put(__this__failed_copy_key, __this__failed_copy_value);
      }
      this.failed = __this__failed;
    }
    if (other.is_set_complete_ms_avg()) {
      java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>> __this__complete_ms_avg = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>>(other.complete_ms_avg.size());
      for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Double>> other_element : other.complete_ms_avg.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.Map<java.lang.String,java.lang.Double> other_element_value = other_element.getValue();

        java.lang.String __this__complete_ms_avg_copy_key = other_element_key;

        java.util.Map<java.lang.String,java.lang.Double> __this__complete_ms_avg_copy_value = new java.util.HashMap<java.lang.String,java.lang.Double>(other_element_value);

        __this__complete_ms_avg.put(__this__complete_ms_avg_copy_key, __this__complete_ms_avg_copy_value);
      }
      this.complete_ms_avg = __this__complete_ms_avg;
    }
  }

  public SpoutStats deepCopy() {
    return new SpoutStats(this);
  }

  @Override
  public void clear() {
    this.acked = null;
    this.failed = null;
    this.complete_ms_avg = null;
  }

  public int get_acked_size() {
    return (this.acked == null) ? 0 : this.acked.size();
  }

  public void put_to_acked(java.lang.String key, java.util.Map<java.lang.String,java.lang.Long> val) {
    if (this.acked == null) {
      this.acked = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>();
    }
    this.acked.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> get_acked() {
    return this.acked;
  }

  public void set_acked(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> acked) {
    this.acked = acked;
  }

  public void unset_acked() {
    this.acked = null;
  }

  /** Returns true if field acked is set (has been assigned a value) and false otherwise */
  public boolean is_set_acked() {
    return this.acked != null;
  }

  public void set_acked_isSet(boolean value) {
    if (!value) {
      this.acked = null;
    }
  }

  public int get_failed_size() {
    return (this.failed == null) ? 0 : this.failed.size();
  }

  public void put_to_failed(java.lang.String key, java.util.Map<java.lang.String,java.lang.Long> val) {
    if (this.failed == null) {
      this.failed = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>();
    }
    this.failed.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> get_failed() {
    return this.failed;
  }

  public void set_failed(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>> failed) {
    this.failed = failed;
  }

  public void unset_failed() {
    this.failed = null;
  }

  /** Returns true if field failed is set (has been assigned a value) and false otherwise */
  public boolean is_set_failed() {
    return this.failed != null;
  }

  public void set_failed_isSet(boolean value) {
    if (!value) {
      this.failed = null;
    }
  }

  public int get_complete_ms_avg_size() {
    return (this.complete_ms_avg == null) ? 0 : this.complete_ms_avg.size();
  }

  public void put_to_complete_ms_avg(java.lang.String key, java.util.Map<java.lang.String,java.lang.Double> val) {
    if (this.complete_ms_avg == null) {
      this.complete_ms_avg = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>>();
    }
    this.complete_ms_avg.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>> get_complete_ms_avg() {
    return this.complete_ms_avg;
  }

  public void set_complete_ms_avg(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>> complete_ms_avg) {
    this.complete_ms_avg = complete_ms_avg;
  }

  public void unset_complete_ms_avg() {
    this.complete_ms_avg = null;
  }

  /** Returns true if field complete_ms_avg is set (has been assigned a value) and false otherwise */
  public boolean is_set_complete_ms_avg() {
    return this.complete_ms_avg != null;
  }

  public void set_complete_ms_avg_isSet(boolean value) {
    if (!value) {
      this.complete_ms_avg = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ACKED:
      if (value == null) {
        unset_acked();
      } else {
        set_acked((java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>)value);
      }
      break;

    case FAILED:
      if (value == null) {
        unset_failed();
      } else {
        set_failed((java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>)value);
      }
      break;

    case COMPLETE_MS_AVG:
      if (value == null) {
        unset_complete_ms_avg();
      } else {
        set_complete_ms_avg((java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ACKED:
      return get_acked();

    case FAILED:
      return get_failed();

    case COMPLETE_MS_AVG:
      return get_complete_ms_avg();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ACKED:
      return is_set_acked();
    case FAILED:
      return is_set_failed();
    case COMPLETE_MS_AVG:
      return is_set_complete_ms_avg();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SpoutStats)
      return this.equals((SpoutStats)that);
    return false;
  }

  public boolean equals(SpoutStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_acked = true && this.is_set_acked();
    boolean that_present_acked = true && that.is_set_acked();
    if (this_present_acked || that_present_acked) {
      if (!(this_present_acked && that_present_acked))
        return false;
      if (!this.acked.equals(that.acked))
        return false;
    }

    boolean this_present_failed = true && this.is_set_failed();
    boolean that_present_failed = true && that.is_set_failed();
    if (this_present_failed || that_present_failed) {
      if (!(this_present_failed && that_present_failed))
        return false;
      if (!this.failed.equals(that.failed))
        return false;
    }

    boolean this_present_complete_ms_avg = true && this.is_set_complete_ms_avg();
    boolean that_present_complete_ms_avg = true && that.is_set_complete_ms_avg();
    if (this_present_complete_ms_avg || that_present_complete_ms_avg) {
      if (!(this_present_complete_ms_avg && that_present_complete_ms_avg))
        return false;
      if (!this.complete_ms_avg.equals(that.complete_ms_avg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_acked()) ? 131071 : 524287);
    if (is_set_acked())
      hashCode = hashCode * 8191 + acked.hashCode();

    hashCode = hashCode * 8191 + ((is_set_failed()) ? 131071 : 524287);
    if (is_set_failed())
      hashCode = hashCode * 8191 + failed.hashCode();

    hashCode = hashCode * 8191 + ((is_set_complete_ms_avg()) ? 131071 : 524287);
    if (is_set_complete_ms_avg())
      hashCode = hashCode * 8191 + complete_ms_avg.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SpoutStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_acked()).compareTo(other.is_set_acked());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_acked()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acked, other.acked);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_failed()).compareTo(other.is_set_failed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_failed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failed, other.failed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_complete_ms_avg()).compareTo(other.is_set_complete_ms_avg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_complete_ms_avg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.complete_ms_avg, other.complete_ms_avg);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SpoutStats(");
    boolean first = true;

    sb.append("acked:");
    if (this.acked == null) {
      sb.append("null");
    } else {
      sb.append(this.acked);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failed:");
    if (this.failed == null) {
      sb.append("null");
    } else {
      sb.append(this.failed);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("complete_ms_avg:");
    if (this.complete_ms_avg == null) {
      sb.append("null");
    } else {
      sb.append(this.complete_ms_avg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_acked()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'acked' is unset! Struct:" + toString());
    }

    if (!is_set_failed()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'failed' is unset! Struct:" + toString());
    }

    if (!is_set_complete_ms_avg()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'complete_ms_avg' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SpoutStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpoutStatsStandardScheme getScheme() {
      return new SpoutStatsStandardScheme();
    }
  }

  private static class SpoutStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<SpoutStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SpoutStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACKED
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map232 = iprot.readMapBegin();
                struct.acked = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(2*_map232.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key233;
                @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Long> _val234;
                for (int _i235 = 0; _i235 < _map232.size; ++_i235)
                {
                  _key233 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map236 = iprot.readMapBegin();
                    _val234 = new java.util.HashMap<java.lang.String,java.lang.Long>(2*_map236.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _key237;
                    long _val238;
                    for (int _i239 = 0; _i239 < _map236.size; ++_i239)
                    {
                      _key237 = iprot.readString();
                      _val238 = iprot.readI64();
                      _val234.put(_key237, _val238);
                    }
                    iprot.readMapEnd();
                  }
                  struct.acked.put(_key233, _val234);
                }
                iprot.readMapEnd();
              }
              struct.set_acked_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FAILED
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map240 = iprot.readMapBegin();
                struct.failed = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(2*_map240.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key241;
                @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Long> _val242;
                for (int _i243 = 0; _i243 < _map240.size; ++_i243)
                {
                  _key241 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map244 = iprot.readMapBegin();
                    _val242 = new java.util.HashMap<java.lang.String,java.lang.Long>(2*_map244.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _key245;
                    long _val246;
                    for (int _i247 = 0; _i247 < _map244.size; ++_i247)
                    {
                      _key245 = iprot.readString();
                      _val246 = iprot.readI64();
                      _val242.put(_key245, _val246);
                    }
                    iprot.readMapEnd();
                  }
                  struct.failed.put(_key241, _val242);
                }
                iprot.readMapEnd();
              }
              struct.set_failed_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPLETE_MS_AVG
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map248 = iprot.readMapBegin();
                struct.complete_ms_avg = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>>(2*_map248.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key249;
                @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Double> _val250;
                for (int _i251 = 0; _i251 < _map248.size; ++_i251)
                {
                  _key249 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map252 = iprot.readMapBegin();
                    _val250 = new java.util.HashMap<java.lang.String,java.lang.Double>(2*_map252.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _key253;
                    double _val254;
                    for (int _i255 = 0; _i255 < _map252.size; ++_i255)
                    {
                      _key253 = iprot.readString();
                      _val254 = iprot.readDouble();
                      _val250.put(_key253, _val254);
                    }
                    iprot.readMapEnd();
                  }
                  struct.complete_ms_avg.put(_key249, _val250);
                }
                iprot.readMapEnd();
              }
              struct.set_complete_ms_avg_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SpoutStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.acked != null) {
        oprot.writeFieldBegin(ACKED_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.acked.size()));
          for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> _iter256 : struct.acked.entrySet())
          {
            oprot.writeString(_iter256.getKey());
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, _iter256.getValue().size()));
              for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter257 : _iter256.getValue().entrySet())
              {
                oprot.writeString(_iter257.getKey());
                oprot.writeI64(_iter257.getValue());
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.failed != null) {
        oprot.writeFieldBegin(FAILED_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.failed.size()));
          for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> _iter258 : struct.failed.entrySet())
          {
            oprot.writeString(_iter258.getKey());
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, _iter258.getValue().size()));
              for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter259 : _iter258.getValue().entrySet())
              {
                oprot.writeString(_iter259.getKey());
                oprot.writeI64(_iter259.getValue());
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.complete_ms_avg != null) {
        oprot.writeFieldBegin(COMPLETE_MS_AVG_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.complete_ms_avg.size()));
          for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Double>> _iter260 : struct.complete_ms_avg.entrySet())
          {
            oprot.writeString(_iter260.getKey());
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, _iter260.getValue().size()));
              for (java.util.Map.Entry<java.lang.String, java.lang.Double> _iter261 : _iter260.getValue().entrySet())
              {
                oprot.writeString(_iter261.getKey());
                oprot.writeDouble(_iter261.getValue());
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SpoutStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpoutStatsTupleScheme getScheme() {
      return new SpoutStatsTupleScheme();
    }
  }

  private static class SpoutStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<SpoutStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SpoutStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.acked.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> _iter262 : struct.acked.entrySet())
        {
          oprot.writeString(_iter262.getKey());
          {
            oprot.writeI32(_iter262.getValue().size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter263 : _iter262.getValue().entrySet())
            {
              oprot.writeString(_iter263.getKey());
              oprot.writeI64(_iter263.getValue());
            }
          }
        }
      }
      {
        oprot.writeI32(struct.failed.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Long>> _iter264 : struct.failed.entrySet())
        {
          oprot.writeString(_iter264.getKey());
          {
            oprot.writeI32(_iter264.getValue().size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter265 : _iter264.getValue().entrySet())
            {
              oprot.writeString(_iter265.getKey());
              oprot.writeI64(_iter265.getValue());
            }
          }
        }
      }
      {
        oprot.writeI32(struct.complete_ms_avg.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,java.lang.Double>> _iter266 : struct.complete_ms_avg.entrySet())
        {
          oprot.writeString(_iter266.getKey());
          {
            oprot.writeI32(_iter266.getValue().size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Double> _iter267 : _iter266.getValue().entrySet())
            {
              oprot.writeString(_iter267.getKey());
              oprot.writeDouble(_iter267.getValue());
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SpoutStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map268 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
        struct.acked = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(2*_map268.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key269;
        @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Long> _val270;
        for (int _i271 = 0; _i271 < _map268.size; ++_i271)
        {
          _key269 = iprot.readString();
          {
            org.apache.thrift.protocol.TMap _map272 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
            _val270 = new java.util.HashMap<java.lang.String,java.lang.Long>(2*_map272.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _key273;
            long _val274;
            for (int _i275 = 0; _i275 < _map272.size; ++_i275)
            {
              _key273 = iprot.readString();
              _val274 = iprot.readI64();
              _val270.put(_key273, _val274);
            }
          }
          struct.acked.put(_key269, _val270);
        }
      }
      struct.set_acked_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map276 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
        struct.failed = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Long>>(2*_map276.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key277;
        @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Long> _val278;
        for (int _i279 = 0; _i279 < _map276.size; ++_i279)
        {
          _key277 = iprot.readString();
          {
            org.apache.thrift.protocol.TMap _map280 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
            _val278 = new java.util.HashMap<java.lang.String,java.lang.Long>(2*_map280.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _key281;
            long _val282;
            for (int _i283 = 0; _i283 < _map280.size; ++_i283)
            {
              _key281 = iprot.readString();
              _val282 = iprot.readI64();
              _val278.put(_key281, _val282);
            }
          }
          struct.failed.put(_key277, _val278);
        }
      }
      struct.set_failed_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map284 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
        struct.complete_ms_avg = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,java.lang.Double>>(2*_map284.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key285;
        @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.Double> _val286;
        for (int _i287 = 0; _i287 < _map284.size; ++_i287)
        {
          _key285 = iprot.readString();
          {
            org.apache.thrift.protocol.TMap _map288 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
            _val286 = new java.util.HashMap<java.lang.String,java.lang.Double>(2*_map288.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _key289;
            double _val290;
            for (int _i291 = 0; _i291 < _map288.size; ++_i291)
            {
              _key289 = iprot.readString();
              _val290 = iprot.readDouble();
              _val286.put(_key289, _val290);
            }
          }
          struct.complete_ms_avg.put(_key285, _val286);
        }
      }
      struct.set_complete_ms_avg_isSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

