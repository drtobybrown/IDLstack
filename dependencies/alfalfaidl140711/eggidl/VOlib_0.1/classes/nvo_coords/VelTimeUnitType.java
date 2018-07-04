/**
 * VelTimeUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2beta Mar 31, 2004 (12:47:03 EST) WSDL2Java emitter.
 */

package nvo_coords;

public class VelTimeUnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VelTimeUnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "s";
    public static final java.lang.String _value2 = "h";
    public static final java.lang.String _value3 = "d";
    public static final java.lang.String _value4 = "a";
    public static final java.lang.String _value5 = "yr";
    public static final java.lang.String _value6 = "century";
    public static final java.lang.String _value7 = "";
    public static final VelTimeUnitType value1 = new VelTimeUnitType(_value1);
    public static final VelTimeUnitType value2 = new VelTimeUnitType(_value2);
    public static final VelTimeUnitType value3 = new VelTimeUnitType(_value3);
    public static final VelTimeUnitType value4 = new VelTimeUnitType(_value4);
    public static final VelTimeUnitType value5 = new VelTimeUnitType(_value5);
    public static final VelTimeUnitType value6 = new VelTimeUnitType(_value6);
    public static final VelTimeUnitType value7 = new VelTimeUnitType(_value7);
    public java.lang.String getValue() { return _value_;}
    public static VelTimeUnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VelTimeUnitType enumeration = (VelTimeUnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VelTimeUnitType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VelTimeUnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:nvo-coords", "velTimeUnitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}