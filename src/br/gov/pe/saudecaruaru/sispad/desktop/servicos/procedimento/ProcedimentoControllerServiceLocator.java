/**
 * ProcedimentoControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class ProcedimentoControllerServiceLocator extends org.apache.axis.client.Service implements br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerService {

    public ProcedimentoControllerServiceLocator() {
    }


    public ProcedimentoControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcedimentoControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcedimentoControllerPort
    private java.lang.String ProcedimentoControllerPort_address = "http://localhost/sispad/index.php?r=procedimento/service&ws=1";

    public java.lang.String getProcedimentoControllerPortAddress() {
        return ProcedimentoControllerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcedimentoControllerPortWSDDServiceName = "ProcedimentoControllerPort";

    public java.lang.String getProcedimentoControllerPortWSDDServiceName() {
        return ProcedimentoControllerPortWSDDServiceName;
    }

    public void setProcedimentoControllerPortWSDDServiceName(java.lang.String name) {
        ProcedimentoControllerPortWSDDServiceName = name;
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType getProcedimentoControllerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcedimentoControllerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcedimentoControllerPort(endpoint);
    }

    public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType getProcedimentoControllerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerBindingStub _stub = new br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerBindingStub(portAddress, this);
            _stub.setPortName(getProcedimentoControllerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcedimentoControllerPortEndpointAddress(java.lang.String address) {
        ProcedimentoControllerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerBindingStub _stub = new br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerBindingStub(new java.net.URL(ProcedimentoControllerPort_address), this);
                _stub.setPortName(getProcedimentoControllerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProcedimentoControllerPort".equals(inputPortName)) {
            return getProcedimentoControllerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ProcedimentoControllerwsdl", "ProcedimentoControllerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcedimentoControllerPort".equals(portName)) {
            setProcedimentoControllerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
