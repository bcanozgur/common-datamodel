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
public class RelatedRequestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5938170810212795057L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RelatedRequestAvro\",\"namespace\":\"com.yaay.backend.model.avro\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"query\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QueryAvro\",\"symbols\":[\"MUTED\",\"MUTED_BY\",\"FOLLOWERS\",\"FOLLOWING\",\"BLOCKED\",\"BLOCKED_BY\",\"WHITELISTED_FOLLOWERS\"]}],\"default\":null},{\"name\":\"pagingState\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"limit\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RelatedRequestAvro> ENCODER =
      new BinaryMessageEncoder<RelatedRequestAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RelatedRequestAvro> DECODER =
      new BinaryMessageDecoder<RelatedRequestAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RelatedRequestAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RelatedRequestAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RelatedRequestAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RelatedRequestAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RelatedRequestAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RelatedRequestAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RelatedRequestAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RelatedRequestAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String id;
  private com.yaay.backend.model.avro.QueryAvro query;
  private java.lang.String pagingState;
  private java.lang.Integer limit;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RelatedRequestAvro() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param query The new value for query
   * @param pagingState The new value for pagingState
   * @param limit The new value for limit
   */
  public RelatedRequestAvro(java.lang.String id, com.yaay.backend.model.avro.QueryAvro query, java.lang.String pagingState, java.lang.Integer limit) {
    this.id = id;
    this.query = query;
    this.pagingState = pagingState;
    this.limit = limit;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return query;
    case 2: return pagingState;
    case 3: return limit;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = value$ != null ? value$.toString() : null; break;
    case 1: query = (com.yaay.backend.model.avro.QueryAvro)value$; break;
    case 2: pagingState = value$ != null ? value$.toString() : null; break;
    case 3: limit = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'query' field.
   * @return The value of the 'query' field.
   */
  public com.yaay.backend.model.avro.QueryAvro getQuery() {
    return query;
  }


  /**
   * Sets the value of the 'query' field.
   * @param value the value to set.
   */
  public void setQuery(com.yaay.backend.model.avro.QueryAvro value) {
    this.query = value;
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
   * Creates a new RelatedRequestAvro RecordBuilder.
   * @return A new RelatedRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelatedRequestAvro.Builder newBuilder() {
    return new com.yaay.backend.model.avro.RelatedRequestAvro.Builder();
  }

  /**
   * Creates a new RelatedRequestAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RelatedRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelatedRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.RelatedRequestAvro.Builder other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.RelatedRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.RelatedRequestAvro.Builder(other);
    }
  }

  /**
   * Creates a new RelatedRequestAvro RecordBuilder by copying an existing RelatedRequestAvro instance.
   * @param other The existing instance to copy.
   * @return A new RelatedRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelatedRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.RelatedRequestAvro other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.RelatedRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.RelatedRequestAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for RelatedRequestAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RelatedRequestAvro>
    implements org.apache.avro.data.RecordBuilder<RelatedRequestAvro> {

    private java.lang.String id;
    private com.yaay.backend.model.avro.QueryAvro query;
    private java.lang.String pagingState;
    private java.lang.Integer limit;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yaay.backend.model.avro.RelatedRequestAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.query)) {
        this.query = data().deepCopy(fields()[1].schema(), other.query);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.pagingState)) {
        this.pagingState = data().deepCopy(fields()[2].schema(), other.pagingState);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.limit)) {
        this.limit = data().deepCopy(fields()[3].schema(), other.limit);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing RelatedRequestAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yaay.backend.model.avro.RelatedRequestAvro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.query)) {
        this.query = data().deepCopy(fields()[1].schema(), other.query);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pagingState)) {
        this.pagingState = data().deepCopy(fields()[2].schema(), other.pagingState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.limit)) {
        this.limit = data().deepCopy(fields()[3].schema(), other.limit);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'query' field.
      * @return The value.
      */
    public com.yaay.backend.model.avro.QueryAvro getQuery() {
      return query;
    }


    /**
      * Sets the value of the 'query' field.
      * @param value The value of 'query'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder setQuery(com.yaay.backend.model.avro.QueryAvro value) {
      validate(fields()[1], value);
      this.query = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'query' field has been set.
      * @return True if the 'query' field has been set, false otherwise.
      */
    public boolean hasQuery() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'query' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder clearQuery() {
      query = null;
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
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder setPagingState(java.lang.String value) {
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
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder clearPagingState() {
      pagingState = null;
      fieldSetFlags()[2] = false;
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
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder setLimit(java.lang.Integer value) {
      validate(fields()[3], value);
      this.limit = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'limit' field has been set.
      * @return True if the 'limit' field has been set, false otherwise.
      */
    public boolean hasLimit() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'limit' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelatedRequestAvro.Builder clearLimit() {
      limit = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RelatedRequestAvro build() {
      try {
        RelatedRequestAvro record = new RelatedRequestAvro();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.query = fieldSetFlags()[1] ? this.query : (com.yaay.backend.model.avro.QueryAvro) defaultValue(fields()[1]);
        record.pagingState = fieldSetFlags()[2] ? this.pagingState : (java.lang.String) defaultValue(fields()[2]);
        record.limit = fieldSetFlags()[3] ? this.limit : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RelatedRequestAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<RelatedRequestAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RelatedRequestAvro>
    READER$ = (org.apache.avro.io.DatumReader<RelatedRequestAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.query == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.query.ordinal());
    }

    if (this.pagingState == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.pagingState);
    }

    if (this.limit == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.limit);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.query = null;
      } else {
        this.query = com.yaay.backend.model.avro.QueryAvro.values()[in.readEnum()];
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.pagingState = null;
      } else {
        this.pagingState = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.limit = null;
      } else {
        this.limit = in.readInt();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.query = null;
          } else {
            this.query = com.yaay.backend.model.avro.QueryAvro.values()[in.readEnum()];
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
            this.limit = null;
          } else {
            this.limit = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









