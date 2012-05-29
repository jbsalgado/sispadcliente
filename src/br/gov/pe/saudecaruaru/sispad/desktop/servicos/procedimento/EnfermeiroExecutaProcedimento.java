/**
 * EnfermeiroExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class EnfermeiroExecutaProcedimento  implements java.io.Serializable {
    private java.lang.String enfermeiro_unidade_cnes;

    private java.lang.String enfermeiro_cpf;

    private int competencia;

    private int quantidade;

    private java.lang.String procedimento_codigo;

    public EnfermeiroExecutaProcedimento() {
    }

    public EnfermeiroExecutaProcedimento(
           java.lang.String enfermeiro_unidade_cnes,
           java.lang.String enfermeiro_cpf,
           int competencia,
           int quantidade,
           java.lang.String procedimento_codigo) {
           this.enfermeiro_unidade_cnes = enfermeiro_unidade_cnes;
           this.enfermeiro_cpf = enfermeiro_cpf;
           this.competencia = competencia;
           this.quantidade = quantidade;
           this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the enfermeiro_unidade_cnes value for this EnfermeiroExecutaProcedimento.
     * 
     * @return enfermeiro_unidade_cnes
     */
    public java.lang.String getEnfermeiro_unidade_cnes() {
        return enfermeiro_unidade_cnes;
    }


    /**
     * Sets the enfermeiro_unidade_cnes value for this EnfermeiroExecutaProcedimento.
     * 
     * @param enfermeiro_unidade_cnes
     */
    public void setEnfermeiro_unidade_cnes(java.lang.String enfermeiro_unidade_cnes) {
        this.enfermeiro_unidade_cnes = enfermeiro_unidade_cnes;
    }


    /**
     * Gets the enfermeiro_cpf value for this EnfermeiroExecutaProcedimento.
     * 
     * @return enfermeiro_cpf
     */
    public java.lang.String getEnfermeiro_cpf() {
        return enfermeiro_cpf;
    }


    /**
     * Sets the enfermeiro_cpf value for this EnfermeiroExecutaProcedimento.
     * 
     * @param enfermeiro_cpf
     */
    public void setEnfermeiro_cpf(java.lang.String enfermeiro_cpf) {
        this.enfermeiro_cpf = enfermeiro_cpf;
    }


    /**
     * Gets the competencia value for this EnfermeiroExecutaProcedimento.
     * 
     * @return competencia
     */
    public int getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this EnfermeiroExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }


    /**
     * Gets the quantidade value for this EnfermeiroExecutaProcedimento.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this EnfermeiroExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the procedimento_codigo value for this EnfermeiroExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this EnfermeiroExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnfermeiroExecutaProcedimento)) return false;
        EnfermeiroExecutaProcedimento other = (EnfermeiroExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enfermeiro_unidade_cnes==null && other.getEnfermeiro_unidade_cnes()==null) || 
             (this.enfermeiro_unidade_cnes!=null &&
              this.enfermeiro_unidade_cnes.equals(other.getEnfermeiro_unidade_cnes()))) &&
            ((this.enfermeiro_cpf==null && other.getEnfermeiro_cpf()==null) || 
             (this.enfermeiro_cpf!=null &&
              this.enfermeiro_cpf.equals(other.getEnfermeiro_cpf()))) &&
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
        if (getEnfermeiro_unidade_cnes() != null) {
            _hashCode += getEnfermeiro_unidade_cnes().hashCode();
        }
        if (getEnfermeiro_cpf() != null) {
            _hashCode += getEnfermeiro_cpf().hashCode();
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
        new org.apache.axis.description.TypeDesc(EnfermeiroExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enfermeiro_unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enfermeiro_unidade_cnes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enfermeiro_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enfermeiro_cpf"));
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
