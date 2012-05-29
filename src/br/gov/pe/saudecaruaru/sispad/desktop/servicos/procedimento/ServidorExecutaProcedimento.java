/**
 * ServidorExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class ServidorExecutaProcedimento  implements java.io.Serializable {
    private java.lang.String servidor_cpf;

    private java.lang.String procedimento_codigo;

    private java.math.BigInteger quantidade;

    private java.math.BigInteger competencia;

    public ServidorExecutaProcedimento() {
    }

    public ServidorExecutaProcedimento(
           java.lang.String servidor_cpf,
           java.lang.String procedimento_codigo,
           java.math.BigInteger quantidade,
           java.math.BigInteger competencia) {
           this.servidor_cpf = servidor_cpf;
           this.procedimento_codigo = procedimento_codigo;
           this.quantidade = quantidade;
           this.competencia = competencia;
    }


    /**
     * Gets the servidor_cpf value for this ServidorExecutaProcedimento.
     * 
     * @return servidor_cpf
     */
    public java.lang.String getServidor_cpf() {
        return servidor_cpf;
    }


    /**
     * Sets the servidor_cpf value for this ServidorExecutaProcedimento.
     * 
     * @param servidor_cpf
     */
    public void setServidor_cpf(java.lang.String servidor_cpf) {
        this.servidor_cpf = servidor_cpf;
    }


    /**
     * Gets the procedimento_codigo value for this ServidorExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this ServidorExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the quantidade value for this ServidorExecutaProcedimento.
     * 
     * @return quantidade
     */
    public java.math.BigInteger getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this ServidorExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(java.math.BigInteger quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the competencia value for this ServidorExecutaProcedimento.
     * 
     * @return competencia
     */
    public java.math.BigInteger getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this ServidorExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(java.math.BigInteger competencia) {
        this.competencia = competencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServidorExecutaProcedimento)) return false;
        ServidorExecutaProcedimento other = (ServidorExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servidor_cpf==null && other.getServidor_cpf()==null) || 
             (this.servidor_cpf!=null &&
              this.servidor_cpf.equals(other.getServidor_cpf()))) &&
            ((this.procedimento_codigo==null && other.getProcedimento_codigo()==null) || 
             (this.procedimento_codigo!=null &&
              this.procedimento_codigo.equals(other.getProcedimento_codigo()))) &&
            ((this.quantidade==null && other.getQuantidade()==null) || 
             (this.quantidade!=null &&
              this.quantidade.equals(other.getQuantidade()))) &&
            ((this.competencia==null && other.getCompetencia()==null) || 
             (this.competencia!=null &&
              this.competencia.equals(other.getCompetencia())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getServidor_cpf() != null) {
            _hashCode += getServidor_cpf().hashCode();
        }
        if (getProcedimento_codigo() != null) {
            _hashCode += getProcedimento_codigo().hashCode();
        }
        if (getQuantidade() != null) {
            _hashCode += getQuantidade().hashCode();
        }
        if (getCompetencia() != null) {
            _hashCode += getCompetencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServidorExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ServidorExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servidor_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servidor_cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedimento_codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "procedimento_codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "competencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
