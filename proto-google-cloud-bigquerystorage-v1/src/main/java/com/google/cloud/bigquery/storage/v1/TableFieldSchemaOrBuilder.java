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
// source: google/cloud/bigquery/storage/v1/table.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.storage.v1;

public interface TableFieldSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1.TableFieldSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The field name. The name must contain only letters (a-z, A-Z),
   * numbers (0-9), or underscores (_), and must start with a letter or
   * underscore. The maximum length is 128 characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The field data type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.Type type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The field data type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.Type type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchema.Type getType();

  /**
   *
   *
   * <pre>
   * Optional. The field mode. The default value is NULLABLE.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.Mode mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The field mode. The default value is NULLABLE.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.Mode mode = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mode.
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchema.Mode getMode();

  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to
   * STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.storage.v1.TableFieldSchema> getFieldsList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to
   * STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchema getFields(int index);
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to
   * STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to
   * STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.storage.v1.TableFieldSchemaOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Describes the nested schema fields if the type property is set to
   * STRUCT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.bigquery.storage.v1.TableFieldSchema fields = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchemaOrBuilder getFieldsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The field description. The maximum length is 1,024 characters.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The field description. The maximum length is 1,024 characters.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Maximum length of values of this field for STRINGS or BYTES.
   *
   * If max_length is not specified, no maximum length constraint is imposed
   * on this field.
   *
   * If type = "STRING", then max_length represents the maximum UTF-8
   * length of strings in this field.
   *
   * If type = "BYTES", then max_length represents the maximum number of
   * bytes in this field.
   *
   * It is invalid to set this field if type is not "STRING" or "BYTES".
   * </pre>
   *
   * <code>int64 max_length = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxLength.
   */
  long getMaxLength();

  /**
   *
   *
   * <pre>
   * Optional. Precision (maximum number of total digits in base 10) and scale
   * (maximum number of digits in the fractional part in base 10) constraints
   * for values of this field for NUMERIC or BIGNUMERIC.
   *
   * It is invalid to set precision or scale if type is not "NUMERIC" or
   * "BIGNUMERIC".
   *
   * If precision and scale are not specified, no value range constraint is
   * imposed on this field insofar as values are permitted by the type.
   *
   * Values of this NUMERIC or BIGNUMERIC field must be in this range when:
   *
   * * Precision (P) and scale (S) are specified:
   *   [-10^(P-S) + 10^(-S), 10^(P-S) - 10^(-S)]
   * * Precision (P) is specified but not scale (and thus scale is
   *   interpreted to be equal to zero):
   *   [-10^P + 1, 10^P - 1].
   *
   * Acceptable values for precision and scale if both are specified:
   *
   * * If type = "NUMERIC":
   *   1 &lt;= precision - scale &lt;= 29 and 0 &lt;= scale &lt;= 9.
   * * If type = "BIGNUMERIC":
   *   1 &lt;= precision - scale &lt;= 38 and 0 &lt;= scale &lt;= 38.
   *
   * Acceptable values for precision if only precision is specified but not
   * scale (and thus scale is interpreted to be equal to zero):
   *
   * * If type = "NUMERIC": 1 &lt;= precision &lt;= 29.
   * * If type = "BIGNUMERIC": 1 &lt;= precision &lt;= 38.
   *
   * If scale is specified but not precision, then it is invalid.
   * </pre>
   *
   * <code>int64 precision = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The precision.
   */
  long getPrecision();

  /**
   *
   *
   * <pre>
   * Optional. See documentation for precision.
   * </pre>
   *
   * <code>int64 scale = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The scale.
   */
  long getScale();

  /**
   *
   *
   * <pre>
   * Optional. A SQL expression to specify the [default value]
   * (https://cloud.google.com/bigquery/docs/default-values) for this field.
   * </pre>
   *
   * <code>string default_value_expression = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The defaultValueExpression.
   */
  java.lang.String getDefaultValueExpression();
  /**
   *
   *
   * <pre>
   * Optional. A SQL expression to specify the [default value]
   * (https://cloud.google.com/bigquery/docs/default-values) for this field.
   * </pre>
   *
   * <code>string default_value_expression = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for defaultValueExpression.
   */
  com.google.protobuf.ByteString getDefaultValueExpressionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The subtype of the RANGE, if the type of this field is RANGE. If
   * the type is RANGE, this field is required. Possible values for the field
   * element type of a RANGE include:
   * * DATE
   * * DATETIME
   * * TIMESTAMP
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.FieldElementType range_element_type = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the rangeElementType field is set.
   */
  boolean hasRangeElementType();
  /**
   *
   *
   * <pre>
   * Optional. The subtype of the RANGE, if the type of this field is RANGE. If
   * the type is RANGE, this field is required. Possible values for the field
   * element type of a RANGE include:
   * * DATE
   * * DATETIME
   * * TIMESTAMP
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.FieldElementType range_element_type = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The rangeElementType.
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchema.FieldElementType getRangeElementType();
  /**
   *
   *
   * <pre>
   * Optional. The subtype of the RANGE, if the type of this field is RANGE. If
   * the type is RANGE, this field is required. Possible values for the field
   * element type of a RANGE include:
   * * DATE
   * * DATETIME
   * * TIMESTAMP
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.TableFieldSchema.FieldElementType range_element_type = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.storage.v1.TableFieldSchema.FieldElementTypeOrBuilder
      getRangeElementTypeOrBuilder();
}
