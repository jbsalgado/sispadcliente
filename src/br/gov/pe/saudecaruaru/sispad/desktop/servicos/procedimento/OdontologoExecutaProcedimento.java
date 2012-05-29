/**
 * OdontologoExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class OdontologoExecutaProcedimento  implements java.io.Serializable {
    private java.lang.String odontologo_unidade_cnes;

    private java.lang.String odontologo_cpf;

    private int competencia;

    private int quantidade;

    private java.lang.String procedimento_codigo;

    public OdontologoExecutaProcedimento() {
    }

    public OdontologoExecutaProcedimento(
           java.lang.String odontologo_unidade_cnes,
           java.lang.String odontologo_cpf,
           int competencia,
           int quantidade,
           java.lang.String procedimento_codigo) {
           this.odontologo_unidade_cnes = odontologo_unidade_cnes;
           this.odontologo_cpf = odontologo_cpf;
           this.competencia = competencia;
           this.quantidade = quantidade;
           this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the odontologo_unidade_cnes value for this OdontologoExecutaProcedimento.
     * 
     * @return odontologo_unidade_cnes
     */
    public java.lang.String getOdontologo_unidade_cnes() {
        return odontologo_unidade_cnes;
    }


    /**
     * Sets the odontologo_unidade_cnes value for this OdontologoExecutaProcedimento.
     * 
     * @param odontologo_unidade_cnes
     */
    public void setOdontologo_unidade_cnes(java.lang.String odontologo_unidade_cnes) {
        this.odontologo_unidade_cnes = odontologo_unidade_cnes;
    }


    /**
     * Gets the odontologo_cpf value for this OdontologoExecutaProcedimento.
     * 
     * @return odontologo_cpf
     */
    public java.lang.String getOdontologo_cpf() {
        return odontologo_cpf;
    }


    /**
     * Sets the odontologo_cpf value for this OdontologoExecutaProcedimento.
     * 
     * @param odontologo_cpf
     */
    public void setOdontologo_cpf(java.lang.String odontologo_cpf) {
        this.odontologo_cpf = odontologo_cpf;
    }


    /**
     * Gets the competencia value for this OdontologoExecutaProcedimento.
     * 
     * @return competencia
     */
    public int getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this OdontologoExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }


    /**
     * Gets the quantidade value for this OdontologoExecutaProcedimento.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this OdontologoExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the procedimento_codigo value for this OdontologoExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this OdontologoExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OdontologoExecutaProcedimento)) return false;
        OdontologoExecutaProcedimento other = (OdontologoExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.odontologo_unidade_cnes==null && other.getOdontologo_unidade_cnes()==null) || 
             (this.odontologo_unidade_cnes!=null &&
              this.odontologo_unidade_cnes.equals(other.getOdontologo_unidade_cnes()))) &&
            ((this.odontologo_cpf==null && other.getOdontologo_cpf()==null) || 
             (this.odontologo_cpf!=null &&
              this.odontologo_cpf.equals(other.getOdontologo_cpf()))) &&
            this.competencia == other.getCompetencia() &&
            this.quantidade == other.getQuantidade() &&
            ((this.procedimento_codigo==null && other.getProcedimento_codigo()==null) || 
             (this.procedimento_codigo!=null &&
              this.procedimento_codigo.equals(other.getProcedimento_codigo())));
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
        if (getOdontologo_unidade_cnes() != null) {
            _hashCode += getOdontologo_unidade_cnes().hashCode();
        }
        if (getOdontologo_cpf() != null) {
            _hashCode += getOdontologo_cpf().hashCode();
        }
        _hashCode += getCompetencia();
        _hashCode += getQuantidade();
        if (getProcedimento_codigo() != null) {
            _hashCode += getProcedimento_codigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OdontologoExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odontologo_unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odontologo_unidade_cnes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("odontologo_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "odontologo_cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "competencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedimento_codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "procedimento_codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
