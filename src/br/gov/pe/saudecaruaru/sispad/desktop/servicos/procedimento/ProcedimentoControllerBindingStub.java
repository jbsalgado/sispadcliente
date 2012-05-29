/**
 * ProcedimentoControllerBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class ProcedimentoControllerBindingStub extends org.apache.axis.client.Stub implements br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[25];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMedicos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUnidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosAEnviarSIAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeMedicoAEnviarSIAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeEnfermeiroAEnviarSIAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeOdontologoAEnviarSIAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeAgenteSaudeAEnviarSIAB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosAEnviarSIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeMedicoAEnviarSIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeEnfermeiroAEnviarSIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeOdontologoAEnviarSIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProcedimentosDeAgenteSaudeAEnviarSIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnidades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UnidadeArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarUnidades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unidades"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UnidadeArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAgenteSaude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUnidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOdontologos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUnidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnfermeiros");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoUnidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorServidor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ServidorExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorEquipe");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EquipeExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorMedico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorEnfermeiro");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorOdontologo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendExecutadosPorAgenteSaude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procedimentosExecutados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeExecutaProcedimentoArray"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuarioDesktop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop"), br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray"));
        oper.setReturnClass(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

    }

    public ProcedimentoControllerBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProcedimentoControllerBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProcedimentoControllerBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaude");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaude");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "AgenteSaudeExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Enfermeiro");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Enfermeiro");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EnfermeiroExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EquipeExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EquipeExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "EquipeExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Medico");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Medico");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MedicoExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebService");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebServiceArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "MessageWebService");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Odontologo");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Odontologo");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "OdontologoExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Procedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Procedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ServidorExecutaProcedimento");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ServidorExecutaProcedimentoArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ServidorExecutaProcedimento");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Unidade");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UnidadeArray");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "Unidade");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "UsuarioDesktop");
            cachedSerQNames.add(qName);
            cls = br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] getLastMessages(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getLastMessages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getLastMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] login(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] logout(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#logout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[] getMedicos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getMedicos");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getMedicos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUnidade, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosAEnviarSIAB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosAEnviarSIAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeMedicoAEnviarSIAB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeMedicoAEnviarSIAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeEnfermeiroAEnviarSIAB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeEnfermeiroAEnviarSIAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeOdontologoAEnviarSIAB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeOdontologoAEnviarSIAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeAgenteSaudeAEnviarSIAB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeAgenteSaudeAEnviarSIAB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosAEnviarSIA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosAEnviarSIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeMedicoAEnviarSIA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeMedicoAEnviarSIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeEnfermeiroAEnviarSIA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeEnfermeiroAEnviarSIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeOdontologoAEnviarSIA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeOdontologoAEnviarSIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getProcedimentosDeAgenteSaudeAEnviarSIA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getProcedimentosDeAgenteSaudeAEnviarSIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] getUnidades(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getUnidades");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getUnidades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] validarUnidades(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] unidades) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#validarUnidades");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "validarUnidades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {usuarioDesktop, unidades});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[] getAgenteSaude(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getAgenteSaude");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getAgenteSaude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUnidade, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[] getOdontologos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getOdontologos");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getOdontologos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUnidade, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[] getEnfermeiros(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#getEnfermeiros");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "getEnfermeiros"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUnidade, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorServidor(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorServidor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorServidor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEquipe(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorEquipe");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorEquipe"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorMedico(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorMedico");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorMedico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEnfermeiro(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorEnfermeiro");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorEnfermeiro"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorOdontologo(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorOdontologo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorOdontologo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorAgenteSaude(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:ProcedimentoControllerwsdl#sendExecutadosPorAgenteSaude");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "sendExecutadosPorAgenteSaude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {procedimentosExecutados, usuarioDesktop});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
