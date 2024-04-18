/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/storage.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.storage.v1;

/**
 *
 *
 * <pre>
 * The message that presents row level error info in a request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1.RowError}
 */
public final class RowError extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1.RowError)
    RowErrorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RowError.newBuilder() to construct.
  private RowError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RowError() {
    code_ = 0;
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RowError();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1_RowError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1_RowError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1.RowError.class,
            com.google.cloud.bigquery.storage.v1.RowError.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Error code for `RowError`.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.bigquery.storage.v1.RowError.RowErrorCode}
   */
  public enum RowErrorCode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default error.
     * </pre>
     *
     * <code>ROW_ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    ROW_ERROR_CODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * One or more fields in the row has errors.
     * </pre>
     *
     * <code>FIELDS_ERROR = 1;</code>
     */
    FIELDS_ERROR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default error.
     * </pre>
     *
     * <code>ROW_ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    public static final int ROW_ERROR_CODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * One or more fields in the row has errors.
     * </pre>
     *
     * <code>FIELDS_ERROR = 1;</code>
     */
    public static final int FIELDS_ERROR_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RowErrorCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RowErrorCode forNumber(int value) {
      switch (value) {
        case 0:
          return ROW_ERROR_CODE_UNSPECIFIED;
        case 1:
          return FIELDS_ERROR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RowErrorCode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RowErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RowErrorCode>() {
          public RowErrorCode findValueByNumber(int number) {
            return RowErrorCode.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.RowError.getDescriptor().getEnumTypes().get(0);
    }

    private static final RowErrorCode[] VALUES = values();

    public static RowErrorCode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RowErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.storage.v1.RowError.RowErrorCode)
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private long index_ = 0L;
  /**
   *
   *
   * <pre>
   * Index of the malformed row in the request.
   * </pre>
   *
   * <code>int64 index = 1;</code>
   *
   * @return The index.
   */
  @java.lang.Override
  public long getIndex() {
    return index_;
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private int code_ = 0;
  /**
   *
   *
   * <pre>
   * Structured error reason for a row error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override
  public int getCodeValue() {
    return code_;
  }
  /**
   *
   *
   * <pre>
   * Structured error reason for a row error.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
   *
   * @return The code.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode getCode() {
    com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode result =
        com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.forNumber(code_);
    return result == null
        ? com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.UNRECOGNIZED
        : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   *
   *
   * <pre>
   * Description of the issue encountered when processing the row.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Description of the issue encountered when processing the row.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (index_ != 0L) {
      output.writeInt64(1, index_);
    }
    if (code_
        != com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.ROW_ERROR_CODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, index_);
    }
    if (code_
        != com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.ROW_ERROR_CODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1.RowError)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1.RowError other =
        (com.google.cloud.bigquery.storage.v1.RowError) obj;

    if (getIndex() != other.getIndex()) return false;
    if (code_ != other.code_) return false;
    if (!getMessage().equals(other.getMessage())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIndex());
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.RowError parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.bigquery.storage.v1.RowError prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The message that presents row level error info in a request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1.RowError}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1.RowError)
      com.google.cloud.bigquery.storage.v1.RowErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_RowError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_RowError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1.RowError.class,
              com.google.cloud.bigquery.storage.v1.RowError.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1.RowError.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      index_ = 0L;
      code_ = 0;
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_RowError_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.RowError getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1.RowError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.RowError build() {
      com.google.cloud.bigquery.storage.v1.RowError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.RowError buildPartial() {
      com.google.cloud.bigquery.storage.v1.RowError result =
          new com.google.cloud.bigquery.storage.v1.RowError(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.storage.v1.RowError result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1.RowError) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1.RowError) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1.RowError other) {
      if (other == com.google.cloud.bigquery.storage.v1.RowError.getDefaultInstance()) return this;
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                index_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                code_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private long index_;
    /**
     *
     *
     * <pre>
     * Index of the malformed row in the request.
     * </pre>
     *
     * <code>int64 index = 1;</code>
     *
     * @return The index.
     */
    @java.lang.Override
    public long getIndex() {
      return index_;
    }
    /**
     *
     *
     * <pre>
     * Index of the malformed row in the request.
     * </pre>
     *
     * <code>int64 index = 1;</code>
     *
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(long value) {

      index_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Index of the malformed row in the request.
     * </pre>
     *
     * <code>int64 index = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      index_ = 0L;
      onChanged();
      return this;
    }

    private int code_ = 0;
    /**
     *
     *
     * <pre>
     * Structured error reason for a row error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
     *
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override
    public int getCodeValue() {
      return code_;
    }
    /**
     *
     *
     * <pre>
     * Structured error reason for a row error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
     *
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Structured error reason for a row error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
     *
     * @return The code.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode getCode() {
      com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode result =
          com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.forNumber(code_);
      return result == null
          ? com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Structured error reason for a row error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
     *
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.google.cloud.bigquery.storage.v1.RowError.RowErrorCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Structured error reason for a row error.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.RowError.RowErrorCode code = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     *
     *
     * <pre>
     * Description of the issue encountered when processing the row.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the issue encountered when processing the row.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the issue encountered when processing the row.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the issue encountered when processing the row.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the issue encountered when processing the row.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1.RowError)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1.RowError)
  private static final com.google.cloud.bigquery.storage.v1.RowError DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1.RowError();
  }

  public static com.google.cloud.bigquery.storage.v1.RowError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RowError> PARSER =
      new com.google.protobuf.AbstractParser<RowError>() {
        @java.lang.Override
        public RowError parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<RowError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RowError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.RowError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
