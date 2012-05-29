/**
 * MedicoExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class MedicoExecutaProcedimento  implements java.io.Serializable {
    private java.lang.String medico_unidade_cnes;

    private java.lang.String medico_cpf;

    private int competencia;

    private int quantidade;

    private java.lang.String procedimento_codigo;

    public MedicoExecutaProcedimento() {
    }

    public MedicoExecutaProcedimento(
           java.lang.String medico_unidade_cnes,
           java.lang.String medico_cpf,
           int competencia,
           int quantidade,
           java.lang.String procedimento_codigo) {
           this.medico_unidade_cnes = medico_unidade_cnes;
           this.medico_cpf = medico_cpf;
           this.competencia = competencia;
           this.quantidade = quantidade;
           this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the medico_unidade_cnes value for this MedicoExecutaProcedimento.
     * 
     * @return medico_unidade_cnes
     */
    public java.lang.String getMedico_unidade_cnes() {
        return medico_unidade_cnes;
    }


    /**
     * Sets the medico_unidade_cnes value for this MedicoExecutaProcedimento.
     * 
     * @param medico_unidade_cnes
     */
    public void setMedico_unidade_cnes(java.lang.String medico_unidade_cnes) {
        this.medico_unidade_cnes = medico_unidade_cnes;
    }


    /**
     * Gets the medico_cpf value for this MedicoExecutaProcedimento.
     * 
     * @return medico_cpf
     */
    public java.lang.String getMedico_cpf() {
        return medico_cpf;
    }


    /**
     * Sets the medico_cpf value for this MedicoExecutaProcedimento.
     * 
     * @param medico_cpf
     */
    public void setMedico_cpf(java.lang.String medico_cpf) {
        this.medico_cpf = medico_cpf;
    }


    /**
     * Gets the competencia value for this MedicoExecutaProcedimento.
     * 
     * @return competencia
     */
    public int getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this MedicoExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }


    /**
     * Gets the quantidade value for this MedicoExecutaProcedimento.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this MedicoExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the procedimento_codigo value for this MedicoExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this MedicoExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedicoExecutaProcedimento)) return false;
        MedicoExecutaProcedimento other = (MedicoExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medico_unidade_cnes==null && other.getMedico_unidade_cnes()==null) || 
             (this.medico_unidade_cnes!=null &&
              this.medico_unidade_cnes.equals(other.getMedico_unidade_cnes()))) &&
            ((this.medico_cpf==null && other.getMedico_cpf()==null) || 
             (this.medico_cpf!=null &&
              this.medico_cpf.equals(other.getMedico_cpf()))) &&
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
        if (getMedico_unidade_cnes() != null) {
            _hashCode += getMedico_unidade_cnes().hashCode();
        }
        if (getMedico_cpf() != null) {
            _hashCode += getMedico_cpf().hashCode();
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
        new org.apache.axis.description.TypeDesc(MedicoExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medico_unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medico_unidade_cnes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medico_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medico_cpf"));
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
