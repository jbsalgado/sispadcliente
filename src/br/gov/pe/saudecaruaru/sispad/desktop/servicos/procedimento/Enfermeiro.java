/**
 * Enfermeiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class Enfermeiro  implements java.io.Serializable {
    private java.lang.String unidade_cnes;

    private java.lang.String servidor_cpf;

    private java.lang.String ativo;

    private java.util.Date data_cadastro;

    private java.util.Date data_desativacao;

    public Enfermeiro() {
    }

    public Enfermeiro(
           java.lang.String unidade_cnes,
           java.lang.String servidor_cpf,
           java.lang.String ativo,
           java.util.Date data_cadastro,
           java.util.Date data_desativacao) {
           this.unidade_cnes = unidade_cnes;
           this.servidor_cpf = servidor_cpf;
           this.ativo = ativo;
           this.data_cadastro = data_cadastro;
           this.data_desativacao = data_desativacao;
    }


    /**
     * Gets the unidade_cnes value for this Enfermeiro.
     * 
     * @return unidade_cnes
     */
    public java.lang.String getUnidade_cnes() {
        return unidade_cnes;
    }


    /**
     * Sets the unidade_cnes value for this Enfermeiro.
     * 
     * @param unidade_cnes
     */
    public void setUnidade_cnes(java.lang.String unidade_cnes) {
        this.unidade_cnes = unidade_cnes;
    }


    /**
     * Gets the servidor_cpf value for this Enfermeiro.
     * 
     * @return servidor_cpf
     */
    public java.lang.String getServidor_cpf() {
        return servidor_cpf;
    }


    /**
     * Sets the servidor_cpf value for this Enfermeiro.
     * 
     * @param servidor_cpf
     */
    public void setServidor_cpf(java.lang.String servidor_cpf) {
        this.servidor_cpf = servidor_cpf;
    }


    /**
     * Gets the ativo value for this Enfermeiro.
     * 
     * @return ativo
     */
    public java.lang.String getAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this Enfermeiro.
     * 
     * @param ativo
     */
    public void setAtivo(java.lang.String ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the data_cadastro value for this Enfermeiro.
     * 
     * @return data_cadastro
     */
    public java.util.Date getData_cadastro() {
        return data_cadastro;
    }


    /**
     * Sets the data_cadastro value for this Enfermeiro.
     * 
     * @param data_cadastro
     */
    public void setData_cadastro(java.util.Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }


    /**
     * Gets the data_desativacao value for this Enfermeiro.
     * 
     * @return data_desativacao
     */
    public java.util.Date getData_desativacao() {
        return data_desativacao;
    }


    /**
     * Sets the data_desativacao value for this Enfermeiro.
     * 
     * @param data_desativacao
     */
    public void setData_desativacao(java.util.Date data_desativacao) {
        this.data_desativacao = data_desativacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Enfermeiro)) return false;
        Enfermeiro other = (Enfermeiro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unidade_cnes==null && other.getUnidade_cnes()==null) || 
             (this.unidade_cnes!=null &&
              this.unidade_cnes.equals(other.getUnidade_cnes()))) &&
            ((this.servidor_cpf==null && other.getServidor_cpf()==null) || 
             (this.servidor_cpf!=null &&
              this.servidor_cpf.equals(other.getServidor_cpf()))) &&
            ((this.ativo==null && other.getAtivo()==null) || 
             (this.ativo!=null &&
              this.ativo.equals(other.getAtivo()))) &&
            ((this.data_cadastro==null && other.getData_cadastro()==null) || 
             (this.data_cadastro!=null &&
              this.data_cadastro.equals(other.getData_cadastro()))) &&
            ((this.data_desativacao==null && other.getData_desativacao()==null) || 
             (this.data_desativacao!=null &&
              this.data_desativacao.equals(other.getData_desativacao())));
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
        if (getUnidade_cnes() != null) {
            _hashCode += getUnidade_cnes().hashCode();
        }
        if (getServidor_cpf() != null) {
            _hashCode += getServidor_cpf().hashCode();
        }
        if (getAtivo() != null) {
            _hashCode += getAtivo().hashCode();
        }
        if (getData_cadastro() != null) {
            _hashCode += getData_cadastro().hashCode();
        }
        if (getData_desativacao() != null) {
            _hashCode += getData_desativacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Enfermeiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Enfermeiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidade_cnes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidade_cnes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servidor_cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servidor_cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_cadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_cadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_desativacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_desativacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
