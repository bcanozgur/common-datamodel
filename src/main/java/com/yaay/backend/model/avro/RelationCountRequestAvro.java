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
public class RelationCountRequestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8309152335996933119L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RelationCountRequestAvro\",\"namespace\":\"com.yaay.backend.model.avro\",\"fields\":[{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"relation\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QueryAvro\",\"symbols\":[\"MUTED\",\"MUTED_BY\",\"FOLLOWERS\",\"FOLLOWING\",\"BLOCKED\",\"BLOCKED_BY\",\"WHITELISTED_FOLLOWERS\"]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RelationCountRequestAvro> ENCODER =
      new BinaryMessageEncoder<RelationCountRequestAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RelationCountRequestAvro> DECODER =
      new BinaryMessageDecoder<RelationCountRequestAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RelationCountRequestAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RelationCountRequestAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RelationCountRequestAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RelationCountRequestAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RelationCountRequestAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RelationCountRequestAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RelationCountRequestAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RelationCountRequestAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String userId;
  private com.yaay.backend.model.avro.QueryAvro relation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RelationCountRequestAvro() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param relation The new value for relation
   */
  public RelationCountRequestAvro(java.lang.String userId, com.yaay.backend.model.avro.QueryAvro relation) {
    this.userId = userId;
    this.relation = relation;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return relation;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = value$ != null ? value$.toString() : null; break;
    case 1: relation = (com.yaay.backend.model.avro.QueryAvro)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.String value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'relation' field.
   * @return The value of the 'relation' field.
   */
  public com.yaay.backend.model.avro.QueryAvro getRelation() {
    return relation;
  }


  /**
   * Sets the value of the 'relation' field.
   * @param value the value to set.
   */
  public void setRelation(com.yaay.backend.model.avro.QueryAvro value) {
    this.relation = value;
  }

  /**
   * Creates a new RelationCountRequestAvro RecordBuilder.
   * @return A new RelationCountRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelationCountRequestAvro.Builder newBuilder() {
    return new com.yaay.backend.model.avro.RelationCountRequestAvro.Builder();
  }

  /**
   * Creates a new RelationCountRequestAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RelationCountRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelationCountRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.RelationCountRequestAvro.Builder other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.RelationCountRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.RelationCountRequestAvro.Builder(other);
    }
  }

  /**
   * Creates a new RelationCountRequestAvro RecordBuilder by copying an existing RelationCountRequestAvro instance.
   * @param other The existing instance to copy.
   * @return A new RelationCountRequestAvro RecordBuilder
   */
  public static com.yaay.backend.model.avro.RelationCountRequestAvro.Builder newBuilder(com.yaay.backend.model.avro.RelationCountRequestAvro other) {
    if (other == null) {
      return new com.yaay.backend.model.avro.RelationCountRequestAvro.Builder();
    } else {
      return new com.yaay.backend.model.avro.RelationCountRequestAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for RelationCountRequestAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RelationCountRequestAvro>
    implements org.apache.avro.data.RecordBuilder<RelationCountRequestAvro> {

    private java.lang.String userId;
    private com.yaay.backend.model.avro.QueryAvro relation;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yaay.backend.model.avro.RelationCountRequestAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.relation)) {
        this.relation = data().deepCopy(fields()[1].schema(), other.relation);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing RelationCountRequestAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yaay.backend.model.avro.RelationCountRequestAvro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.relation)) {
        this.relation = data().deepCopy(fields()[1].schema(), other.relation);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelationCountRequestAvro.Builder setUserId(java.lang.String value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelationCountRequestAvro.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'relation' field.
      * @return The value.
      */
    public com.yaay.backend.model.avro.QueryAvro getRelation() {
      return relation;
    }


    /**
      * Sets the value of the 'relation' field.
      * @param value The value of 'relation'.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelationCountRequestAvro.Builder setRelation(com.yaay.backend.model.avro.QueryAvro value) {
      validate(fields()[1], value);
      this.relation = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'relation' field has been set.
      * @return True if the 'relation' field has been set, false otherwise.
      */
    public boolean hasRelation() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'relation' field.
      * @return This builder.
      */
    public com.yaay.backend.model.avro.RelationCountRequestAvro.Builder clearRelation() {
      relation = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RelationCountRequestAvro build() {
      try {
        RelationCountRequestAvro record = new RelationCountRequestAvro();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.String) defaultValue(fields()[0]);
        record.relation = fieldSetFlags()[1] ? this.relation : (com.yaay.backend.model.avro.QueryAvro) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RelationCountRequestAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<RelationCountRequestAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RelationCountRequestAvro>
    READER$ = (org.apache.avro.io.DatumReader<RelationCountRequestAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.userId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.userId);
    }

    if (this.relation == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.relation.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.userId = null;
      } else {
        this.userId = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.relation = null;
      } else {
        this.relation = com.yaay.backend.model.avro.QueryAvro.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.userId = null;
          } else {
            this.userId = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.relation = null;
          } else {
            this.relation = com.yaay.backend.model.avro.QueryAvro.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










