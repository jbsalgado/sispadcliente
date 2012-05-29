/**
 * EquipeExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class EquipeExecutaProcedimento  implements java.io.Serializable {
    private int equipe_codigo_area;

    private int equipe_codigo_micro_area;

    private java.lang.String unidade_cnes;

    private java.lang.String procedimento_codigo;

    private int competencia;

    private int quantidade;

    public EquipeExecutaProcedimento() {
    }

    public EquipeExecutaProcedimento(
           int equipe_codigo_area,
           int equipe_codigo_micro_area,
           java.lang.String unidade_cnes,
           java.lang.String procedimento_codigo,
           int competencia,
           int quantidade) {
           this.equipe_codigo_area = equipe_codigo_area;
           this.equipe_codigo_micro_area = equipe_codigo_micro_area;
           this.unidade_cnes = unidade_cnes;
           this.procedimento_codigo = procedimento_codigo;
           this.competencia = competencia;
           this.quantidade = quantidade;
    }


    /**
     * Gets the equipe_codigo_area value for this EquipeExecutaProcedimento.
     * 
     * @return equipe_codigo_area
     */
    public int getEquipe_codigo_area() {
        return equipe_codigo_area;
    }


    /**
     * Sets the equipe_codigo_area value for this EquipeExecutaProcedimento.
     * 
     * @param equipe_codigo_area
     */
    public void setEquipe_codigo_area(int equipe_codigo_area) {
        this.equipe_codigo_area = equipe_codigo_area;
    }


    /**
     * Gets the equipe_codigo_micro_area value for this EquipeExecutaProcedimento.
     * 
     * @return equipe_codigo_micro_area
     */
    public int getEquipe_codigo_micro_area() {
        return equipe_codigo_micro_area;
    }


    /**
     * Sets the equipe_codigo_micro_area value for this EquipeExecutaProcedimento.
     * 
     * @param equipe_codigo_micro_area
     */
    public void setEquipe_codigo_micro_area(int equipe_codigo_micro_area) {
        this.equipe_codigo_micro_area = equipe_codigo_micro_area;
    }


    /**
     * Gets the unidade_cnes value for this EquipeExecutaProcedimento.
     * 
     * @return unidade_cnes
     */
    public java.lang.String getUnidade_cnes() {
        return unidade_cnes;
    }


    /**
     * Sets the unidade_cnes value for this EquipeExecutaProcedimento.
     * 
     * @param unidade_cnes
     */
    public void setUnidade_cnes(java.lang.String unidade_cnes) {
        this.unidade_cnes = unidade_cnes;
    }


    /**
     * Gets the procedimento_codigo value for this EquipeExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this EquipeExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the competencia value for this EquipeExecutaProcedimento.
     * 
     * @return competencia
     */
    public int getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this EquipeExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }


    /**
     * Gets the quantidade value for this EquipeExecutaProcedimento.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this EquipeExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquipeExecutaProcedimento)) return false;
        EquipeExecutaProcedimento other = (EquipeExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.equipe_codigo_area == other.getEquipe_codigo_area() &&
            this.equipe_codigo_micro_area == other.getEquipe_codigo_micro_area() &&
            ((this.unidade_cnes==null && other.getUnidade_cnes()==null) || 
             (this.unidade_cnes!=null &&
              this.unidade_cnes.equals(other.getUnidade_cnes()))) &&
            ((this.procedimento_codigo==null && other.getProcedimento_codigo()==null) || 
             (this.procedimento_codigo!=null &&
              this.procedimento_codigo.equals(other.getProcedimento_codigo()))) &&
            this.competencia == other.getCompetencia() &&
            this.quantidade == other.getQuantidade();
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
        _hashCode += getEquipe_codigo_area();
        _hashCode += getEquipe_codigo_micro_area();
        if (getUnidade_cnes() != null) {
            _hashCode += getUnidade_cnes().hashCode();
        }
        if (getProcedimento_codigo() != null) {
            _hashCode += getProcedimento_codigo().hashCode();
        }
        _hashCode += getCompetencia();
        _hashCode += getQuantidade();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquipeExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EquipeExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipe_codigo_area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipe_codigo_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipe_codigo_micro_area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipe_codigo_micro_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidade_cnes"));
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
