package br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento;

public class ProcedimentoControllerPortTypeProxy implements br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType {
  private String _endpoint = null;
  private br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType procedimentoControllerPortType = null;
  
  public ProcedimentoControllerPortTypeProxy() {
    _initProcedimentoControllerPortTypeProxy();
  }
  
  public ProcedimentoControllerPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initProcedimentoControllerPortTypeProxy();
  }
  
  private void _initProcedimentoControllerPortTypeProxy() {
    try {
      procedimentoControllerPortType = (new br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerServiceLocator()).getProcedimentoControllerPort();
      if (procedimentoControllerPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)procedimentoControllerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)procedimentoControllerPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (procedimentoControllerPortType != null)
      ((javax.xml.rpc.Stub)procedimentoControllerPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ProcedimentoControllerPortType getProcedimentoControllerPortType() {
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType;
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] getLastMessages(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getLastMessages(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] login(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.login(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] logout(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.logout(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Medico[] getMedicos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getMedicos(codigoUnidade, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosAEnviarSIAB(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeMedicoAEnviarSIAB(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeEnfermeiroAEnviarSIAB(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeOdontologoAEnviarSIAB(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIAB(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeAgenteSaudeAEnviarSIAB(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosAEnviarSIA(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeMedicoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeMedicoAEnviarSIA(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeEnfermeiroAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeEnfermeiroAEnviarSIA(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeOdontologoAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeOdontologoAEnviarSIA(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Procedimento[] getProcedimentosDeAgenteSaudeAEnviarSIA(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getProcedimentosDeAgenteSaudeAEnviarSIA(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] getUnidades(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getUnidades(usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] validarUnidades(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Unidade[] unidades) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.validarUnidades(usuarioDesktop, unidades);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaude[] getAgenteSaude(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getAgenteSaude(codigoUnidade, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Odontologo[] getOdontologos(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getOdontologos(codigoUnidade, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.Enfermeiro[] getEnfermeiros(java.lang.String codigoUnidade, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.getEnfermeiros(codigoUnidade, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorServidor(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.ServidorExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorServidor(procedimentosExecutados, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEquipe(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EquipeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorEquipe(procedimentosExecutados, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorMedico(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MedicoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorMedico(procedimentosExecutados, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorEnfermeiro(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.EnfermeiroExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorEnfermeiro(procedimentosExecutados, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorOdontologo(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.OdontologoExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorOdontologo(procedimentosExecutados, usuarioDesktop);
  }
  
  public br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.MessageWebService[] sendExecutadosPorAgenteSaude(br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.AgenteSaudeExecutaProcedimento[] procedimentosExecutados, br.gov.pe.saudecaruaru.sispad.desktop.servicos.procedimento.UsuarioDesktop usuarioDesktop) throws java.rmi.RemoteException{
    if (procedimentoControllerPortType == null)
      _initProcedimentoControllerPortTypeProxy();
    return procedimentoControllerPortType.sendExecutadosPorAgenteSaude(procedimentosExecutados, usuarioDesktop);
  }
  
  
}