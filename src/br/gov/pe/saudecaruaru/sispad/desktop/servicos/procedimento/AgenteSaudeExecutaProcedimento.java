/**
 * AgenteSaudeExecutaProcedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class AgenteSaudeExecutaProcedimento  implements java.io.Serializable {
    private java.lang.String agente_saude_unidade_cnes;

    private java.lang.String agente_saude_cpf;

    private int competencia;

    private int quantidade;

    private java.lang.String procedimento_codigo;

    private int agente_saude_micro_area;

    public AgenteSaudeExecutaProcedimento() {
    }

    public AgenteSaudeExecutaProcedimento(
           java.lang.String agente_saude_unidade_cnes,
           java.lang.String agente_saude_cpf,
           int competencia,
           int quantidade,
           java.lang.String procedimento_codigo,
           int agente_saude_micro_area) {
           this.agente_saude_unidade_cnes = agente_saude_unidade_cnes;
           this.agente_saude_cpf = agente_saude_cpf;
           this.competencia = competencia;
           this.quantidade = quantidade;
           this.procedimento_codigo = procedimento_codigo;
           this.agente_saude_micro_area = agente_saude_micro_area;
    }


    /**
     * Gets the agente_saude_unidade_cnes value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return agente_saude_unidade_cnes
     */
    public java.lang.String getAgente_saude_unidade_cnes() {
        return agente_saude_unidade_cnes;
    }


    /**
     * Sets the agente_saude_unidade_cnes value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param agente_saude_unidade_cnes
     */
    public void setAgente_saude_unidade_cnes(java.lang.String agente_saude_unidade_cnes) {
        this.agente_saude_unidade_cnes = agente_saude_unidade_cnes;
    }


    /**
     * Gets the agente_saude_cpf value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return agente_saude_cpf
     */
    public java.lang.String getAgente_saude_cpf() {
        return agente_saude_cpf;
    }


    /**
     * Sets the agente_saude_cpf value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param agente_saude_cpf
     */
    public void setAgente_saude_cpf(java.lang.String agente_saude_cpf) {
        this.agente_saude_cpf = agente_saude_cpf;
    }


    /**
     * Gets the competencia value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return competencia
     */
    public int getCompetencia() {
        return competencia;
    }


    /**
     * Sets the competencia value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param competencia
     */
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }


    /**
     * Gets the quantidade value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the procedimento_codigo value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return procedimento_codigo
     */
    public java.lang.String getProcedimento_codigo() {
        return procedimento_codigo;
    }


    /**
     * Sets the procedimento_codigo value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param procedimento_codigo
     */
    public void setProcedimento_codigo(java.lang.String procedimento_codigo) {
        this.procedimento_codigo = procedimento_codigo;
    }


    /**
     * Gets the agente_saude_micro_area value for this AgenteSaudeExecutaProcedimento.
     * 
     * @return agente_saude_micro_area
     */
    public int getAgente_saude_micro_area() {
        return agente_saude_micro_area;
    }


    /**
     * Sets the agente_saude_micro_area value for this AgenteSaudeExecutaProcedimento.
     * 
     * @param agente_saude_micro_area
     */
    public void setAgente_saude_micro_area(int agente_saude_micro_area) {
        this.agente_saude_micro_area = agente_saude_micro_area;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgenteSaudeExecutaProcedimento)) return false;
        AgenteSaudeExecutaProcedimento other = (AgenteSaudeExecutaProcedimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agente_saude_unidade_cnes==null && other.getAgente_saude_unidade_cnes()==null) || 
             (this.agente_saude_unidade_cnes!=null &&
              this.agente_saude_unidade_cnes.equals(other.getAgente_saude_unidade_cnes()))) &&
            ((this.agente_saude_cpf==null && other.getAgente_saude_cpf()==null) || 
             (this.agente_saude_cpf!=null &&
              this.agente_saude_cpf.equals(other.getAgente_saude_cpf()))) &&
            this.competencia == other.getCompetencia() &&
            this.quantidade == other.getQuantidade() &&
            ((this.procedimento_codigo==null && other.getProcedimento_codigo()==null) || 
             (this.procedimento_codigo!=null &&
              this.procedimento_codigo.equals(other.getProcedimento_codigo()))) &&
            this.agente_saude_micro_area == other.getAgente_saude_micro_area();
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
        if (getAgente_saude_unidade_cnes() != null) {
            _hashCode += getAgente_saude_unidade_cnes().hashCode();
        }
        if (getAgente_saude_cpf() != null) {
            _hashCode += getAgente_saude_cpf().hashCode();
        }
        _hashCode += getCompetencia();
        _hashCode += getQuantidade();
        if (getProcedimento_codigo() != null) {
            _hashCode += getProcedimento_codigo().hashCode();
        }
        _hashCode += getAgente_saude_micro_area();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgenteSaudeExecutaProcedimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeExecutaProcedimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agente_saude_unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agente_saude_unidade_cnes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agente_saude_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agente_saude_cpf"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agente_saude_micro_area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agente_saude_micro_area"));
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
