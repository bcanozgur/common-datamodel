/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.yaay.backend.model.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TimelineRequestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1088313353569914819L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TimelineRequestAvro\",\"namespace\":\"com.yaay.backend.model.avro\",\"fields\":[{\"name\":\"key\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"description\":\"The key is one of; userId, hashtag or category\"},{\"name\":\"limit\",\"type\":[\"null\",\"int\"],\"default\":null,\"description\":\"The limit\"},{\"name\":\"pagingState\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"description\":\"The offset\"},{\"name\":\"currentUserId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TimelineRequestAvro> ENCODER =
      new BinaryMessageEncoder<TimelineRequestAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TimelineRequestAvro> DECODER =
      new BinaryMessageDecoder<TimelineRequestAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TimelineRequestAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TimelineRequestAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TimelineRequestAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TimelineRequestAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TimelineRequestAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TimelineRequestAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TimelineRequestAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TimelineRequestAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String key;
  private java.lang.Integer limit;
  private java.lang.String pagingState;
  private java.lang.String currentUserId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TimelineRequestAvro() {}

  /**
   * All-args constructor.
   * @param key The new value for key
   * @param limit The new value for limit
   * @param pagingState The new value for pagingState
   * @param currentUserId The new value for currentUserId
   */
  public TimelineRequestAvro(java.lang.String key, java.lang.Integer limit, java.lang.String pagingState, java.lang.String currentUserId) {
    this.key = key;
    this.limit = limit;
    this.pagingState = pagingState;
    this.currentUserId = currentUserId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return limit;
    case 2: return pagingState;
    case 3: return currentUserId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = value$ != null ? value$.toString() : null; break;
    case 1: limit = (java.lang.Integer)value$; break;
    case 2: pagingState = value$ != null ? value$.toString() : null; break;
    case 3: currentUserId = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'key' field.
   * @return The value of the 'key' field.
   */
  public java.lang.String getKey() {
    return key;
  }


  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.String value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'limit' field.
   * @return The value of the 'limit' field.
   */
  public java.lang.Integer getLimit() {
    return limit;
  }


  /**
   * Sets the value of the 'limit' field.
   * @param value the value to set.
   */
  public void setLimit(java.lang.Integer value) {
    this.limit = value;
  }

  /**
   * Gets the value of the 'pagingState' field.
   * @return The value of the 'pagingState' field.
   */
  public java.lang.String getPagingState() {
    return pagingState;
  }


  /**
   * Sets the value of the 'pagingState' field.
   * @param value the value to set.
   */
  public void setPagingState(java.lang.String value) {
    this.pagingState = value;
  }

  /**
   * Gets the value of the 'currentUserId' field.
   * @return The value of the 'currentUserId' field.
   */
  public java.lang.String getCurrentUserId() {
    return currentUserId;
  }


  /**
   * Sets the value of the 'currentUserId' field.
   * @param value the value to set.
   */
  public void setCurrentUserId(java.lang.String value) {
    this.currentUserId = value;
  }

  /**
   * Creates a new TimelineRequestAvro RecordBuilder.
   * @return A new TimelineRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.TimelineRequestAvro.Builder newBuilder() {
    return new com.yaay.backend.model.avro.TimelineRequestAvro.Builder();
  }

  /**
   * Creates a new TimelineRequestAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TimelineRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.TimelineRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.TimelineRequestAvro.Builder other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.TimelineRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.TimelineRequestAvro.Builder(other);
    }
  }

  /**
   * Creates a new TimelineRequestAvro RecordBuilder by copying an existing TimelineRequestAvro instance.
   * @param other The existing instance to copy.
   * @return A new TimelineRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.TimelineRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.TimelineRequestAvro other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.TimelineRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.TimelineRequestAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for TimelineRequestAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TimelineRequestAvro>
    implements org.apache.avro.data.RecordBuilder<TimelineRequestAvro> {

    private java.lang.String key;
    private java.lang.Integer limit;
    private java.lang.String pagingState;
    private java.lang.String currentUserId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yaay.backend.model.avro.TimelineRequestAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.limit)) {
        this.limit = data().deepCopy(fields()[1].schema(), other.limit);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.pagingState)) {
        this.pagingState = data().deepCopy(fields()[2].schema(), other.pagingState);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.currentUserId)) {
        this.currentUserId = data().deepCopy(fields()[3].schema(), other.currentUserId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing TimelineRequestAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yaay.backend.model.avro.TimelineRequestAvro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.limit)) {
        this.limit = data().deepCopy(fields()[1].schema(), other.limit);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pagingState)) {
        this.pagingState = data().deepCopy(fields()[2].schema(), other.pagingState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.currentUserId)) {
        this.currentUserId = data().deepCopy(fields()[3].schema(), other.currentUserId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'key' field.
      * @return The value.
      */
    public java.lang.String getKey() {
      return key;
    }


    /**
      * Sets the value of the 'key' field.
      * @param value The value of 'key'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder setKey(java.lang.String value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'key' field has been set.
      * @return True if the 'key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'key' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'limit' field.
      * @return The value.
      */
    public java.lang.Integer getLimit() {
      return limit;
    }


    /**
      * Sets the value of the 'limit' field.
      * @param value The value of 'limit'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder setLimit(java.lang.Integer value) {
      validate(fields()[1], value);
      this.limit = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'limit' field has been set.
      * @return True if the 'limit' field has been set, false otherwise.
      */
    public boolean hasLimit() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'limit' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder clearLimit() {
      limit = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'pagingState' field.
      * @return The value.
      */
    public java.lang.String getPagingState() {
      return pagingState;
    }


    /**
      * Sets the value of the 'pagingState' field.
      * @param value The value of 'pagingState'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder setPagingState(java.lang.String value) {
      validate(fields()[2], value);
      this.pagingState = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'pagingState' field has been set.
      * @return True if the 'pagingState' field has been set, false otherwise.
      */
    public boolean hasPagingState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'pagingState' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder clearPagingState() {
      pagingState = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentUserId' field.
      * @return The value.
      */
    public java.lang.String getCurrentUserId() {
      return currentUserId;
    }


    /**
      * Sets the value of the 'currentUserId' field.
      * @param value The value of 'currentUserId'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder setCurrentUserId(java.lang.String value) {
      validate(fields()[3], value);
      this.currentUserId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'currentUserId' field has been set.
      * @return True if the 'currentUserId' field has been set, false otherwise.
      */
    public boolean hasCurrentUserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'currentUserId' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.TimelineRequestAvro.Builder clearCurrentUserId() {
      currentUserId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TimelineRequestAvro build() {
      try {
        TimelineRequestAvro record = new TimelineRequestAvro();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.String) defaultValue(fields()[0]);
        record.limit = fieldSetFlags()[1] ? this.limit : (java.lang.Integer) defaultValue(fields()[1]);
        record.pagingState = fieldSetFlags()[2] ? this.pagingState : (java.lang.String) defaultValue(fields()[2]);
        record.currentUserId = fieldSetFlags()[3] ? this.currentUserId : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TimelineRequestAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<TimelineRequestAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TimelineRequestAvro>
    READER$ = (org.apache.avro.io.DatumReader<TimelineRequestAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.key == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.key);
    }

    if (this.limit == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.limit);
    }

    if (this.pagingState == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.pagingState);
    }

    if (this.currentUserId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.currentUserId);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.key = null;
      } else {
        this.key = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.limit = null;
      } else {
        this.limit = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pagingState = null;
      } else {
        this.pagingState = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.currentUserId = null;
      } else {
        this.currentUserId = in.readString();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.key = null;
          } else {
            this.key = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.limit = null;
          } else {
            this.limit = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.pagingState = null;
          } else {
            this.pagingState = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.currentUserId = null;
          } else {
            this.currentUserId = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










